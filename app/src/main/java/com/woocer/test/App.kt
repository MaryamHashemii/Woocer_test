package com.woocer.test

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import com.google.firebase.database.FirebaseDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application(){

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

    }

}