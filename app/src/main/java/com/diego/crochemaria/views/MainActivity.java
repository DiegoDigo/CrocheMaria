package com.diego.crochemaria.views;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.diego.crochemaria.R;
import com.diego.crochemaria.adapters.ProdutoAdpter;
import com.diego.crochemaria.endpoint.EndPoint;
import com.diego.crochemaria.models.Produto;
import com.diego.crochemaria.utils.ConfigRetrofit;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    private ListView produtos;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        teste.setText(this.getTitle().toString());
//        Typeface font = Typeface.createFromAsset(getAssets(),"Pacifico-Regular.ttf");
//        teste.setTypeface(font);
//        this.setTitle(teste.toString());





//        produtos = (ListView) findViewById(R.id.list_prod);
//
//        Retrofit retrofit = ConfigRetrofit.conexao();
//        EndPoint api = retrofit.create(EndPoint.class);
//        Call<List<Produto>> call = api.produtos();
//        call.enqueue(new Callback<List<Produto>>() {
//            @Override
//            public void onResponse(Response<List<Produto>> response, Retrofit retrofit) {
//                final ProdutoAdpter adpter = new ProdutoAdpter(getBaseContext(), response.body());
//                produtos.setAdapter(adpter);
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//
//            }
//        });

    }
}
