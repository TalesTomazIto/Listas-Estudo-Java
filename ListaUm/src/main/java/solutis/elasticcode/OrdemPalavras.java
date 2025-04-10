package solutis.elasticcode;

import java.util.*;

public class OrdemPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra1 = sc.nextLine();

        System.out.println("Digite uma segunda palavra:");
        String palavra2 = sc.nextLine();

        if (palavra1.compareTo(palavra2) == 0) {
            System.out.println("As palavras te o mesmo tamanho");
        } else if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("A palavra "+ palavra2+" é maior.");
        } else {
            System.out.println("A palavra "+ palavra1+" é maior");
        }

        List<String> palavras = new ArrayList<>();
        palavras.add(palavra1);
        palavras.add(palavra2);

        Collections.sort(palavras);

        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
