package solutis.elasticcode;

import java.time.LocalDate;

public class Administrador extends Empregado{
    private Double ajudaDeCusto;

    public Administrador(String cpf, String nome, String endereco, String telefone, LocalDate dataNascimento, Integer codigoSetor, Double salariobase, Double imposto, Double ajudaDeCusto) {
        super(cpf, nome, endereco, telefone, dataNascimento, codigoSetor, salariobase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(Double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

}
