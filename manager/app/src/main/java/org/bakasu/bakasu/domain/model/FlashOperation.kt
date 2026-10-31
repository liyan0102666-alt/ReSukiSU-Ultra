<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/FlashOperation.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/FlashOperation.kt

sealed interface FlashOperation {
    data class Boot(
        val bootUri: String?,
        val lkm: LkmSelection = LkmSelection.KmiNone,
        val ota: Boolean,
        val partition: String?,
        val allowShell: Boolean = false,
        val enableAdb: Boolean = false,
        val forceBackup: Boolean = false,
    ) : FlashOperation

    data class Module(val uri: String) : FlashOperation
    data object Restore : FlashOperation
    data object Uninstall : FlashOperation
}

sealed interface FlashOperationUpdate {
    data class Output(val line: String) : FlashOperationUpdate
    data class ErrorOutput(val line: String) : FlashOperationUpdate
    data class Completed(val showReboot: Boolean, val code: Int) : FlashOperationUpdate
}
