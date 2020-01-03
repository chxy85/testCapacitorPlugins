package com.xxxx.xxxx;

import android.widget.Toast;
import android.util.Log;
import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

import com.tencent.mm.opensdk.constants.Build;
import com.tencent.mm.opensdk.modelpay.JumpToOfflinePay;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

@NativePlugin()
public class MyPlugin extends Plugin {
    private IWXAPI api;
    private static final String TAG = "MyPlugin";

    @PluginMethod()
    public void echo(PluginCall call) {
        Log.e("WxLoginPlugin","-------------------------======echo:");


        Toast toast=Toast.makeText(getContext(),"Toast提示消息1111111",Toast.LENGTH_SHORT    );
        toast.show();

         String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", value);
        call.success(ret);
    }

    @PluginMethod()
    public void loginToWx(PluginCall call) {
        Log.e("WxLoginPlugin","-------------------------======loginToWx:");
        //请求响应权限'
        api.registerApp("wx7cc21f33633fa22f");
    }
}
