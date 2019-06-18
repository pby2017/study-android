package com.example.customwebviewapplication;

import android.webkit.JavascriptInterface;

public class CustomJavaScript {

    private CustomJavaScriptListener listener;

    public CustomJavaScript(CustomJavaScriptListener listener) {
        this.listener = listener;
    }

    @JavascriptInterface
    public void setTextInApp(String text) {
        if (listener != null) {
            listener.onSetTextInApp(text);
        }
    }

    @JavascriptInterface
    public void changeWebView(String url) {
        listener.onChangeWebView(url);
    }
}
