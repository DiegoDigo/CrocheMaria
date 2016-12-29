package com.diego.crochemaria.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diego.crochemaria.R;
import com.diego.crochemaria.models.produto.Produto;
import com.squareup.picasso.Picasso;

import java.util.List;


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
        return new ProdutoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Typeface fontProduto = Typeface.createFromAsset(context.getAssets(),"Pacifico-Regular.ttf");
//FIXME:Mudar para a tela de detalhe produto
//        Typeface fontDescricao = Typeface.createFromAsset(context.getAssets(),"YanoneKaffeesatz-Light.ttf");

        ProdutoViewHolder viewHolder = (ProdutoViewHolder) holder;
        viewHolder.nomeProduto.setText(produtos.get(position).getNome());
        viewHolder.valorProduto.setText(String.format("R$ ",produtos.get(position).getPreco().toString()));
        Context c = viewHolder.img.getContext();
        Picasso.with(c).load(produtos.get(position).getImagem()).into(viewHolder.img);
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }
}
