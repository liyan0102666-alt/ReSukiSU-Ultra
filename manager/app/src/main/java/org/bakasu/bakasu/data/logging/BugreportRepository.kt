<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/data/logging/BugreportRepository.kt
package com.tesla.resukisuultra.data.logging

import android.app.Application
import com.tesla.resukisuultra.data.shell.KsuCliRepository
========
package org.bakasu.bakasu.data.logging

import android.app.Application
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/data/logging/BugreportRepository.kt
import java.io.File
import org.bakasu.bakasu.data.shell.KsuCliRepository

class BugreportRepository(
    private val application: Application,
    private val ksuCliRepository: KsuCliRepository,
) {
    fun create(): File = getBugreportFile(application, ksuCliRepository)
}
