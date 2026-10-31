<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/DynamicManagerUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.application.DynamicManagerRepository
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.application.DynamicManagerRepository
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/DynamicManagerUseCases.kt

class ObserveDynamicManagerStateUseCase(private val repository: DynamicManagerRepository) {
    operator fun invoke() = repository.state
}

class RefreshDynamicManagerUseCase(private val repository: DynamicManagerRepository) {
    suspend operator fun invoke() = repository.refresh()
}

class SelectDynamicManagerUseCase(private val repository: DynamicManagerRepository) {
    suspend operator fun invoke(apkPath: String) = repository.selectManager(apkPath)
}

class SetManualDynamicManagerUseCase(private val repository: DynamicManagerRepository) {
    suspend operator fun invoke(size: Int, hash: String) = repository.setManual(size, hash)
}

class ClearDynamicManagerUseCase(private val repository: DynamicManagerRepository) {
    suspend operator fun invoke() = repository.clear()
}
