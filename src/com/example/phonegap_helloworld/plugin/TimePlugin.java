package com.example.phonegap_helloworld.plugin;

import java.util.Date;

import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;

public class TimePlugin extends Plugin {

  @Override
  public PluginResult execute(String action, JSONArray args, String callbackId) {
    if ("now".equals(action)) {
      String now = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
      return new PluginResult(PluginResult.Status.OK, now);
    }

    return new PluginResult(PluginResult.Status.INVALID_ACTION);
  }
}
