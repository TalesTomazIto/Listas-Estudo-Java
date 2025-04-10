package solutis.elasticcode;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor de raio inteiro");
        int raio = sc.nextInt();

        double area = 3.14 * raio * raio;

        System.out.println("A área do círculo de raio %d é %f".formatted(raio, area));
    }


}
