package solutis.elasticcode.funcionario.comissoes;

public abstract class Comissao {
    private Double valorAdicional = 0.0;

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
