package solutis.elasticcode;

import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva uma palavra:");
        String palindromo = sc.nextLine();
        boolean isPalindromo = true;

        for (int i = 0; i < palindromo.length(); i++) {
            if (palindromo.charAt(i) != palindromo.charAt(palindromo.length()-1-i)) {
                isPalindromo = false;
            }
        }
        if (isPalindromo) {
            System.out.println("A palavra %s é um palindromo".formatted(palindromo));
        } else {
            System.out.println("A palavra %s não é um palindromo".formatted(palindromo));
        }
    }
}
