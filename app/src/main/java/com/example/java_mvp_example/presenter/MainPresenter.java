package com.example.java_mvp_example.presenter;

import com.example.java_mvp_example.extension.Toast;
import com.example.java_mvp_example.view.MainActivity;

public class MainPresenter implements Contract.Presenter {
    MainActivity view;
    public MainPresenter(MainActivity view){
        this.view = view;              //Activty View정보 가져와 통신
    }

    //Presenter를 상속하고 addNum 구현
    @Override
    public void addNum(int num1, int num2) {
        view.showResult(num1 + num2);
    }

    @Override
    public void showToast(String message) {
        new Toast(view.getApplicationContext(),message);
    }
}