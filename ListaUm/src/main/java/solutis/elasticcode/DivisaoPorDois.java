package solutis.elasticcode;

public class DivisaoPorDois {
    public static void main(String[] args) {
        double divisaoPorDois;

        for (int i = 0; i <= 100 ; i = i + 3) {
            divisaoPorDois = (double) i / 2;
            System.out.println(divisaoPorDois);
        }
    }
}
