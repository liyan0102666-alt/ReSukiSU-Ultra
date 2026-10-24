<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/ui/util/SnackbarExt.kt
package com.tesla.resukisuultra.ui.util
========
package org.bakasu.bakasu.ui.util
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/ui/util/SnackbarExt.kt

import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult

suspend fun SnackbarHostState.showReplacingSnackbar(
    message: String,
    actionLabel: String? = null,
    withDismissAction: Boolean = false,
    duration: SnackbarDuration =
        if (actionLabel == null) SnackbarDuration.Short else SnackbarDuration.Indefinite,
): SnackbarResult {
    currentSnackbarData?.dismiss()
    return showSnackbar(
        message = message,
        actionLabel = actionLabel,
        withDismissAction = withDismissAction,
        duration = duration,
    )
}
