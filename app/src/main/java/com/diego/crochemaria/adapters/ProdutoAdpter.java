package com.diego.crochemaria.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import com.diego.crochemaria.models.Produto;

import java.util.List;

/**
 * Created by Diego on 12/12/2016.
 */

public class ProdutoAdpter extends ArrayAdapter<Produto> {

    private List<Produto> produtos;


    public ProdutoAdpter(Context context, int resource) {
        super(context, resource);
    }

    public ProdutoAdpter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public ProdutoAdpter(Context context, int resource, Produto[] objects) {
        super(context, resource, objects);
    }

    public ProdutoAdpter(Context context, int resource, int textViewResourceId, Produto[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public ProdutoAdpter(Context context, int resource, List<Produto> objects) {
        super(context, resource, objects);
    }

    public ProdutoAdpter(Context context, int resource, int textViewResourceId, List<Produto> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
