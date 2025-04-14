package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println("Você ainda é menor de idade!");
        } else {
            System.out.println("Você já atingiu a maioridade;");
        }
    }
}
