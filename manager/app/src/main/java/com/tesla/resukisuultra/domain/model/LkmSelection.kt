<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/LkmSelection.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/LkmSelection.kt

sealed interface LkmSelection {
    data class LkmUri(val uri: String) : LkmSelection
    data class KmiString(val value: String) : LkmSelection
    data object KmiNone : LkmSelection
}
