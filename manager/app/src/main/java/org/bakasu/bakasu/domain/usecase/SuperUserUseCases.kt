<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/SuperUserUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.packageinfo.SuperUserRepository
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.packageinfo.SuperUserRepository
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/SuperUserUseCases.kt

class ObserveSuperUserStateUseCase(private val repository: SuperUserRepository) {
    operator fun invoke() = repository.state
}

class RefreshSuperUsersUseCase(private val repository: SuperUserRepository) {
    suspend operator fun invoke() = repository.refresh()
}

class BackupAllowlistUseCase(private val repository: SuperUserRepository) {
    suspend operator fun invoke(uri: String) = repository.backupAllowlist(uri)
}

class ImportAllowlistUseCase(private val repository: SuperUserRepository) {
    suspend operator fun invoke(uri: String) = repository.restoreAllowlist(uri)
}
