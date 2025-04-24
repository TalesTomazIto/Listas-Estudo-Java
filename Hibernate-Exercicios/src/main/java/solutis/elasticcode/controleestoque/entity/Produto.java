package solutis.elasticcode.controleestoque.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cod;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private Double preco;

    public Produto() {
    }

    public Produto(String nome, String descricao, Double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Integer getCod() {
        return cod;
    }

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
}
