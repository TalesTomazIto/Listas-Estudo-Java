package solutis.elasticcode;

import java.util.Scanner;

public class maiorValor {
    public static void main(String[] args) {

        //2.
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um inteiro:");
        int a = sc.nextInt();
        System.out.println("Insira um segundo inteiro:");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}
