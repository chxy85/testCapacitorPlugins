package com.xxxx.xxxx;

import android.widget.Toast;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin()
public class MyPlugin extends Plugin {

    @PluginMethod()
    public void echo(PluginCall call) {
        Toast toast=Toast.makeText(getContext(),"Toast提示消息",Toast.LENGTH_SHORT    );
        toast.show();

         String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", value);
        call.success(ret);
    }
}
