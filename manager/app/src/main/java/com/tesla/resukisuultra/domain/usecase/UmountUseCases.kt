<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/UmountUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.domain.model.UmountPath
import com.tesla.resukisuultra.data.kernel.UmountRepository
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.kernel.UmountRepository
import org.bakasu.bakasu.domain.model.UmountPath
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/UmountUseCases.kt

class ObserveUmountStateUseCase(private val repository: UmountRepository) {
    operator fun invoke() = repository.state
}

class RefreshUmountPathsUseCase(private val repository: UmountRepository) {
    suspend operator fun invoke() = repository.refresh()
}

class AddUmountPathUseCase(private val repository: UmountRepository) {
    suspend operator fun invoke(path: String, flags: Int) = repository.add(path, flags)
}

class RemoveUmountPathUseCase(private val repository: UmountRepository) {
    suspend operator fun invoke(entry: UmountPath) = repository.remove(entry)
}
