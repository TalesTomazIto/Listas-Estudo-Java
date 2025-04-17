package solutis.elasticcode.funcionario;

import solutis.elasticcode.funcionario.comissoes.Comissao;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio{
    private String universidadeGraduacao;

    public FuncionarioGraduado(Comissao comissao) {
        super(comissao);
    }

    public String getUniversidadeGraduacao() {
        return universidadeGraduacao;
    }

    public void setUniversidadeGraduacao(String universidadeGraduacao) {
        this.universidadeGraduacao = universidadeGraduacao;
    }

    @Override
    public Double getRenda() {
        return super.getRenda() * 2.0 + super.adicionarComissao();
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
