<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/ModuleActionUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.module.ModuleActionRepository
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.module.ModuleActionRepository
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/ModuleActionUseCases.kt

class ExecuteModuleActionUseCase(
    private val repository: ModuleActionRepository,
) {
    operator fun invoke(moduleId: String) = repository.execute(moduleId)
}

class SaveModuleActionLogUseCase(
    private val repository: ModuleActionRepository,
) {
    suspend operator fun invoke(content: String) = repository.saveLog(content)
}
