<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/data/startup/ApplicationInitializationRepository.kt
package com.tesla.resukisuultra.data.startup
========
package org.bakasu.bakasu.data.startup
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/data/startup/ApplicationInitializationRepository.kt

import android.annotation.SuppressLint
import android.app.Application
import android.system.Os
import coil.Coil
import coil.ImageLoader
<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/data/startup/ApplicationInitializationRepository.kt
import com.tesla.resukisuultra.data.flash.FlashRepository
import com.tesla.resukisuultra.data.shell.KsuCliRepository
import com.tesla.resukisuultra.data.theme.MonetCompatColorSource
========
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/data/startup/ApplicationInitializationRepository.kt
import com.topjohnwu.superuser.internal.MainShell
import java.io.File
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.bakasu.bakasu.data.flash.FlashRepository
import org.bakasu.bakasu.data.shell.KsuCliRepository
import org.bakasu.bakasu.data.theme.MonetCompatColorSource

class ApplicationInitializationRepository(
    private val application: Application,
    private val imageLoader: ImageLoader,
    private val applicationScope: CoroutineScope,
    private val flashRepository: FlashRepository,
    private val ksuCliRepository: KsuCliRepository,
    private val monetCompatColorSource: MonetCompatColorSource,
) {
    @SuppressLint("RestrictedApi")
    suspend fun initialize() {
        MainShell.setBuilder(ksuCliRepository.generateMainShellBuilder())
        monetCompatColorSource.initialize()
        Coil.setImageLoader(imageLoader)
        File(application.dataDir, "webroot").mkdirs()
        Os.setenv("TMPDIR", application.cacheDir.absolutePath, true)
        applicationScope.launch {
            runCatching { flashRepository.getInstallEnvironment() }
        }
    }
}
