<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/ui/util/CompositionProvider.kt
package com.tesla.resukisuultra.ui.util
========
package org.bakasu.bakasu.ui.util
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/ui/util/CompositionProvider.kt

import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.layout.LayoutCoordinates
<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/ui/util/CompositionProvider.kt
import com.tesla.resukisuultra.ui.activity.PermissionRequestInterface
import com.tesla.resukisuultra.ui.overscroll.StretchOverscrollCompensationState
========
import org.bakasu.bakasu.ui.activity.PermissionRequestInterface
import org.bakasu.bakasu.ui.overscroll.StretchOverscrollCompensationState
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/ui/util/CompositionProvider.kt
import top.yukonga.miuix.kmp.blur.LayerBackdrop

val LocalSnackbarHost = compositionLocalOf<SnackbarHostState> {
    error("CompositionLocal LocalSnackbarController not present")
}

val LocalBlurState = compositionLocalOf<LayerBackdrop?> {
    error("CompositionLocal LocalBlurState not present")
}

val LocalPagerState = compositionLocalOf<PagerState> { error("No pager state") }
val LocalPortraitState = compositionLocalOf<Boolean> { error("No portrait state") }
val LocalPagerPage = staticCompositionLocalOf<Int?> { null }
val LocalHandlePageChange = compositionLocalOf<(Int) -> Unit> { error("No handle page change") }
val LocalSelectedPage = compositionLocalOf<Int> { error("No selected page") }

val LocalBackgroundBlurAnchor = staticCompositionLocalOf<LayoutCoordinates?> { null }
val LocalStretchOverscrollCompensationState =
    staticCompositionLocalOf<StretchOverscrollCompensationState?> { null }

val LocalPermissionRequestInterface = compositionLocalOf<PermissionRequestInterface> {
    error("CompositionLocal LocalPermissionRequestInterface not present")
}
