package solutis.elasticcode;

import java.util.Scanner;

public class PrimosMenores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor inteiro:");
        int n = sc.nextInt();
        int primoDaVez;

            for (int i = 2 ; i <= n ; i++) {
                boolean primo = true;
                primoDaVez = i;

                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    System.out.println(primoDaVez);
                }
            }
    }
}
