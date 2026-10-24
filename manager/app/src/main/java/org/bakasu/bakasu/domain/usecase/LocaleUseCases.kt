<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/LocaleUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import android.content.Context
import com.tesla.resukisuultra.data.settings.LocaleRepository
========
package org.bakasu.bakasu.domain.usecase

import android.content.Context
import org.bakasu.bakasu.data.settings.LocaleRepository
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/LocaleUseCases.kt

class ApplyLanguageUseCase(private val repository: LocaleRepository) {
    operator fun invoke(context: Context): Context = repository.applyLanguage(context)
}

class IsSystemLanguageSettingsUseCase(private val repository: LocaleRepository) {
    operator fun invoke(): Boolean = repository.isSystemLanguageSettings()
}

class LaunchSystemLanguageSettingsUseCase(private val repository: LocaleRepository) {
    operator fun invoke(context: Context) = repository.launchSystemLanguageSettings(context)
}
