package solutis.elasticcode.springbootex.controller.dto;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class ProdutoAtualizarDto {

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private Double preco;

    @Column
    private Integer qtdEstoque;

    @Column(nullable = false)
    private String codigoDeBarras;

    @Column
    private String categoria;

    @Column
    private LocalDate dataCadasto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataCadasto() {
        return dataCadasto;
    }

    public void setDataCadasto(LocalDate dataCadasto) {
        this.dataCadasto = dataCadasto;
    }
}
