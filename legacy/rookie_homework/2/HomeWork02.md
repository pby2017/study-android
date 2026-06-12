```
이번주 과제입니다.
1. ScrollView와 NestedScrollView에 대해서 비교하여 조사하시오.
https://developer.android.com/reference/android/widget/ScrollView
https://developer.android.com/reference/android/support/v4/widget/NestedScrollView

2. 안드로이드 앱과 웹페이지가 서로 통신하는 방법을 조사하고, 간단한 Sample 앱을 작성하시오.
https://developer.android.com/guide/webapps/webview#BindingJavaScript
ex) NAVER - 다른 브라우저로 열기, KAKAO - 공유하기, 전화걸기

3. 다음과 같은 디자인을 갖는 나만의 Custom Dialog Class를 작성하시오.
(새로운 화면으로 이동하는 Button, Dialog를 닫는 Button, 앱을 재시작하더라도 일정 시간 동안 Dialog를 보여주지 않게 하는 CheckBox를 포함하여야 함, DialogFragment.Class를 상속할 것)
https://developer.android.com/guide/topics/ui/dialogs
```
# WebView란?
## 내장된 웹 브라우저를 통해 웹 페이지를 보여주는 뷰(View)
* 액티비티 레이아웃 (Acitivity layout)의 일부분에 웹 콘텐츠를 보여줌
* '브라우저에 인텐트를 전달하는 방법'과 'WebView에서 웹 콘텐츠를 load하는 방법'이 있음
  * 익스플로러, 크롬, 사파리 등의 브라우저와 달리 뒤로 가기와 같은 navigation 컨트롤 및 주소 입력 창 등 몇몇 기능이 빠졌음
  * end-user 약관 동의나 user guide 등 직접 업데이트 해야 하는 정보를 사용자에게 제공해야 할 때 WebView를 사용하면 유용함
# 안드로이드 앱과 웹페이지가 서로 통신하는 방법
## Javascript Interface
* 안드로이드 앱과 웹 페이지 사이에 인터페이스를 정의함
* 위 인터페이스는 웹 페이지의 Javascript에서 안드로이드 앱의 API를 호출할 수 있게 함
* Javascript Interface가 생성된 스레드가 아닌 다른 스레드에서 동작함
* 사용 방법
  * 아래 안드로이드 버전에서 Javascript Interface 클래스 내 호출할 모든 메소드는
  어노테이션 (@JavascriptInterface)을 붙여야하고,
  public 제한자로 선언해야 함
    > JELLY_BEAN_MR1 버전 이상  
    > = Android 4.2 버전 이상  
    > = SDK version 17 이상
  * 아래 메소드를 사용해서 WebView 객체에 Javascript Interface 클래스를 추가해야 함
    * addJavascriptInterface (Object object, String name)
    * Main frame (WebView 화면)의 Javascript context에 name이라는 이름을 가진 Javascript Interface 객체가 추가됨
    * Javascript에서 Javascript Interface 객체의 이름과 메소드명으로 메소드에 접근할 수 있게 함
## Interface 호출 과정
### 1. Internet 접근 권한 요구 추가
> Android  
> AndroidManifest.xml
```xml
<manifest ... >
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```
### 2. WebView 객체 불러옴
> Android  
> MainActivity.java
```java
WebView webView = findViewById(R.id.web_view);
```
### 3. WebView에서 Javascript를 실행할 수 있도록 설정
> Android  
> MainActivity.java
```java
WebSettings webSettings = webView.getSettings();
webSettings.setJavaScriptEnabled(true); // default : false
```
### 4. Javascript에서 실행할 메소드를 정의함
> Android  
> WebAppInterface.java
```java
public class WebAppInterface {
    Context context;

    public WebAppInterface(Context context) {
        this.context = context;
    }

    @JavascriptInterface
    public void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
```
### @JavascriptInterface
> Android  
> JavascriptInterface.java
* implements Annotation
* 위 어노테이션은 메소드를 JavaScript에서 접근할 수 있게 함
* JELLY_BEAN_MR1 above = targetSdkVersion 17
### 5. Javascript Interface object를 WebView의 javascript에 추가함
> Android  
> MainActivity.java
> * public void addJavascriptInterface (Object object, String name)
* name이라는 이름을 가진 Javascript Interface object를 WebView 화면의 Javascript context에 포함시킴
* Javascript에서 Javascript Interface object의 메소드에 접근할 수 있게 함
* @JavascriptInterface 어노테이션이 붙은 메소드에만 접근할 수 있음
```java
webView.addJavascriptInterface(new WebAppInterface(this), "ObjectName");
```
### 6. WebView에서 보여줄 Html 파일의 Javascript 코드를 정의함
> Html  
> index.html  
> Javascript
* Javascript Interface object의 이름과 메소드 호출로 안드로이드 앱 이벤트 호출 메소드에 접근함
* = WebView가 자동으로 Javascript에서 interface를 만들어줌
```html
<script type="text/javascript">
    function doAndroidSearch() {
        var query = document.getElementById("search_input").value;
        hello.showToast(query);
    }
</script>
```
## WebViewClient
* 웹 페이지 로딩, 업데이트, 오류 등이 발생할 경우 호출되는 메소드를 포함함
* boolean shouldOverrideUrlLoading (WebView view, WebResourceRequest request)
  * WebView에서 URL이 load 될 때 호출되며 app에게 웹브라우저 선택 기회를 줌
  * WebViewClient 설정이 되어있지 않으면 default 값으로 인해 URL을 처리할 적합한 Activity Manager를 선택하라는 메시지가 표시됨
  * return false : WebView에서 로딩
  * return true : WebView가 로딩을 취소함
