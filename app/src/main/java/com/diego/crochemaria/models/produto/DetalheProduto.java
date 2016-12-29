package com.diego.crochemaria.models.produto;

import java.io.Serializable;

/**
 * Created by Diego on 28/12/2016.
 */
public class DetalheProduto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String descricao ;
    private ImagemProduto imagens ;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ImagemProduto getImagens() {
        return imagens;
    }

    public void setImagens(ImagemProduto imagens) {
        this.imagens = imagens;
    }
}
