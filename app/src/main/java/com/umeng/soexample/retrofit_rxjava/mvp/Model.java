package com.umeng.soexample.retrofit_rxjava.mvp;

import com.umeng.soexample.retrofit_rxjava.Bean;
import com.umeng.soexample.retrofit_rxjava.Nummer;

import io.reactivex.Observable;

/**
 * data:2018/12/9
 * author: HJL (磊)
 * function:
 */
public class Model {
    String page;
    String name;

    public Observable<Bean> getListener() {
        return ServiceCntent.Getter().create(Nummer.class).getListener(name,page);
    }


}
