package com.umeng.soexample.retrofit_rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.umeng.soexample.retrofit_rxjava.mvp.Presenter;
import com.umeng.soexample.retrofit_rxjava.mvp.View;

public class MainActivity extends AppCompatActivity implements View {

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);
        presenter.getListener();
    }

    @Override
    public void onSuccess(Bean bean) {
        Toast.makeText(this, "" + bean.toString(), Toast.LENGTH_SHORT).show();
    }
}
