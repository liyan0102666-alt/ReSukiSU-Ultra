<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/DownloadUseCases.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.data.download.DownloadRepository
import com.tesla.resukisuultra.domain.model.DownloadState
import com.tesla.resukisuultra.domain.model.ManagerUpdateInfo
========
package org.bakasu.bakasu.domain.usecase

>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/DownloadUseCases.kt
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.bakasu.bakasu.data.download.DownloadRepository
import org.bakasu.bakasu.domain.model.DownloadState
import org.bakasu.bakasu.domain.model.ManagerUpdateInfo

class EnqueueDownloadUseCase(private val repository: DownloadRepository) {
    operator fun invoke(url: String, fileName: String): Int = repository.enqueue(url, fileName)
}

class EnqueueManagerUpdateUseCase(private val repository: DownloadRepository) {
    operator fun invoke(update: ManagerUpdateInfo): Int = repository.enqueueManagerUpdate(update)
}

class ObserveDownloadUseCase(private val repository: DownloadRepository) {
    operator fun invoke(id: Int): Flow<DownloadState?> = repository.downloads.map { it[id] }
}
