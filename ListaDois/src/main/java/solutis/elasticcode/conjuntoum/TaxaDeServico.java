package solutis.elasticcode.conjuntoum;

import java.util.Scanner;

public class TaxaDeServico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a despesa do cliente: ");
        double gasto = sc.nextDouble();

        System.out.println("A taxa de servico foi:" + (gasto*0.1) + ", totalizando: "+ Math.round(gasto * 1.1));
    }
}
