package com.diego.crochemaria.utils;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Diego on 12/12/2016.
 */

public class ConfigRetrofit {

    private final String url = "192.168.116.1/v1";

    public Retrofit conexao(){
        Retrofit retrofit = new Retrofit
                .Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
                .build();
        return retrofit;
    }

}
