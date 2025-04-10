package solutis.elasticcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KmPorLitro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdVeiculos = 0;
        int vez = 0;
        List<Integer> litros = new ArrayList<>();
        List<Integer> kms = new ArrayList<>();
        List<Double> kmPorLitro = new ArrayList<>();


        System.out.println("Digite a quantidade de veiculos a serem analisados:");
        qtdVeiculos = sc.nextInt();

        while (vez < qtdVeiculos) {
            System.out.println("Digite a quantidade de Km percorridos:");
            kms.add(sc.nextInt());

            System.out.println("Digite a quantidade de litros de combustivel gastos:");
            litros.add(sc.nextInt());

            vez++;
        }

        for (int i = 0; i < kms.size(); i++) {
            double calculo =(kms.get(i) / litros.get(i));
            Math.round(calculo);
            kmPorLitro.add(calculo);
        }

        double media = 0.0;

        for (int i = 0; i < kmPorLitro.size(); i++) {
            System.out.println("No tanque "+(i+1)+" foram feitos: "+ kmPorLitro.get(i)+"quilômetros por litro");
            media += kmPorLitro.get(i);
        }

        System.out.println("A média de quilômetros por litro foi: " + (media / kmPorLitro.size()));

    }
}
