package com.afinalstone.androidstudy.myjna_01;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;

//继承Library，用于加载库文件
public interface Clibrary extends Library {
    //加载libhello.so链接库
    Clibrary INSTANTCE = (Clibrary) Native.loadLibrary("sayhello", Clibrary.class);
    //此方法为链接库中的方法

    public interface OpenFunc extends Callback {
        void invoke2(String filename, int i);
    }

    void init(OpenFunc callback);

    void test();
}