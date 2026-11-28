<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/BugreportUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.logging.BugreportRepository
========
package org.bakasu.bakasu.domain.usecase

>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/BugreportUseCases.kt
import java.io.File
import org.bakasu.bakasu.data.logging.BugreportRepository

class GenerateBugreportUseCase(
    private val repository: BugreportRepository,
) {
    operator fun invoke(): File = repository.create()
}
