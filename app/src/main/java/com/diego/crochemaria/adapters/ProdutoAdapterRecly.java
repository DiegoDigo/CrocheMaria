package com.diego.crochemaria.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diego.crochemaria.R;
import com.diego.crochemaria.models.Produto;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Diego on 14/12/2016.
 */

public class ProdutoAdapterRecly extends RecyclerView.Adapter {

    private  List<Produto> produtos;
    private Context context;

    public ProdutoAdapterRecly(Context c ,List<Produto> produtos){
        this.produtos =produtos;
        this.context = c;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_produto, parent,false);
        ProdutoViewHolder holder = new ProdutoViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ProdutoViewHolder viewHolder = (ProdutoViewHolder) holder;
        viewHolder.nomeProduto.setText(produtos.get(position).getProduto());
        viewHolder.valorProduto.setText("R$ "  + produtos.get(position).getPreco().toString());
        Context c = viewHolder.img.getContext();
        Picasso.with(c).load(produtos.get(position).getImagem()).into(viewHolder.img);
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }
}
