package solutis.elasticcode;

import java.time.LocalDate;

public class Fornecedor extends Pessoa{
    private Double valorCredito;
    private Double valorDivida;

    public Fornecedor(String cpf, String nome, String endereco, String telefone, LocalDate dataNascimento) {
        super(cpf, nome, endereco, telefone, dataNascimento);
    }

    public Fornecedor(String cpf, String nome, String endereco, String telefone, LocalDate dataNascimento, Double valorCredito, Double valorDivida) {
        super(cpf, nome, endereco, telefone, dataNascimento);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public Double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(Double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public Double obterSaldo() {
        return (valorCredito - valorDivida);
    }
}
