<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/FlashOperationUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.flash.FlashRepository
import com.tesla.resukisuultra.domain.model.FlashOperation
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.flash.FlashRepository
import org.bakasu.bakasu.domain.model.FlashOperation
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/FlashOperationUseCases.kt

class ExecuteFlashOperationUseCase(private val repository: FlashRepository) {
    operator fun invoke(operation: FlashOperation) = repository.execute(operation)
}
