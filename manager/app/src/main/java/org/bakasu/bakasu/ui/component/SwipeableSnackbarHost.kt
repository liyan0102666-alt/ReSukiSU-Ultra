<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/ui/component/SwipeableSnackbarHost.kt
package com.tesla.resukisuultra.ui.component
========
package org.bakasu.bakasu.ui.component
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/ui/component/SwipeableSnackbarHost.kt

import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarData
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SwipeToDismissBox
import androidx.compose.material3.SwipeToDismissBoxValue
import androidx.compose.material3.rememberSwipeToDismissBoxState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/ui/component/SwipeableSnackbarHost.kt
import com.tesla.resukisuultra.ui.util.LocalSnackbarHost
========
import org.bakasu.bakasu.ui.util.LocalSnackbarHost
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/ui/component/SwipeableSnackbarHost.kt

@Composable
fun SwipeableSnackbarHost(
    modifier: Modifier = Modifier,
    hostState: SnackbarHostState = LocalSnackbarHost.current,
    snackbar: @Composable (SnackbarData) -> Unit = { Snackbar(it) },
) {
    val state = rememberSwipeToDismissBoxState()

    SwipeToDismissBox(
        state = state,
        backgroundContent = {},
        onDismiss = {
            hostState.currentSnackbarData?.dismiss()
        },
    ) {
        SnackbarHost(
            modifier = modifier,
            hostState = hostState,
            snackbar = snackbar,
        )
    }

    LaunchedEffect(hostState.currentSnackbarData) {
        if (hostState.currentSnackbarData == null) return@LaunchedEffect

        state.snapTo(SwipeToDismissBoxValue.Settled)
    }
}
