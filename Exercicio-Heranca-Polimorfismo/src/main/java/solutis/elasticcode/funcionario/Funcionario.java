package solutis.elasticcode.funcionario;

import solutis.elasticcode.funcionario.comissoes.Comissao;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private Double renda = 1000.0;
    private Comissao comissao;

    public Funcionario(Comissao comissao) {
        this.comissao = comissao;
    }

    public Double adicionarComissao(){
        return comissao.getValorAdicional();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                "comissao='" + getComissao().getClass() + '\'' +
                "salario='" + getRenda() + '\'' +
                '}';
    }
}
