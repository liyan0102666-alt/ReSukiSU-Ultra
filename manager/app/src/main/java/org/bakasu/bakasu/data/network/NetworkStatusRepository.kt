<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/data/network/NetworkStatusRepository.kt
package com.tesla.resukisuultra.data.network
========
package org.bakasu.bakasu.data.network
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/data/network/NetworkStatusRepository.kt

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

class NetworkStatusRepository(
    application: Application,
) {
    private val connectivityManager =
        application.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    fun isAvailable(): Boolean {
        val network = connectivityManager.activeNetwork ?: return false
        val capabilities = connectivityManager.getNetworkCapabilities(network) ?: return false
        val hasTransport = capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ||
            capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) ||
            capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)
        return hasTransport &&
            capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) &&
            capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_VALIDATED)
    }
}
