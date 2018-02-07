package com.jcenterlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * 描述   ：测试的Java类
 * <p>
 * 作者   ：Created by DuanRui on 2018/2/6.
 */

public class HelloWorld {

    /**
     * say方法
     */
    public  static void say(Context context){

        String s = "某种意义上，这是我们在编程世界学会的第一句话 ：Hello World ！";
        System.out.println(s);

        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
