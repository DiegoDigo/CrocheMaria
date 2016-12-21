package com.diego.crochemaria.views;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.diego.crochemaria.R;
import com.diego.crochemaria.adapters.ProdutoAdapterRecly;
import com.diego.crochemaria.endpoint.EndPoint;
import com.diego.crochemaria.models.Produto;
import com.diego.crochemaria.utils.ConfigRetrofit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  TextView msg;
    private StaggeredGridLayoutManager mStaggeredGridLayoutManager;
    private Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        teste.setText(this.getTitle().toString());
//        Typeface font = Typeface.createFromAsset(getAssets(),"Pacifico-Regular.ttf");
//        teste.setTypeface(font);
//        this.setTitle(teste.toString());

        recyclerView = (RecyclerView) findViewById(R.id.listProduto);
        msg = (TextView) findViewById(R.id.msg);
        setToolBar();




        Retrofit retrofit = ConfigRetrofit.conexao();
        EndPoint api = retrofit.create(EndPoint.class);
        Call<List<Produto>> call = api.produtos();
        call.enqueue(new Callback<List<Produto>>() {
            @Override
            public void onResponse(Response<List<Produto>> response, Retrofit retrofit) {
                final ProdutoAdapterRecly adapter = new ProdutoAdapterRecly(getBaseContext(),response.body());
//                RecyclerView.LayoutManager layout = new LinearLayoutManager(getBaseContext(),LinearLayoutManager.VERTICAL,false);
                mStaggeredGridLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(mStaggeredGridLayoutManager);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Throwable t) {
                msg.setText(t.getMessage().toString());
                Log.i("LOG", t.getMessage());
            }
        });

    }

    private void setToolBar() {
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            toast = Toast.makeText(getBaseContext(), "teste  - "+ id,Toast.LENGTH_SHORT);
            toast.show();
        }

        return super.onOptionsItemSelected(item);
    }

}
