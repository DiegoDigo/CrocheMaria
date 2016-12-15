package com.diego.crochemaria.utils;

import android.util.Log;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Diego on 12/12/2016.
 */

public class ConfigRetrofit {

     public static Retrofit conexao(){
        String url = "http://192.168.0.116:8000/v1/";
        Retrofit retrofit = new Retrofit
                .Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
                .build();
        return retrofit;
    }

}