* 특정 웹 페이지만 WebView로 로딩하고, 나머지 웹 페이지는 기존 웹브라우저로 로딩하는 방법에 사용될 수 있음
  * WebView를 사용할 경우 Javascript Interface를 통해서 웹 페이지의 Javascript로 App을 제어할 수 있음
  * 따라서 신뢰하지 못하는 페이지는 WebView가 아닌 기존 웹브라우저로 로딩하는게 좋음
# 출처
1. [developer.android.com/guide - WebView#BindingJavaScript](https://developer.android.com/guide/webapps/webview#BindingJavaScript)
2. [developer.android.com/guide - assets resource folder](https://developer.android.com/guide/topics/resources/providing-resources?hl=ko)
3. [developer.android.com/reference - WebView](https://developer.android.com/reference/android/webkit/WebView.html)
4. [developer.android.com/reference - JavascriptInterface 안드로이드 버전](JavascriptInterface)
5. [developer.android.com/reference - setJavaScriptEnabled(true)](https://developer.android.com/reference/android/webkit/WebSettings.html#setJavaScriptEnabled(boolean))
6.  [사용사례 - 이용약관, 개인정보 취급방침](http://www.masterqna.com/android/29515/이용약관-개인정보-취급방침-페이지를-만드는-중-질문입니다)
7.  [사용사례 - 카카오 링크](https://devtalk.kakao.com/t/topic/1829)
8.  [사용사례 - 회원가입](https://devtalk.kakao.com/t/webview/14382/2)
9.  [사용사례 - 로그인 상태로 웹뷰 띄우기](https://www.androidpub.com/966508)
10. [[번역] 안드로이드 WebView 를 커스텀하기 -1-|작성자 휴우](http://webcache.googleusercontent.com/search?q=cache:sV8O76NoJIkJ:blog.naver.com/PostView.nhn%3FblogId%3Dhuewu%26logNo%3D110156780800+&cd=3&hl=ko&ct=clnk&gl=kr)
11. [Webview load html from assets directory](https://stackoverflow.com/q/3152422)
12. [interface 패키지 naming](https://androiddhamu.blogspot.com/2012/03/android-naming-convention-tips.html)
13. [App에서 WebView의 javascript 함수 호출하기](https://biig.tistory.com/59)
14. [App에서 WebView의 javascript 함수 호출하기](https://louet.tistory.com/91)
15. [App에서 WebView의 javascript 함수 호출하기](https://indra17.tistory.com/entry/android-webview로-javascript-호출-및-이벤트-받기)
16. [Javascript context 의미](https://incn.tistory.com/90)
17. [앱과 WebView의 통신 구현](https://thdev.tech/androiddev/2016/08/11/Android-WebView-JavascriptInterface-Example/)
18. [shouldOverrideUrlLoading()](https://stackoverflow.com/questions/9961408/android-webview-loadurl-with-query-params)
19. [WebView 크로스 쓰래드 에러](https://blog.danggun.net/3334)
20. [WebView back button](https://stackoverflow.com/a/6077173)
21. [브라우저 대신 WebView로 웹페이지 보여주기 - shouldOverrideUrlLoading](https://cofs.tistory.com/186)