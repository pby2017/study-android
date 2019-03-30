package com.example.day06.example04;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import com.example.day06.R;

public class WebViewActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextUrl;
    private Button buttonGo;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        initView();

        webView.setWebViewClient(new MyWebViewClient());

        WebSettings webSettings = webView.getSettings();
        ((WebSettings) webSettings).setBuiltInZoomControls(true);
    }

    private void initView() {
        editTextUrl = findViewById(R.id.edit_text_url);
        buttonGo = findViewById(R.id.button_go);
        buttonGo.setOnClickListener(this);
        webView = findViewById(R.id.web_view);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_go:
                webView.loadUrl(editTextUrl.getText().toString());
                break;
        }
    }

    class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
