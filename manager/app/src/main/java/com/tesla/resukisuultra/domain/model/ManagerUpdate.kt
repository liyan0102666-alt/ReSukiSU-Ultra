<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/ManagerUpdate.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/ManagerUpdate.kt

enum class ManagerUpdateChannel {
    STABLE,
    BETA,
}

sealed interface ManagerApkSource {
    val url: String

    data class DirectApk(override val url: String) : ManagerApkSource

    data class NightlyArtifact(
        override val url: String,
        val preferredAbi: String,
        val expectedVersionCode: Int,
    ) : ManagerApkSource
}

data class ManagerUpdateInfo(
    val channel: ManagerUpdateChannel,
    val versionCode: Int,
    val versionName: String,
    val abi: String,
    val fileName: String,
    val source: ManagerApkSource,
    val changelog: String = "",
)
