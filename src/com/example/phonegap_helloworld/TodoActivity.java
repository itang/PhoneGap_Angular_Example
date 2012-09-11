package com.example.phonegap_helloworld;

import org.apache.cordova.DroidGap;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class TodoActivity extends DroidGap {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Intent intent = this.getIntent();
    if (intent.getExtras() != null) {
      String msg = intent.getExtras().getString("msg");
      Log.v(TodoActivity.class.getSimpleName(), "来自hello的消息" + msg);
    }
    super.loadUrl("file:///android_asset/www/todo.html");
  }
}
