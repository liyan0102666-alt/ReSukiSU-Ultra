<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/data/application/ApplicationControlRepository.kt
package com.tesla.resukisuultra.data.application

import com.tesla.resukisuultra.Natives
import com.tesla.resukisuultra.data.shell.KsuCliRepository
========
package org.bakasu.bakasu.data.application

>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/data/application/ApplicationControlRepository.kt
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.bakasu.bakasu.Natives
import org.bakasu.bakasu.data.shell.KsuCliRepository

class ApplicationControlRepository(
    private val ksuCliRepository: KsuCliRepository,
) {
    suspend fun ensureManagerInstalled(): Result<Unit> = withContext(Dispatchers.IO) {
        runCatching {
            if (Natives.isFullFeatured() && ksuCliRepository.rootAvailable()) {
                ksuCliRepository.install()
            }
        }
    }

    suspend fun reboot(reason: String = ""): Result<Unit> = withContext(Dispatchers.IO) {
        runCatching { ksuCliRepository.reboot(reason) }
    }
}
