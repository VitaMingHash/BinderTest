package cn.bcepd.pad.bindertest.inter;

import android.os.RemoteException;

import cn.bcepd.pad.bindertest.AInterface;
import cn.bcepd.pad.bindertest.BInterface;

/**
 * @author Ming
 * 5/14/21
 */
public class Binter extends BInterface.Stub {
    @Override
    public void b(int anInt) throws RemoteException {
        
    }
}
