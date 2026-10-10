<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/EnsureManagerInstalledUseCase.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.application.ApplicationControlRepository
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.application.ApplicationControlRepository
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/EnsureManagerInstalledUseCase.kt

class EnsureManagerInstalledUseCase(
    private val repository: ApplicationControlRepository,
) {
    suspend operator fun invoke(): Result<Unit> = repository.ensureManagerInstalled()
}
