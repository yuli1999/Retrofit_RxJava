package com.umeng.soexample.retrofit_rxjava;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * data:2018/12/9
 * author: HJL (磊)
 * function:
 */
public interface Nummer {
    @GET("commodity/v1/commodityList")
    Observable<Bean> getListener(@Query("page") String page, @Query("name") String name);

}
