<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/GetInstallEnvironmentUseCase.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.flash.FlashRepository
import com.tesla.resukisuultra.domain.model.InstallEnvironment
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.flash.FlashRepository
import org.bakasu.bakasu.domain.model.InstallEnvironment
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/GetInstallEnvironmentUseCase.kt

class GetInstallEnvironmentUseCase(
    private val repository: FlashRepository,
) {
    fun cached(): InstallEnvironment? = repository.installEnvironment.value

    suspend operator fun invoke(forceRefresh: Boolean = false) = repository.getInstallEnvironment(forceRefresh)
}
