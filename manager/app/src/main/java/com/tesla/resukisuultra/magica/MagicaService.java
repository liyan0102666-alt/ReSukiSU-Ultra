<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/magica/MagicaService.java
package com.tesla.resukisuultra.magica;
========
package org.bakasu.bakasu.magica;
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/magica/MagicaService.java

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MagicaService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new Binder();
    }
}
