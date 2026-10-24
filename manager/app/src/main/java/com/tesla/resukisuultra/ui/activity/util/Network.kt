<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/ui/activity/util/Network.kt
package com.tesla.resukisuultra.ui.activity.util
========
package org.bakasu.bakasu.ui.activity.util
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/ui/activity/util/Network.kt

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

fun isNetworkAvailable(context: Context): Boolean {
    val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val network = cm.activeNetwork ?: return false
    val caps = cm.getNetworkCapabilities(network) ?: return false

    val hasTransport = caps.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ||
        caps.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) ||
        caps.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)

    return hasTransport &&
        caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) &&
        caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_VALIDATED)
}
