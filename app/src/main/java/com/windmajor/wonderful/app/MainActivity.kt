package com.windmajor.wonderful.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.windmajor.wonderful.commons.extensions.*

class MainActivity : AppCompatActivity() {

    @Suppress("PrivatePropertyName")
    private val TAG = "WMLog"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "sdCardPath = $sdCardPath")
        Log.i(TAG, "internalStoragePath = $internalStoragePath")
        Log.i(TAG, "isRTLLayout = $isRTLLayout")
        Log.i(TAG, "otgPath = $otgPath")

        Log.i(TAG, "getSDCardPath() = ${getSDCardPath()}")
        Log.i(TAG, "hasExternalSDCard() = ${hasExternalSDCard()}")
        Log.i(TAG, "hasOTGConnected() = ${hasOTGConnected()}")
        Log.i(TAG, "getInternalStoragePath() = ${getInternalStoragePath()}")

        for (dir in getStorageDirectories()) {
            Log.i(TAG, "getStorageDirectories() dir = $dir")
        }

        Log.i(TAG, "getHumanReadablePath() = ${getHumanReadablePath("/storage/emulated/0")}")

    }
}