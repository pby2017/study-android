package com.example.customwebviewapplication;

interface CustomJavaScriptListener {
    void onSetTextInApp(String text);

    void onChangeWebView(String url);
}
