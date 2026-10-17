<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/DownloadState.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/DownloadState.kt

enum class DownloadStatus { PENDING, DOWNLOADING, COMPLETED, FAILED }

data class DownloadState(
    val id: Int,
    val fileName: String,
    val url: String,
    val progress: Int = 0,
    val status: DownloadStatus = DownloadStatus.PENDING,
    val resultUri: String? = null,
    val error: String? = null,
)
