package solutis.elasticcode;

import java.time.LocalDate;

public class Vendedor extends Empregado{
    private Double valorVendas;
    private Double comissao;

    public Vendedor(String cpf, String nome, String endereco, String telefone, LocalDate dataNascimento, Integer codigoSetor, Double salariobase, Double imposto, Double valorVendas, Double comissao) {
        super(cpf, nome, endereco, telefone, dataNascimento, codigoSetor, salariobase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(Double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + (valorVendas * (comissao/100));
    }
}
