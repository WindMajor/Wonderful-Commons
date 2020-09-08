@file:Suppress("HasPlatformType")

package com.windmajor.wonderful.commons.extensions

import android.content.Context
import android.view.View
import com.windmajor.wonderful.commons.PREFS_KEY


val Context.isRTLLayout: Boolean get() = resources.configuration.layoutDirection == View.LAYOUT_DIRECTION_RTL

//val Context.baseConfig: BaseConfig

fun Context.getSharedPrefs() = getSharedPreferences(PREFS_KEY, Context.MODE_PRIVATE)



