package solutis.elasticcode;

import solutis.elasticcode.livros.Eletronico;
import solutis.elasticcode.livros.Impresso;
import solutis.elasticcode.livros.Livro;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int numVendas;
    private int numero;
    private String cliente;
    private float preco;
    private List<Livro> livrosVenda = new ArrayList<>();

    public Venda() {
    }

    public Venda(int numVendas, int numero, String cliente, float preco) {
        this.numVendas = numVendas;
        this.numero = numero;
        this.cliente = cliente;
        this.preco = preco;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void adicionarLivro(Livro livro) {
        livrosVenda.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livrosVenda) {
            System.out.println(livro);
        }
    }
}
