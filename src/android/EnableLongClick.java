package com.example.enablelongclick;

import org.apache.cordova.*;
import android.webkit.WebView;
import android.util.Log;

public class EnableLongClick extends CordovaPlugin {
    @Override
    protected void pluginInitialize() {
        cordova.getActivity().runOnUiThread(() -> {
            WebView webView = (WebView) this.webView.getView();
            webView.setLongClickable(true);
            webView.setHapticFeedbackEnabled(true);
            Log.d("EnableLongClick", "WebView 長按已啟用");
        });
    }
}
