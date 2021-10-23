package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Rh9eoYh8sltpeZMyiutJzpDKIxENSPAr8TaarfEA")
                .clientKey("IZbvWRv2SQZEhS4l9jzzvZ0Q1TxHAqR2nZr2ztCb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
