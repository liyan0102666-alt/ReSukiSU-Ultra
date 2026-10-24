<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/GetSuSFSStatusUseCase.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.susfs.SuSFSRepository
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.susfs.SuSFSRepository
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/GetSuSFSStatusUseCase.kt

class GetSuSFSStatusUseCase(private val repository: SuSFSRepository) {
    suspend operator fun invoke() = repository.getStatus()
}
