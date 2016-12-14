package com.diego.crochemaria.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.diego.crochemaria.R;

/**
 * Created by Diego on 14/12/2016.
 */

public class ProdutoViewHolder extends RecyclerView.ViewHolder{

    final TextView nomeProduto, valorProduto;
    final ImageView img;



    public ProdutoViewHolder(View itemView) {
        super(itemView);
        this.nomeProduto = (TextView) itemView.findViewById(R.id.produto);
        this.valorProduto = (TextView) itemView.findViewById(R.id.preco);
        this.img = (ImageView) itemView.findViewById(R.id.img);

    }


}
