<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/StartupState.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/StartupState.kt

sealed interface StartupState {
    data object Loading : StartupState
    data object Ready : StartupState
    data class Failed(val message: String) : StartupState
}
