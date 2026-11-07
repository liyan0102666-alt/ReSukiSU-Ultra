<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/data/packageinfo/InstalledPackageCache.kt
package com.tesla.resukisuultra.data.packageinfo
========
package org.bakasu.bakasu.data.packageinfo
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/data/packageinfo/InstalledPackageCache.kt

import android.content.pm.PackageInfo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class InstalledPackageCache {
    private val mutablePackages = MutableStateFlow<List<PackageInfo>>(emptyList())
    val packages: StateFlow<List<PackageInfo>> = mutablePackages.asStateFlow()

    fun replace(packages: List<PackageInfo>) {
        mutablePackages.value = packages.toList()
    }

    fun find(packageName: String): PackageInfo? = mutablePackages.value.firstOrNull { it.packageName == packageName }
}
