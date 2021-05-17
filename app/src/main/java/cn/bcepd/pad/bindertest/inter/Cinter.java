package cn.bcepd.pad.bindertest.inter;

import android.os.RemoteException;

import cn.bcepd.pad.bindertest.AInterface;
import cn.bcepd.pad.bindertest.CInterface;

/**
 * @author Ming
 * 5/14/21
 */
public class Cinter extends CInterface.Stub {
    @Override
    public void c(int anInt) throws RemoteException {
        
    }
}
