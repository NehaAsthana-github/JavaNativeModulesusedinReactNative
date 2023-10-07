package com.demoproject1;


import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class MyDemoModules extends ReactContextBaseJavaModule {
    public  MyDemoModules(@Nullable ReactApplicationContext reactContext){
        super(reactContext);
    }
    @NonNull
    @Override
    public String getName() {
        return "MyDemoProject";
    }

    @ReactMethod
public void myProject(String name, Callback callback){

       String message = "hello my name is"  + name;
       callback.invoke(null, message);

}
@ReactMethod
public void showToastMessage(){
    Context applicationContext=getReactApplicationContext();
    Toast.makeText(applicationContext, "hii this is toast message", Toast.LENGTH_SHORT).show();
}
}
