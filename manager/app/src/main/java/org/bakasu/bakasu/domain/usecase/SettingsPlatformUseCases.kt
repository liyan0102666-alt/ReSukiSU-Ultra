<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/SettingsPlatformUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.settings.SettingsPlatformRepository
import com.tesla.resukisuultra.domain.model.AppearanceSetting
import com.tesla.resukisuultra.domain.model.PlatformSetting
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.data.settings.SettingsPlatformRepository
import org.bakasu.bakasu.domain.model.AppearanceSetting
import org.bakasu.bakasu.domain.model.PlatformSetting
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/SettingsPlatformUseCases.kt

class LoadSettingsPlatformUseCase(private val repository: SettingsPlatformRepository) {
    operator fun invoke() = repository.load()
}

class UpdateAppearanceUseCase(private val repository: SettingsPlatformRepository) {
    suspend operator fun invoke(setting: AppearanceSetting) = repository.updateAppearance(setting)
}

class UpdatePlatformSettingUseCase(private val repository: SettingsPlatformRepository) {
    operator fun invoke(setting: PlatformSetting) = repository.updatePlatform(setting)
}

class GetPlatformFeatureStatusUseCase(private val repository: SettingsPlatformRepository) {
    suspend operator fun invoke() = repository.getFeatureStatus()
}

class IsSoftRebootPreferredUseCase(private val repository: SettingsPlatformRepository) {
    operator fun invoke() = repository.isSoftRebootPreferred()
}
