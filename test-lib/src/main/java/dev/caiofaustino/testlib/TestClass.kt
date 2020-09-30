package dev.caiofaustino.testlib

import android.util.Log

class TestClass {

    fun logMe() {
        Log.e("TEST", " I have been logged! ${BuildConfig.VERSION_NAME}")
    }
}
