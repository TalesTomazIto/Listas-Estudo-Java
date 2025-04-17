package solutis.elasticcode;

import java.time.LocalDate;

public class Empregado extends Pessoa{
    private Integer codigoSetor;
    private Double salariobase;
    private Double imposto;

    public Empregado(String s, String carlosAlberto, String paulista, String string, LocalDate localDate, double v, Double v1) {
    }

    public Empregado(String cpf, String nome, String endereco, String telefone, LocalDate dataNascimento, Integer codigoSetor, Double salariobase, Double imposto) {
        super(cpf, nome, endereco, telefone, dataNascimento);
        this.codigoSetor = codigoSetor;
        this.salariobase = salariobase;
        this.imposto = imposto;
    }

    public Integer getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(Integer codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public Double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(Double salariobase) {
        this.salariobase = salariobase;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double calcularSalario() {
        double v = salariobase - (salariobase * (imposto / 100));
        return v;
    }

}
