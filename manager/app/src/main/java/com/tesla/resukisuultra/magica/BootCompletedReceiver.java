<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/magica/BootCompletedReceiver.java
package com.tesla.resukisuultra.magica;

import static com.tesla.resukisuultra.magica.AppZygotePreload.TAG;
========
package org.bakasu.bakasu.magica;

import static org.bakasu.bakasu.magica.AppZygotePreload.TAG;
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/magica/BootCompletedReceiver.java

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootCompletedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        var action = intent.getAction();
        if (!Intent.ACTION_LOCKED_BOOT_COMPLETED.equals(action)
                && !Intent.ACTION_BOOT_COMPLETED.equals(action)
<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/magica/BootCompletedReceiver.java
                && !"com.tesla.resukisuultra.magica.LAUNCH".equals(action)) {
========
                && !"org.bakasu.bakasu.magica.LAUNCH".equals(action)) {
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/magica/BootCompletedReceiver.java
            return;
        }
        try {
            // 开机应用 IO 调度器配置固化 (管理器选择 → root 写 sysfs)
            IoSchedBootApplier.INSTANCE.apply(context.getApplicationContext());
        } catch (Throwable e) {
            Log.e(TAG, "Failed to apply io scheduler config from boot action: " + action, e);
        }
        try {
            context.startService(new Intent(context, MagicaService.class));
            Log.i(TAG, "MagicaService started from boot action: " + action);
        } catch (Throwable e) {

            Log.e(TAG, "Failed to start MagicaService from boot action: " + action, e);
        }
    }
}
