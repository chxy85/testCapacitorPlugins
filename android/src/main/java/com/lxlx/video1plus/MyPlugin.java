package com.lxlx.video1plus;

import android.widget.Toast;
import android.util.Log;
import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

import com.tencent.mm.opensdk.constants.Build;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.modelpay.JumpToOfflinePay;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;


@NativePlugin()
public class MyPlugin extends Plugin {
    private IWXAPI api;
    private static final String TAG = "MyPlugin";

    @PluginMethod()
    public void echo(PluginCall call) {
        Log.e("WxLoginPlugin","-------------------------======echo1:");


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
        api = WXAPIFactory.createWXAPI(getContext(), "wx7cc21f33633fa22f", false);

        api.registerApp("wx7cc21f33633fa22f");

        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "wechat_sdk_demo_test";
        api.sendReq(req);
    }
}
