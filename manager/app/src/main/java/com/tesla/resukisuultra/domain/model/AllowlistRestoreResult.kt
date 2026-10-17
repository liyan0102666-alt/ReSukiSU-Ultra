<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/AllowlistRestoreResult.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/AllowlistRestoreResult.kt

sealed interface AllowlistRestoreResult {
    data object Success : AllowlistRestoreResult
    data object InvalidFile : AllowlistRestoreResult
    data object UnsupportedVersion : AllowlistRestoreResult
    data class ProfileUpdateFailed(val uid: Int) : AllowlistRestoreResult
    data object Failed : AllowlistRestoreResult
}
