package com.diego.crochemaria.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.diego.crochemaria.R;
import com.diego.crochemaria.models.Produto;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Diego on 12/12/2016.
 */

public class ProdutoAdpter extends ArrayAdapter<Produto> {

    private List<Produto> produtos;
    private TextView nomeProduto , precoProduto;

    public ProdutoAdpter(Context context, List<Produto> produtos) {
        super(context, R.layout.layout_produto, produtos);
        this.produtos = produtos;
    }

   public View getView(int position , View convertView , ViewGroup parent){
       LayoutInflater inflater = LayoutInflater.from(getContext());
       View item = inflater.inflate(R.layout.layout_produto, null);
       precoProduto = (TextView) item.findViewById(R.id.preco);
       nomeProduto = (TextView) item.findViewById(R.id.produto);
       ImageView img = (ImageView) item.findViewById(R.id.img);
       Picasso.with(getContext()).load(produtos.get(position).getImagem()).resize(100,100).into(img);
       precoProduto.setText(produtos.get(position).getPreco().toString());
       nomeProduto.setText(produtos.get(position).getProduto());

       return item;
   }

    public int geCount(){
        if(produtos == null) return 0;
        return produtos.size();
    }

    @Override
    public Produto getItem(final  int position){
        if(produtos == null || produtos.size() == 0) return null;
        return produtos.get(position);
    }
    @Override
    public long getItemId(final int position){
        return getItem(position).getId();
    }
}
