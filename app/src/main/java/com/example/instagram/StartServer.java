package com.example.instagram;

import com.parse.Parse;
import android.app.Application;

public class StartServer extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("joksC9ohxH3fWOznFqUtyfMa3xEz1yBePG6BxYvN")
                .clientKey("rkvhmziFkCHNADJp4yq4E9IdAwTUvYNkQvQ1I09v")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}