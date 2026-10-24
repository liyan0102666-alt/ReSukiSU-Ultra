<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/KernelSUApplication.kt
package com.tesla.resukisuultra

import android.app.Application
import android.os.Build
import com.tesla.resukisuultra.di.appModules
import com.tesla.resukisuultra.domain.usecase.InitializeApplicationUseCase
========
package org.bakasu.bakasu

import android.app.Application
import android.os.Build
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/KernelSUApplication.kt
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import org.bakasu.bakasu.di.appModules
import org.bakasu.bakasu.domain.usecase.InitializeApplicationUseCase
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KernelSUApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            val processName = getProcessName()
            if (processName.endsWith("MagicaService")) {
                // avoid loading unnecessary thing when starting MagicaService
                return
            }
        }

        val koin = startKoin {
            androidLogger()
            androidContext(this@KernelSUApplication)
            modules(appModules)
        }.koin
        runBlocking(Dispatchers.IO) {
            koin.get<InitializeApplicationUseCase>()()
        }
    }
}
