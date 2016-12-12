package com.diego.crochemaria.models;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Diego on 12/12/2016.
 */

public class Produto implements Serializable{

    private static final long serialVersionUID = 1L;


    private Long id;
    private String produto;
    private BigDecimal preco;
    private Integer quantidade;
    private String descricao;
    private String imagem ;
    private Categoria categoria;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
