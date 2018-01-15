package com.pace.youngtechy.aibot;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Anas on 25-08-2016.
 */
public class MainApp extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
