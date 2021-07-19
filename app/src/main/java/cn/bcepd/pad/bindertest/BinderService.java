package cn.bcepd.pad.bindertest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import androidx.annotation.Nullable;

/**
 * @author Ming
 * 5/14/21
 */
public class BinderService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new BinderManager.IOneInterfaceN();
    }
}
