package com.ryfsystems.myapplicationfira;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class Webviewfullscreen extends Activity {

    WebView webview;
    LinearLayout webViewPlaceholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewfullscreen);
        webViewPlaceholder= findViewById(R.id.webViewholder);
        webview = findViewById(R.id.webView1);
        webViewDisplay(webview);
    }

    private void webViewDisplay(final WebView webView) {
        new Handler().post(() -> {

            WebSettings settings = webView.getSettings();

            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setMinimumFontSize(10);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            webView.setVerticalScrollBarEnabled(false);
            webView.loadUrl("file:///android_asset/index.html");
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        webViewPlaceholder.removeView(webview);
        webview.loadUrl("");
        webview.removeAllViews();
        webview.destroy();

        webview = null;
        finish();
    }

}