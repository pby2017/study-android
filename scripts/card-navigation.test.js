const assert = require('node:assert/strict');
const fs = require('node:fs');
const path = require('node:path');
const test = require('node:test');
const vm = require('node:vm');

const page = fs.readFileSync(path.join(__dirname, '..', 'index.html'), 'utf8');
const script = page.match(/<script>([\s\S]*?)<\/script>/)?.[1];
assert.ok(script, 'index.html must contain the card navigation script');

class ClassList {
  constructor(...initial) { this.values = new Set(initial); }
  add(value) { this.values.add(value); }
  remove(value) { this.values.delete(value); }
  toggle(value, force) {
    if (force === undefined) force = !this.values.has(value);
    force ? this.add(value) : this.remove(value);
    return force;
  }
  contains(value) { return this.values.has(value); }
}

class Element {
  constructor(dataset = {}) {
    this.dataset = dataset;
    this.hidden = false;
    this.attributes = {};
    this.listeners = {};
    this.classList = new ClassList();
    this.textContent = '';
  }
  setAttribute(name, value) { this.attributes[name] = value; }
  addEventListener(name, listener) { this.listeners[name] = listener; }
  click() { this.listeners.click?.({ target: this }); }
}

function runPage({ hash = '', random = 0 } = {}) {
  const cards = [
    new Element({ cat: 'kotlin', idx: '1' }),
    new Element({ cat: 'kotlin', idx: '2' }),
    new Element({ cat: 'android', idx: '3' }),
    new Element({ cat: 'android', idx: '4' }),
    new Element({ cat: 'ai', idx: '5' }),
  ];
  const chips = ['all', 'kotlin', 'android', 'ai'].map((cat) => {
    const chip = new Element({ cat });
    if (cat === 'all') chip.classList.add('active');
    return chip;
  });
  const navButtons = ['previous', 'random', 'next'].map((move) => new Element({ move }));
  const position = new Element();
  const document = {
    querySelector: () => new Element(),
    querySelectorAll(selector) {
      return selector === '.chip' ? chips : selector === '.card' ? cards : navButtons;
    },
    addEventListener() {},
  };
  const window = { location: { hash } };
  const context = {
    document,
    window,
    history: { replaceState(_state, _title, nextHash) { window.location.hash = nextHash; } },
    Math: Object.create(Math),
  };
  context.Math.random = () => random;
  // The page stores the position element separately from selector collections.
  document.querySelector = (selector) => selector === '.card-position' ? position : new Element();
  vm.runInNewContext(script, context, { filename: 'index.html inline script' });
  return { cards, chips, navButtons, position, window };
}

function visibleCards(cards) { return cards.filter((card) => !card.hidden); }

test('first visit selects a random card and shows exactly one card', () => {
  const page = runPage({ random: 0.61 });
  assert.deepEqual(visibleCards(page.cards).map((card) => card.dataset.idx), ['4']);
  assert.equal(page.position.textContent, '4 / 5');
});

test('previous and next navigate in order and wrap at the ends', () => {
  const page = runPage();
  page.navButtons[2].click();
  assert.deepEqual(visibleCards(page.cards).map((card) => card.dataset.idx), ['2']);
  page.navButtons[0].click();
  assert.deepEqual(visibleCards(page.cards).map((card) => card.dataset.idx), ['1']);
  page.navButtons[0].click();
  assert.deepEqual(visibleCards(page.cards).map((card) => card.dataset.idx), ['5']);
});

test('quick filter pins navigation to the selected category', () => {
  const page = runPage();
  page.chips[2].click(); // Android
  assert.deepEqual(visibleCards(page.cards).map((card) => card.dataset.idx), ['3']);
  page.navButtons[2].click();
  assert.deepEqual(visibleCards(page.cards).map((card) => card.dataset.idx), ['4']);
  page.navButtons[2].click();
  assert.deepEqual(visibleCards(page.cards).map((card) => card.dataset.idx), ['3']);
  assert.equal(page.position.textContent, '1 / 2');
});

test('random navigation stays within the active category and changes the card', () => {
  const page = runPage({ random: 0.99 });
  page.chips[2].click();
  page.navButtons[1].click();
  assert.deepEqual(visibleCards(page.cards).map((card) => card.dataset.idx), ['4']);
});

test('a valid deep link restores category and card position', () => {
  const page = runPage({ hash: '#android/4' });
  assert.deepEqual(visibleCards(page.cards).map((card) => card.dataset.idx), ['4']);
  assert.equal(page.chips[2].classList.contains('active'), true);
  assert.equal(page.position.textContent, '2 / 2');
});
