package com.umeng.soexample.retrofit_rxjava.mvp;

import com.umeng.soexample.retrofit_rxjava.NetUtil;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * data:2018/12/9
 * author: HJL (磊)
 * function:
 */
class ServiceCntent {
    Retrofit retrofit;

    private ServiceCntent() {
        retrofit = new Retrofit.Builder()
                .baseUrl(NetUtil.PATH)
                //
                .addConverterFactory(GsonConverterFactory.create())
                //
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())

                .build();

    }

    //暴露在外部的方法
    public static ServiceCntent Getter() {
        return Getter.sserviceCntent;
    }

    private static class Getter {
        private static final ServiceCntent sserviceCntent = new ServiceCntent();
    }

    public <T> T create(Class<T> tClass) {
        return retrofit.create(tClass);
    }


}
