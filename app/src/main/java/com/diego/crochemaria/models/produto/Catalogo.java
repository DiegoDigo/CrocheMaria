package com.diego.crochemaria.models.produto;

import java.io.Serializable;

/**
 * Created by Diego on 12/12/2016.
 */

public class Catalogo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;
    private String Catalogo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatalogo() {
        return Catalogo;
    }

    public void setCatalogo(String categoria) {
        this.Catalogo = categoria;
    }
}
