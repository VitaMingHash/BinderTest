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
        BinderManager binderManager = BinderManager.getInstance();
        IBinder iBinder = binderManager.find(Constant.B);
        BInterface aInterface = BInterface.Stub.asInterface(iBinder);
        try {
            aInterface.b(2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return new BinderManager.IOneInterfaceN();
    }
}
