package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class VotosEleicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você ainda não pode votar!");
        } else if (idade < 18 || idade >= 65) {
            System.out.println("Se for de deu interesse, você pode votar!");
        } else {
            System.out.println("Você DEVE votar ou ao menos justificar!");
        }
    }
}
