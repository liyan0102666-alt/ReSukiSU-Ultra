<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/ui/component/PackageIcon.kt
package com.tesla.resukisuultra.ui.component
========
package org.bakasu.bakasu.ui.component
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/ui/component/PackageIcon.kt

import android.content.pm.PackageInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImage
import coil.request.CachePolicy
import coil.request.ImageRequest
<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/ui/component/PackageIcon.kt
import com.tesla.resukisuultra.data.packageinfo.AppIconDataSource
========
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/ui/component/PackageIcon.kt
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.bakasu.bakasu.data.packageinfo.AppIconDataSource
import org.koin.compose.koinInject

/** Resolves a package name to the [PackageInfo] model expected by AppIconFetcher. */
@Composable
fun PackageIcon(
    packageName: String,
    contentDescription: String?,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val iconDataSource = koinInject<AppIconDataSource>()
    val packageInfo by produceState<PackageInfo?>(
        initialValue = iconDataSource.findCachedPackageInfo(packageName),
        packageName,
        iconDataSource,
    ) {
        if (value == null) {
            value = withContext(Dispatchers.IO) {
                iconDataSource.loadPackageInfo(packageName)
            }
        }
    }

    AsyncImage(
        model = ImageRequest.Builder(context)
            .data(packageInfo)
            .crossfade(true)
            .memoryCachePolicy(CachePolicy.ENABLED)
            .build(),
        contentDescription = contentDescription,
        modifier = modifier,
    )
}
