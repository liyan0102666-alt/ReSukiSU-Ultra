<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/PreferenceUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.AppSettingsRepository
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.AppSettingsRepository
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/PreferenceUseCases.kt

class GetBooleanPreferenceUseCase(private val repository: AppSettingsRepository) {
    operator fun invoke(key: String, defaultValue: Boolean = false) = repository.getBoolean(key, defaultValue)
}

class SetBooleanPreferenceUseCase(private val repository: AppSettingsRepository) {
    operator fun invoke(key: String, value: Boolean) = repository.putBoolean(key, value)
}

class GetStringPreferenceUseCase(private val repository: AppSettingsRepository) {
    operator fun invoke(key: String, defaultValue: String? = null) = repository.getString(key, defaultValue)
}

class SetStringPreferenceUseCase(private val repository: AppSettingsRepository) {
    operator fun invoke(key: String, value: String?) = repository.putString(key, value)
}

class GetStringSetPreferenceUseCase(private val repository: AppSettingsRepository) {
    operator fun invoke(key: String, defaultValue: Set<String> = emptySet()) = repository.getStringSet(key, defaultValue)
}

class SetStringSetPreferenceUseCase(private val repository: AppSettingsRepository) {
    operator fun invoke(key: String, value: Set<String>) = repository.putStringSet(key, value)
}

class RemovePreferenceUseCase(private val repository: AppSettingsRepository) {
    operator fun invoke(key: String) = repository.remove(key)
}
