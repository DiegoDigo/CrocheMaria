package com.diego.crochemaria.models;

import java.io.Serializable;

/**
 * Created by Diego on 12/12/2016.
 */

public class Categoria implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;
    private String categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
