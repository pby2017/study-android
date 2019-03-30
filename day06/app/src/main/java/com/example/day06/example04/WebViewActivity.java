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

    private EditText urlEditText;
    private Button goButton;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_go:
                webView.loadUrl(urlEditText.getText().toString());
                break;
        }
    }

    private void initView() {
        urlEditText = findViewById(R.id.edit_text_url);
        goButton = findViewById(R.id.button_go);
        goButton.setOnClickListener(this);

        webView = findViewById(R.id.web_view);
        webView.setWebViewClient(new MyWebViewClient());
        WebSettings webSettings = webView.getSettings();
        ((WebSettings) webSettings).setBuiltInZoomControls(true);
    }

    class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
