package solutis.elasticcode.funcionario;

import solutis.elasticcode.funcionario.comissoes.Comissao;

public class FuncionarioEnsinoBasico extends Funcionario{
    private String escolaEnsinoBasico;

    public FuncionarioEnsinoBasico(Comissao comissao) {
        super(comissao);
    }

    public String getEscolaEnsinoBasico() {
        return escolaEnsinoBasico;
    }

    public void setEscolaEnsinoBasico(String escolaEnsinoBasico) {
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

    @Override
    public Double getRenda() {
        return super.getRenda() * 1.1 + super.adicionarComissao();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + super.getNome() + '\'' +
                "comissao='" + super.getComissao().getClass().getSimpleName() + '\'' +
                "salario='" + getRenda() + '\'' +
                '}';
    }
}
