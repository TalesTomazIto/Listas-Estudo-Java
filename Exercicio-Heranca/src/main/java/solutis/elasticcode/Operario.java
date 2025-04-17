package solutis.elasticcode;

import java.time.LocalDate;

public class Operario extends Empregado{
    private Double valorProducao;
    private Double comissao;

    public Operario(String cpf, String nome, String endereco, String telefone, LocalDate dataNascimento, Integer codigoSetor, Double salariobase, Double imposto, Double valorProducao, Double comissao) {
        super(cpf, nome, endereco, telefone, dataNascimento, codigoSetor, salariobase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(Double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + (valorProducao * (comissao/100));
    }
}
