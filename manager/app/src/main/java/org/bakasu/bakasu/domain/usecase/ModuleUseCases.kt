<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/ModuleUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.module.ModuleRepository
import com.tesla.resukisuultra.data.network.NetworkRequestRepository
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.module.ModuleRepository
import org.bakasu.bakasu.data.network.NetworkRequestRepository
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/ModuleUseCases.kt

class FetchRemoteTextUseCase(private val repository: NetworkRequestRepository) {
    suspend operator fun invoke(url: String) = repository.fetch(url)
}

class ObserveInstalledModulesUseCase(private val repository: ModuleRepository) {
    operator fun invoke() = repository.installedModules
}

class RefreshInstalledModulesUseCase(private val repository: ModuleRepository) {
    suspend operator fun invoke(manual: Boolean, checkUpdates: Boolean) = repository.refreshInstalledModules(manual, checkUpdates)
}

class CalculateInstalledModuleSizeUseCase(private val repository: ModuleRepository) {
    suspend operator fun invoke(moduleId: String) = repository.calculateInstalledModuleSize(moduleId)
}

class UpdateCachedModuleEnabledUseCase(private val repository: ModuleRepository) {
    operator fun invoke(moduleId: String, enabled: Boolean) = repository.updateCachedEnabled(moduleId, enabled)
}
