package solutis.elasticcode;

import solutis.elasticcode.livros.Eletronico;
import solutis.elasticcode.livros.Impresso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Impresso> impressos = new ArrayList<>();
        List<Eletronico> eletronicos = new ArrayList<>();
        List<Venda> vendas = new ArrayList<>();

        LivrariaVirtual sistema = new LivrariaVirtual(impressos, eletronicos, vendas, 0, 0, 0);

        int opcao;
        do {
            System.out.println("\n--------------------LIVRARIA VIRTUAL--------------------");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Realizar venda");
            System.out.println("3 - Listar livros impressos");
            System.out.println("4 - Listar livros eletrônicos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    sistema.cadastrarLivro(sc);
                    break;
                case 2:
                    sistema.realizarVenda(sc);
                    break;
                case 3:
                    sistema.listarLivrosImpressos();
                    break;
                case 4:
                    sistema.listarLivrosEletronicos();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
