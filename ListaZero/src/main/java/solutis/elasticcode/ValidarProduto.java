package solutis.elasticcode;

public class ValidarProduto {

    String validarProduto(String s) {
        if (s.equals("001")) {
            return "Parafuso";
        } else if (s.equals("002")) {
            return "Porca";
        } else if (s.equals("003")) {
            return "Prego";
        }
        return "Diversos";
    }
}
