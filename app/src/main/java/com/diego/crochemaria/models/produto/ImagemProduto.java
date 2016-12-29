package com.diego.crochemaria.models.produto;

import java.io.Serializable;

/**
 * Created by Diego on 29/12/2016.
 */
public class ImagemProduto  implements Serializable{

    private static final long serialVersionUID = 1L;

    private String imagem ;

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
