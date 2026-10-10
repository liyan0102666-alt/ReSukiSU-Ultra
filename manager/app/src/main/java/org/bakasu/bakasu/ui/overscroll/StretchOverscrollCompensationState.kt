<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/ui/overscroll/StretchOverscrollCompensationState.kt
package com.tesla.resukisuultra.ui.overscroll
========
package org.bakasu.bakasu.ui.overscroll
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/ui/overscroll/StretchOverscrollCompensationState.kt

import androidx.compose.runtime.Stable
import androidx.compose.ui.layout.LayoutCoordinates

/**
 * Stretch information published by the vendored platform overscroll effect.
 *
 * Compose can retain child graphics layers and record them separately from the parent overscroll
 * RenderNode. The values therefore remain published for the lifetime of the active stretch instead
 * of only while the parent records drawContent().
 */
@Stable
class StretchOverscrollCompensationState {
    private val horizontalAxes = linkedMapOf<Any, StretchOverscrollAxis>()
    private val verticalAxes = linkedMapOf<Any, StretchOverscrollAxis>()

    val horizontal: StretchOverscrollAxis?
        get() = horizontalAxes.values.lastOrNull()

    val vertical: StretchOverscrollAxis?
        get() = verticalAxes.values.lastOrNull()

    internal fun update(
        owner: Any,
        horizontal: StretchOverscrollAxis?,
        vertical: StretchOverscrollAxis?,
    ) {
        horizontalAxes.update(owner, horizontal)
        verticalAxes.update(owner, vertical)
    }

    internal fun clear(owner: Any) {
        horizontalAxes.remove(owner)
        verticalAxes.remove(owner)
    }
}

private fun LinkedHashMap<Any, StretchOverscrollAxis>.update(
    owner: Any,
    axis: StretchOverscrollAxis?,
) {
    remove(owner)
    if (axis != null) put(owner, axis)
}

class StretchOverscrollAxis internal constructor(
    val amount: Float,
    val coordinates: LayoutCoordinates,
)
