<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/data/system/HomeStateRepository.kt
package com.tesla.resukisuultra.data.system

import com.tesla.resukisuultra.domain.model.HomeDashboardState
========
package org.bakasu.bakasu.data.system

>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/data/system/HomeStateRepository.kt
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import org.bakasu.bakasu.domain.model.HomeDashboardState

class HomeStateRepository {
    private val mutableState = MutableStateFlow(HomeDashboardState())
    val state: StateFlow<HomeDashboardState> = mutableState.asStateFlow()

    fun update(transform: (HomeDashboardState) -> HomeDashboardState) {
        mutableState.update(transform)
    }
}
