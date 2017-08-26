package com.example.ashwin.kotlinwebviewdemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        startButton.setOnClickListener {
            startWebView()
        }

        googleButton.setOnClickListener {
            googleWebView()
        }
    }

    private fun startWebView() {
        val intent = Intent(this@MainActivity, WebActivity::class.java)
        intent.putExtra("url", "file:///android_asset/index.html")
        startActivity(intent)
    }

    private fun googleWebView() {
        val intent = Intent(this@MainActivity, WebActivity::class.java)
        intent.putExtra("url", "https://www.google.com")
        startActivity(intent)
    }

}
