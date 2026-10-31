<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/WebUiProcess.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/WebUiProcess.kt

/** A streaming command handle whose platform implementation stays in the data layer. */
interface WebUiProcess {
    fun start(
        onStdout: (String) -> Unit,
        onStderr: (String) -> Unit,
        onComplete: (WebUiCommandResult) -> Unit,
    )

    fun close()
}
