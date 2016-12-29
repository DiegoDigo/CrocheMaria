package com.diego.crochemaria.models.produto;

import com.diego.crochemaria.models.produto.Catalogo;
import com.diego.crochemaria.models.produto.DetalheProduto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Diego on 12/12/2016.
 */

public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Catalogo catalogo;
    private String nome;
    private Integer quantidade;
    private BigDecimal preco;
    private String imagem;
    private DetalheProduto detalheProduto;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public DetalheProduto getDetalheProduto() {
        return detalheProduto;
    }

    public void setDetalheProduto(DetalheProduto detalheProduto) {
        this.detalheProduto = detalheProduto;
    }
}

