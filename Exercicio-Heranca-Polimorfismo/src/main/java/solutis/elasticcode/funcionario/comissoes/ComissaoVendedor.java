package solutis.elasticcode.funcionario.comissoes;

public class ComissaoVendedor extends Comissao{
    @Override
    public Double getValorAdicional() {
        return super.getValorAdicional() + 250.0;
    }
}
