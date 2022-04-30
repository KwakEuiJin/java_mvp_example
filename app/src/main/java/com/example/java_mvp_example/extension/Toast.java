package com.example.java_mvp_example.extension;

import android.content.Context;

import androidx.annotation.NonNull;

public class Toast {
    public Toast(Context context,@NonNull String message){
        android.widget.Toast.makeText(context, message, android.widget.Toast.LENGTH_SHORT).show();
    }
}
