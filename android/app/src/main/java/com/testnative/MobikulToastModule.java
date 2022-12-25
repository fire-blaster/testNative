package com.testnative;

import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.IllegalViewOperationException;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

public class MobikulToastModule extends ReactContextBaseJavaModule {
    private int count = 0;
    private final ReactApplicationContext
            reactContext;
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String DURATION_LONG_KEY = "LONG";
    private int counter=0;

    public MobikulToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @NonNull
    @Override
    public String getName() {
        return "MobikulToastModule";
    }

//    @ReactMethod
//    public void show(String message, int duration) {
//        Toast.makeText(getReactApplicationContext(), message, duration).show();
//    }

    //Counter method
//    @Override
//    public Map<String, Object> getConstants() {
//        final Map<String, Object> constants = new HashMap<>();
//        constants.put("initialCount", 0);
//        return constants;
//    }

//    @ReactMethod
//    public void increment(int count) {
//        Toast.makeText(getReactApplicationContext(), "Hello"+count, Toast.LENGTH_LONG).show();
//
//    }

//    @ReactMethod
//    public void decrement(Promise promise) {
//        try {
//            if (count == 0) {
//                promise.reject("E_COUNT", "count count cannot be negative.");
//            } else {
//                count = count - 1;
//                Log.d("DEBUG", String.format("---------- count is (%s)", count));
//                promise.resolve(count);
//
//                WritableMap params = Arguments.createMap();
//                params.putInt("count", count);
//                sendEvent(this.getReactApplicationContext(), "onDecrement", params);
//            }
//        } catch (IllegalViewOperationException e) {
//            promise.reject("VIEW_ERROR", e.getMessage());
//        }
//    }

//    private void sendEvent(
//            ReactContext reactContext,
//            String eventName,
//            @Nullable WritableMap params) {
//        reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
//                .emit(eventName, params);
//    }
}
