package solutis.elasticcode.funcionario;

import solutis.elasticcode.funcionario.comissoes.Comissao;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico{
    private String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(Comissao comissao) {
        super(comissao);
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }

    public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    @Override
    public Double getRenda() {
        return super.getRenda() * 1.5 + super.adicionarComissao();
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
