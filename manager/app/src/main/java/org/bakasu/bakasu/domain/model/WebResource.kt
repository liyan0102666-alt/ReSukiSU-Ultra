<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/model/WebResource.kt
package com.tesla.resukisuultra.domain.model
========
package org.bakasu.bakasu.domain.model
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/model/WebResource.kt

import java.io.InputStream

data class WebResource(
    val mimeType: String,
    val encoding: String,
    val body: InputStream,
)
