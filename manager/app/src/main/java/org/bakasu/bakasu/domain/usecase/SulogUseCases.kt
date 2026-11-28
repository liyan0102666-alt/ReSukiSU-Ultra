<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/SulogUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.logging.SulogRepository
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.logging.SulogRepository
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/SulogUseCases.kt

class ObserveSulogStateUseCase(private val repository: SulogRepository) {
    operator fun invoke() = repository.state
}

class RefreshSulogUseCase(private val repository: SulogRepository) {
    suspend operator fun invoke(preferredFilePath: String?) = repository.refresh(preferredFilePath)
}

class EnableSulogUseCase(private val repository: SulogRepository) {
    suspend operator fun invoke(enabled: Boolean) = repository.setEnabled(enabled)
}

class CleanSulogUseCase(private val repository: SulogRepository) {
    suspend operator fun invoke(path: String) = repository.clean(path)
}
