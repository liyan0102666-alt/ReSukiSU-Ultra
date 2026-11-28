<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/UmountPath.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/UmountPath.kt

data class UmountPath(
    val path: String,
    val flags: Int,
    val persistent: Boolean,
)

data class UmountState(
    val paths: List<UmountPath> = emptyList(),
    val isLoading: Boolean = true,
    val isRefreshing: Boolean = false,
)
