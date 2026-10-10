<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/InstalledPackageInfo.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/InstalledPackageInfo.kt

data class InstalledPackageInfo(
    val packageName: String,
    val versionName: String,
    val versionCode: Long,
    val appLabel: String,
    val isSystem: Boolean,
    val uid: Int,
    val apkPath: String = "",
    val nativeLibraryDir: String? = null,
)
