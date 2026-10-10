<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/FlashProgress.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/FlashProgress.kt

data class FlashProgress(
    val isFlashing: Boolean = false,
    val isCompleted: Boolean = false,
    val progress: Float = 0f,
    val currentStep: String = "",
    val logs: List<String> = emptyList(),
    val error: String = "",
)

data class KernelFlashSession(
    val requestUri: String? = null,
    val selectedSlot: String? = null,
    val progress: FlashProgress = FlashProgress(),
    val fullLog: String = "",
)
