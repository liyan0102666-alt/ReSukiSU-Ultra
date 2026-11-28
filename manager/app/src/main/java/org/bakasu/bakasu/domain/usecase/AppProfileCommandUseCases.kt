<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/AppProfileCommandUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.profile.ProfileRepository
import com.tesla.resukisuultra.domain.model.AppControlAction
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.profile.ProfileRepository
import org.bakasu.bakasu.domain.model.AppControlAction
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/AppProfileCommandUseCases.kt

class GetAppSepolicyUseCase(private val repository: ProfileRepository) {
    suspend operator fun invoke(packageName: String) = repository.getSepolicy(packageName)
}

class SetAppSepolicyUseCase(private val repository: ProfileRepository) {
    suspend operator fun invoke(packageName: String, rules: String) = repository.setSepolicy(packageName, rules)
}

class ControlAppUseCase(private val repository: ProfileRepository) {
    suspend operator fun invoke(packageName: String, action: AppControlAction) = repository.controlApp(packageName, action)
}

class ValidateSepolicyUseCase(private val repository: ProfileRepository) {
    suspend operator fun invoke(rules: String) = repository.isSepolicyValid(rules)
}
