package solutis.elasticcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //7.
        int a = 5;
        int b = 10;
        System.out.println(a + " e " + b);

        a = b;
        System.out.println(a);

        b = a;
        System.out.println(b);

        //8.
        ParOuImpar verificar = new ParOuImpar();

        System.out.println(verificar.isImpar(8));

        //9.
        for(int i = 0 ; i <= 10 ; i++) {
            System.out.println(i * i);
        }

        //10;
        int a1 = 6;
        int b1 = 4;
        int c1 = a1/b1;

        System.out.println(c1);

        //11.
        ValidarProduto validarProduto = new ValidarProduto();

        System.out.println(validarProduto.validarProduto("001"));
        System.out.println(validarProduto.validarProduto("002"));
        System.out.println(validarProduto.validarProduto("003"));
        System.out.println(validarProduto.validarProduto("009"));

        //12.
        for (double i = 3.0 ; i <= 100 ; i += 3) {
            double resultado;
            resultado = i / 2;
            System.out.println(resultado);
        }


        //13.
        for (int i = 1 ; i <= 6 ; i++) {
            for (int j = 0; j <= 6; j++) {
                if (i + j == 7) {
                    System.out.println("%d + %d = 7".formatted(i,j));
                }
            }
        }

        //14.
        Scanner sc = new Scanner(System.in);
        int vez = 0;
        int valorDaVez;
        int soma = 0;

        while (vez <= 50) {
            if (vez <= 49) {
                System.out.println("escreva mais " + (50 - vez) + " numero(s):");
                valorDaVez = sc.nextInt();
                vez++;
                soma += valorDaVez;
            } else {
                System.out.println((double) soma / 50);
                vez++;
            }
        }

        //15.
        Scanner sc1 = new Scanner(System.in);
        int vez1 = 0;
        int valorDaVez1;
        int soma1 = 0;

        do {
            if (vez1 <= 49) {
                System.out.println("escreva mais " + (50 - vez1) + " numero(s):");
                valorDaVez1 = sc.nextInt();
                vez1++;
                soma1 += valorDaVez1;
            } else {
                System.out.println((double) soma1 / 50);
                vez1++;
            }
        } while (vez1 <= 50);
    }
}