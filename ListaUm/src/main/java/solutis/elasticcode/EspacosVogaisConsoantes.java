package solutis.elasticcode;

import java.util.Scanner;

public class EspacosVogaisConsoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        String texto = sc.nextLine().toLowerCase();

        int vogais = 0;
        int consoantes = 0;
        int espacos = 0;

        for (int i = 0; i < texto.length(); i++) {
            char cha = texto.charAt(i);

            if (Character.isWhitespace(cha)) {
                espacos++;
            } else if ("aeiou".indexOf(cha) != -1) {
                vogais++;
            } else if (Character.isLetter(cha)) {
                consoantes++;
            }
        }

        System.out.println("Vogais: %d , Consoantes: %d , Espaços em Branco: %d".formatted(vogais, consoantes, espacos));
    }
}
