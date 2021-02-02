package com.katepatty.katesopendata

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiService {

    @GET("/posts")
    fun index(): Call<List<Posts>>

    //@GET("users/list?sort=desc")

    //@GET("users/list")
    //Call<List<User>> groupList(@Query("sort") String sort);

    //@POST("users/new")
    //Call<User> createUser(@Body User user);
    //fun createUser(@Body user: User?): Call<User>

}