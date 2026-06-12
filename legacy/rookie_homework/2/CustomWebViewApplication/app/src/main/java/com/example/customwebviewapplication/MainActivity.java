package com.example.customwebviewapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CustomJavaScriptListener, View.OnClickListener {

    private final String INDEX_HTML = "file:///android_asset/index.html";

    private WebView webView;
    private EditText anythingEditText;
    private Button sendButton;
    private TextView inAppText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        webView.loadUrl(INDEX_HTML);
    }

    @Override
    public void onSetTextInApp(String text) {
        inAppText.setText(text);
    }

    @Override
    public void onChangeWebView(String url) {
        final String changeWebViewUrl = url;
        webView.post(new Runnable() {
            @Override
            public void run() {
                webView.loadUrl(changeWebViewUrl);
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webView.canGoBack()) {
                        webView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_send:
                String text = anythingEditText.getText().toString();
                String javaScriptFunction = "javascript:setTextInWeb('" + text + "')";
                webView.loadUrl(javaScriptFunction);
                break;
        }
    }

    private void initView() {
        webView = findViewById(R.id.web_view);
        webView.setWebViewClient(new MyWebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        CustomJavaScript customJavaScript = new CustomJavaScript(this);
        webView.addJavascriptInterface(customJavaScript, "Android");

        anythingEditText = findViewById(R.id.edit_text_anything);
        sendButton = findViewById(R.id.button_send);
        sendButton.setOnClickListener(this);
        inAppText = findViewById(R.id.text_in_app);
    }

    static class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}