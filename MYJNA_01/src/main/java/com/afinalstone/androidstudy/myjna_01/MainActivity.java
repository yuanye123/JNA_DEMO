package com.afinalstone.androidstudy.myjna_01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.sun.jna.Pointer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Clibrary.INSTANTCE.init(new Clibrary.OpenFunc() {
            @Override
            public void invoke2(String filename, int i) {
                Log.d("MainActivity", "callback filename is " + filename + " i is " + i);
            }
        });

        Clibrary.INSTANTCE.test();
//        Log.d("MainActivity","sayHello的放回结果:"+result);

    }

//    //按钮点击事件
//    public void onClick(View view){
//        String result = Clibrary.INSTANTCE.sayHello();
//        Log.d("MainActivity","sayHello的放回结果:"+result);
//    }

}
