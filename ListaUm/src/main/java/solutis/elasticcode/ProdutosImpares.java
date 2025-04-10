package solutis.elasticcode;

public class ProdutosImpares {
    public static void main(String[] args) {
        for (int i = 15; i <= 30 ; i++) {
            if (i % 2 != 0) {
                for (int j = 15; j <= 30 ; j++) {
                    if (j % 2 != 0) {
                        System.out.println(i * j);
                    }
                }
            }
        }
    }
}
