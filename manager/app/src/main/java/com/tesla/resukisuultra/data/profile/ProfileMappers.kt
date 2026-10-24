<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/data/profile/ProfileMappers.kt
package com.tesla.resukisuultra.data.profile

import com.tesla.resukisuultra.Natives
import com.tesla.resukisuultra.domain.model.AppProfile
========
package org.bakasu.bakasu.data.profile

import org.bakasu.bakasu.Natives
import org.bakasu.bakasu.domain.model.AppProfile
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/data/profile/ProfileMappers.kt

internal fun Natives.Profile.toDomain(): AppProfile = AppProfile(
    name = name,
    currentUid = currentUid,
    allowSu = allowSu,
    rootUseDefault = rootUseDefault,
    rootTemplate = rootTemplate,
    uid = uid,
    gid = gid,
    groups = groups,
    capabilities = capabilities,
    context = context,
    namespace = namespace,
    nonRootUseDefault = nonRootUseDefault,
    umountModules = umountModules,
    rules = rules,
    flags = flags,
)

internal fun AppProfile.toNative(): Natives.Profile = Natives.Profile(
    name = name,
    currentUid = currentUid,
    allowSu = allowSu,
    rootUseDefault = rootUseDefault,
    rootTemplate = rootTemplate,
    uid = uid,
    gid = gid,
    groups = groups,
    capabilities = capabilities,
    context = context,
    namespace = namespace,
    nonRootUseDefault = nonRootUseDefault,
    umountModules = umountModules,
    rules = rules,
    flags = flags,
)
