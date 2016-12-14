package com.diego.crochemaria.utils;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Diego on 12/12/2016.
 */

public class ConfigRetrofit {

     public static Retrofit conexao(){
        Retrofit retrofit = new Retrofit
                .Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://192.168.116.1/v1")
                .build();
        return retrofit;
    }

}
