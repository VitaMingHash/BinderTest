package cn.bcepd.pad.bindertest;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;

import cn.bcepd.pad.bindertest.inter.Ainter;

/**
 * @author Ming
 * 5/14/21
 */
public class SeActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se);
        Button btn = findViewById(R.id.btn);
        BinderManager.getInstance().initBinder(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BinderManager binderManager = BinderManager.getInstance();
                IBinder iBinder = binderManager.find(Constant.A);
                AInterface aInterface = AInterface.Stub.asInterface(iBinder);
                try {
                    aInterface.a(1);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });



//        try {
//            aInterface.a(123);
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }
    }


}
