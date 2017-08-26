package com.example.ashwin.kotlinwebviewdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {

    var url: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        url = intent.getStringExtra("url")

        initViews()
    }

    private fun initViews() {
        webview.settings.setBuiltInZoomControls(false)
        webview.settings.setJavaScriptEnabled(true)
        webview.loadUrl(url)
    }

    override fun onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack()
        } else {
            finish()
        }
    }

}
