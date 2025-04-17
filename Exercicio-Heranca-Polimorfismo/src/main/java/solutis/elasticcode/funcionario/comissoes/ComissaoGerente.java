package solutis.elasticcode.funcionario.comissoes;

public class ComissaoGerente extends Comissao{
    @Override
    public Double getValorAdicional() {
        return super.getValorAdicional() + 1500.0;
    }
}
