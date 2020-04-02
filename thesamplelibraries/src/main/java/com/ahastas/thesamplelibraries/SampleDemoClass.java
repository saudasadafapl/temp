package com.ahastas.thesamplelibraries;

import android.content.Context;
import android.widget.Toast;

public class SampleDemoClass {
    public  static  void showMySampleToast(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT);

    }
}
