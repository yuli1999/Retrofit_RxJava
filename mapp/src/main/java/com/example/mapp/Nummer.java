package com.example.mapp;



import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

//API
public interface Nummer {
    @GET("commodity/v1/commodityList")

    Observable<Bean> getListener(@Query("page") String page,@Query("name") String name);
    //@POST()
//  @FormUrlEncoded
}
