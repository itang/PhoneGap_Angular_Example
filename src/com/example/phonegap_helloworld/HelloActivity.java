package com.example.phonegap_helloworld;

import org.apache.cordova.DroidGap;

import android.content.Intent;
import android.os.Bundle;

public class HelloActivity extends DroidGap {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // setContentView(R.layout.activity_main);
    super.loadUrl("file:///android_asset/www/hello.html");

    // WebView
    // 向js暴露 java对象
    this.appView.addJavascriptInterface(this, "driod_contenxt");
  }

  // js调用， 点击链接 转向todo Activity
  public void toTodoActivity() {
    Intent intent = new Intent(this, TodoActivity.class);
    this.startActivity(intent);
  }
}
