package solutis.elasticcode.conjuntoum;

import java.util.Scanner;

public class PercentualGenero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas meninas na sala?");
        int meninas = sc.nextInt();

        System.out.println("Quantos meninos na sala?");
        int meninos = sc.nextInt();

        double porcMa = (double) meninas / (meninas + meninos) * 100;
        double porcMo = 100 - porcMa;

        System.out.println("A porcentagem de meninas é "+ Math.round(porcMa) + "%");
        System.out.println("E a de meninos é "+ Math.round(porcMo) + "%");
    }
}
