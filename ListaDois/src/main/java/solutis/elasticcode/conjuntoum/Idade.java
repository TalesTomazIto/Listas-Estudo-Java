package solutis.elasticcode.conjuntoum;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNasc = sc.nextInt();

        int anoAtual = LocalDateTime.now().getYear();

        System.out.println("Ao final desse ano você terá: "+(anoAtual - anoNasc));
    }
}
