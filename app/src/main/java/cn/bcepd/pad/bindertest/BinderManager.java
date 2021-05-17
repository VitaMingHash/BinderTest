package cn.bcepd.pad.bindertest;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import cn.bcepd.pad.bindertest.inter.Ainter;
import cn.bcepd.pad.bindertest.inter.Binter;
import cn.bcepd.pad.bindertest.inter.Cinter;

/**
 * @author Ming
 * 5/14/21
 */
public class BinderManager {
    private IOneInterface iBinder;

    public IBinder find(String name) {
        try {
            return iBinder.find(name);
        } catch (Exception e) {

        }
        return null;
    }


    public void initBinder(Context context) {
        Intent intentService = new Intent(context, BinderService.class);
        context.bindService(intentService, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            iBinder = IOneInterface.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    public static class IOneInterfaceN extends IOneInterface.Stub {

        @Override
        public IBinder find(String name) throws RemoteException {
            switch (name) {
                case Constant.A:
                    return new Ainter();
                case Constant.B:
                    return new Binter();
                case Constant.C:
                    return new Cinter();
            }
            return null;
        }
    }

    public static BinderManager getInstance() {
        return BinderManagerHolder.mInstance;
    }

    private static class BinderManagerHolder {
        private final static BinderManager mInstance = new BinderManager();
    }
}
