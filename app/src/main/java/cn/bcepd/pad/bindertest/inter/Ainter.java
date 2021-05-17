package cn.bcepd.pad.bindertest.inter;

import android.os.RemoteException;
import android.util.Log;

import cn.bcepd.pad.bindertest.AInterface;
import cn.bcepd.pad.bindertest.BinderManager;
import cn.bcepd.pad.bindertest.Constant;

/**
 * @author Ming
 * 5/14/21
 */
public class Ainter extends AInterface.Stub {
    @Override
    public void a(int anInt) throws RemoteException {
        Log.e("Ainter",android.os.Process.myPid()+"进程为");
        Log.e("aaaa",String.valueOf(anInt));

    }
}
