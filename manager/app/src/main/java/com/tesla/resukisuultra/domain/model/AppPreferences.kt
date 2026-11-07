<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/AppPreferences.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/AppPreferences.kt

data class AppPreferences(
    val values: Map<String, PreferenceValue> = emptyMap(),
)

sealed interface PreferenceValue {
    data class BooleanValue(val value: Boolean) : PreferenceValue
    data class IntValue(val value: Int) : PreferenceValue
    data class LongValue(val value: Long) : PreferenceValue
    data class FloatValue(val value: Float) : PreferenceValue
    data class StringValue(val value: String) : PreferenceValue
    data class StringSetValue(val value: Set<String>) : PreferenceValue
}
