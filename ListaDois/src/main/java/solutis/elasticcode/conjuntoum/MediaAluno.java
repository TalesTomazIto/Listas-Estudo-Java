package solutis.elasticcode.conjuntoum;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira suas 4 notas:");
        double media = 0.0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Nota " + i + ":");
            media += sc.nextInt();
        }

        System.out.println("Sua média foi: " + (media / 4));
    }
}
