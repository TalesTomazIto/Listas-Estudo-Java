package solutis.elasticcode.conjuntoum;

import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor inicial de débito: ");
        double debito = sc.nextDouble();

        System.out.println("Quantidade de meses:");
        int qtdMeses = sc.nextInt();

        System.out.println("Valor da taxa de juros:");
        double juros = sc.nextDouble() / 100;

        double total = debito * (1 + juros * qtdMeses);

        System.out.println("O valor total a ser pago será: " + total);
    }
}
