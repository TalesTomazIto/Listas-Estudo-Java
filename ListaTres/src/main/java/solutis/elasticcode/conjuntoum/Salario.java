package solutis.elasticcode.conjuntoum;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário:");
        Double salario = sc.nextDouble();

        System.out.println("Você recebe um equivaente a " + (salario / 1320) + " Ssalários mínimos");

    }
}
