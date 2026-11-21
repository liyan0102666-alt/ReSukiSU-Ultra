<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/ModuleAction.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/ModuleAction.kt

sealed interface ModuleActionUpdate {
    data class Output(
        val text: String,
        val isError: Boolean = false,
    ) : ModuleActionUpdate

    data class Completed(val successful: Boolean) : ModuleActionUpdate
}
