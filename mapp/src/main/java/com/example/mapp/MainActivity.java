package com.example.mapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements IView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IProcenter iProcenter = new IProcenter(this);
        iProcenter.getListener();
    }

    @Override
    public void onSuccess(final Bean bean) {
        Toast.makeText(MainActivity.this, ""+bean.toString(), Toast.LENGTH_SHORT).show();


    }
}
