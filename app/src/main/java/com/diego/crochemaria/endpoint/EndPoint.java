package com.diego.crochemaria.endpoint;

import android.os.Process;

import com.diego.crochemaria.models.Categoria;
import com.diego.crochemaria.models.Produto;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Diego on 12/12/2016.
 */

public interface EndPoint {

    @GET("produtos/")
    public Call<List<Produto>> produtos();

    @GET("categorias/")
    public Call<List<Categoria>> categorias();

}
