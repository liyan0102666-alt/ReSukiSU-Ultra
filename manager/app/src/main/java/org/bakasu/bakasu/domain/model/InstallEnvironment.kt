<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/InstallEnvironment.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/InstallEnvironment.kt

data class InstallEnvironment(
    val rootAvailable: Boolean = false,
    val isGki: Boolean = false,
    val isAbDevice: Boolean = false,
    val currentKmi: String = "",
    val defaultPartition: String = "boot",
    val availablePartitions: List<String> = emptyList(),
    val activeSlotSuffix: String = "",
    val inactiveSlotSuffix: String = "",
    val supportedKmis: List<String> = emptyList(),
)
