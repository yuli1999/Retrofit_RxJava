package com.example.mapp;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceCntent {

    private final Retrofit retrofit;

    private ServiceCntent() {
        retrofit = new Retrofit.Builder()
                .baseUrl(NetUtil.PATH)
                //
                .addConverterFactory(GsonConverterFactory.create())
                //
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())

                .build();
    }

    //暴露外部方法
    public static ServiceCntent Getter() {
        return Gettter.sServiceCntent;
    }

    private static class Gettter {
        private static final ServiceCntent sServiceCntent = new ServiceCntent();
    }

    public <T> T createe(Class<T> tClass) {
        return retrofit.create(tClass);
    }

}
