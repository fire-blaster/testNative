package com.testnative;

import android.media.MediaPlayer;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

public class Metronome extends ReactContextBaseJavaModule {
    MediaPlayer music = MediaPlayer.create(getReactApplicationContext(), R.raw.pop);
    int val = 60;


    private final ReactApplicationContext
            reactContext;

    public Metronome(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public Map<String, Object> getConstants() {
        Map<String, Object> constants = new HashMap<>();
        constants.put("Val", val);
        return constants;
    }

    @ReactMethod
    public void play() {
        music.start();
    }

    @ReactMethod
    public void increase(Promise promise) {
        val = val + 1;
        promise.resolve(val);
    }

    @ReactMethod
    public void decrease(Promise promise) {
        val = val - 1;
        promise.resolve(val);

    }
    @ReactMethod
    public void stop() {
        music.stop();
    }

    @Override
    public String getName() {
        return "Metronome";
    }
}
