<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/data/settings/LocaleRepository.kt
package com.tesla.resukisuultra.data.settings

import android.content.Context
import android.os.Build
import com.tesla.resukisuultra.data.settings.launchSystemLanguageSettings as launchSystemLanguageSettingsInternal
========
package org.bakasu.bakasu.data.settings

import android.content.Context
import android.os.Build
import org.bakasu.bakasu.data.settings.launchSystemLanguageSettings as launchSystemLanguageSettingsInternal
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/data/settings/LocaleRepository.kt

class LocaleRepository(
    private val localeHelper: LocaleHelper,
) {
    fun applyLanguage(context: Context): Context = localeHelper.applyLanguage(context)
    fun isSystemLanguageSettings(): Boolean = Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU
    fun launchSystemLanguageSettings(context: Context) = launchSystemLanguageSettingsInternal(context)
}
