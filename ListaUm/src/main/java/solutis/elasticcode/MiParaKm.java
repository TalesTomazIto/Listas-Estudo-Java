package solutis.elasticcode;

import java.util.Scanner;

public class MiParaKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreve uma distância em milhas:");
        double distMi = sc.nextDouble();
        double distKm = distMi * 1.609;

        System.out.println("%f milhas são %f quilômetros".formatted(distMi, distKm));

    }


}
