package cn.bcepd.pad.bindertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        BinderManager.getInstance().initBinder(this);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("main",android.os.Process.myPid()+"进程为");
                startActivity(new Intent(MainActivity.this, SeActivity.class));
//                AInterface aInterface = (AInterface)binderManager.find(Constant.A);
//                try {
//                    aInterface.a(1);
//                } catch (RemoteException e) {
//                    e.printStackTrace();
//                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("111","111");
    }
}