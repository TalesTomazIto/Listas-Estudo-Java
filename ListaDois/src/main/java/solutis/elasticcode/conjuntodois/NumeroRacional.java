package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class NumeroRacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        int numerador = scanner.nextInt();

        System.out.print("Digite o denominador: ");
        int denominador = scanner.nextInt();

        if (denominador == 0) {
            System.out.println("O denominador não pode ser 0!");
        } else {
            float real = (float) (numerador / denominador);

            System.out.printf("O número real é: %.2f", real);
        }
    }
}
