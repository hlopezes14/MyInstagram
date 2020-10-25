package com.example.myinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("uz2JZXewRewDPNfwv11b68Affd1BkhOEmB9fchRP")
                .clientKey("okQYoJQIYqKL6JXTNf9QD5QkQch0d80Nr3Ji6wHu")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
