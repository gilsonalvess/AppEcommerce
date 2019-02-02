package com.dwm.ufg.appecommerce;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produto implements Serializable {
    private long cod;
    private String descricao;
    private int imagem;
    private String detalhesProduto;
    private double preco;

    public Produto(long cod, String descricao, double preco, int imagem) {
        this.cod = cod;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getDetalhesProduto() {
        return detalhesProduto;
    }

    public void setDetalhesProduto(String detalhesProduto) {
        this.detalhesProduto = detalhesProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod=" + cod +
                ", descricao='" + descricao + '\'' +
                ", detalhesProduto='" + detalhesProduto + '\'' +
                ", preco=" + preco +
                '}';
    }
}
