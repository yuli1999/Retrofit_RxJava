package com.example.mapp;


import io.reactivex.Observable;

public class IModel {

    String name;
    String page;
    public Observable<Bean> getListener(String anme,String paeg){
        return ServiceCntent.Getter().createe(Nummer.class).getListener(paeg,anme);
    }
}
