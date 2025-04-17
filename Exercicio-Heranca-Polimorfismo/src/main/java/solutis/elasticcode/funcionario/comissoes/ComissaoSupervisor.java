package solutis.elasticcode.funcionario.comissoes;

public class ComissaoSupervisor extends Comissao{
    @Override
    public Double getValorAdicional() {
        return super.getValorAdicional() + 600.0;
    }
}
