<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/InitializeApplicationUseCase.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.AppSettingsRepository
import com.tesla.resukisuultra.data.startup.ApplicationInitializationRepository
import com.tesla.resukisuultra.data.startup.StartupRepository
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.AppSettingsRepository
import org.bakasu.bakasu.data.startup.ApplicationInitializationRepository
import org.bakasu.bakasu.data.startup.StartupRepository
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/InitializeApplicationUseCase.kt

class InitializeApplicationUseCase(
    private val settingsRepository: AppSettingsRepository,
    private val startupRepository: StartupRepository,
    private val initializationRepository: ApplicationInitializationRepository,
) {
    suspend operator fun invoke() {
        runCatching {
            settingsRepository.preload()
            initializationRepository.initialize()
        }.onSuccess {
            startupRepository.markReady()
        }.onFailure { error ->
            startupRepository.markFailed(error)
        }
    }
}
