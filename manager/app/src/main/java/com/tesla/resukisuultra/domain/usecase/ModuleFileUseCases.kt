<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/ModuleFileUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.file.ModuleFileRepository
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.file.ModuleFileRepository
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/ModuleFileUseCases.kt

class IsModuleUriAccessibleUseCase(private val repository: ModuleFileRepository) {
    operator fun invoke(uri: String) = repository.isUriAccessible(uri)
}

class TakeModuleUriPermissionUseCase(private val repository: ModuleFileRepository) {
    operator fun invoke(uri: String) = repository.takePersistableUriPermission(uri)
}

class ExtractModuleNameUseCase(private val repository: ModuleFileRepository) {
    operator fun invoke(uri: String) = repository.extractModuleName(uri)
}

class ExtractModuleIdUseCase(private val repository: ModuleFileRepository) {
    operator fun invoke(uri: String) = repository.extractModuleId(uri)
}
