package solutis.elasticcode;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import solutis.elasticcode.livros.Eletronico;
import solutis.elasticcode.livros.Impresso;
import solutis.elasticcode.livros.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class LivrariaVirtual {
    private final int MAX_IMPRESSOS = 10;
    private final int MAX_ELETRONICOS = 20;
    private final int MAX_VENDAS = 50;
    private List<Impresso> impressos = new ArrayList<>();
    private List<Eletronico> eletronicos = new ArrayList<>();
    private List<Venda> vendas = new ArrayList<>();
    private int numImpressos;
    private int numEletronicos;
    private int numVendas;

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("hiberMySQL");
    EntityManager em = emf.createEntityManager();

    public LivrariaVirtual() {
    }

    public LivrariaVirtual(List<Impresso> impressos, List<Eletronico> eletronicos, List<Venda> vendas, int numImpressos, int numEletronicos, int numVendas) {
        this.impressos = impressos;
        this.eletronicos = eletronicos;
        this.vendas = vendas;
        this.numImpressos = numImpressos;
        this.numEletronicos = numEletronicos;
        this.numVendas = numVendas;
    }

    public int getMAX_IMPRESSOS() {
        return MAX_IMPRESSOS;
    }

    public int getMAX_ELETRONICOS() {
        return MAX_ELETRONICOS;
    }

    public int getMAX_VENDAS() {
        return MAX_VENDAS;
    }

    public List<Impresso> getImpressos() {
        return impressos;
    }

    public void setImpressos(List<Impresso> impressos) {
        this.impressos = impressos;
    }

    public List<Eletronico> getEletronicos() {
        return eletronicos;
    }

    public void setEletronicos(List<Eletronico> eletronicos) {
        this.eletronicos = eletronicos;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public int getNumImpressos() {
        return numImpressos;
    }

    public void setNumImpressos(int numImpressos) {
        this.numImpressos = numImpressos;
    }

    public int getNumEletronicos() {
        return numEletronicos;
    }

    public void setNumEletronicos(int numEletronicos) {
        this.numEletronicos = numEletronicos;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    public void cadastrarLivro(Scanner sc) throws Exception{
        try {
            System.out.println("Digite o número do tipo de livro a ser cadastrado:");
            System.out.println("1. Eletrônico");
            System.out.println("2. Impresso");
            System.out.println("3. Ambos");
            int escolha = sc.nextInt();
            sc.nextLine();

            if ((escolha == 1 || escolha == 3) && eletronicos.size() >= MAX_ELETRONICOS) {
                System.out.println("Não é possível cadastrar mais livros eletrônicos.");
                return;
            }
            if ((escolha == 2 || escolha == 3) && impressos.size() >= MAX_IMPRESSOS) {
                System.out.println("Não é possível cadastrar mais livros impressos.");
                return;
            }

            System.out.println("Digite o título do livro:");
            String titulo = sc.nextLine();
            System.out.println("Digite o nome do autor:");
            String autor = sc.nextLine();
            System.out.println("Digite a editora do livro:");
            String editora = sc.nextLine();
            System.out.println("Digite o preço do livro:");
            float preco = sc.nextFloat();
            sc.nextLine();

            em.getTransaction().begin();

            if (escolha == 1 || escolha == 3) {
                boolean jaExiste = false;

                for (Eletronico eletronico : eletronicos) {
                    if (eletronico.getTitulo().equalsIgnoreCase(titulo) &&
                            eletronico.getAutores().equalsIgnoreCase(autor) &&
                            eletronico.getEditora().equalsIgnoreCase(editora)) {
                        jaExiste = true;
                        break;
                    }
                }

                if (jaExiste) {
                    System.out.println("Este livro eletrônico já está cadastrado.");
                } else {
                    System.out.println("Digite o tamanho (em MB) do livro eletrônico:");
                    int tamanho = sc.nextInt();
                    sc.nextLine();

                    Eletronico novoEletronico = new Eletronico(titulo, autor, editora, preco, tamanho);
                    eletronicos.add(novoEletronico);
                    System.out.println("Livro eletrônico cadastrado com sucesso.");

                    em.persist(novoEletronico);
                }
            }

            if (escolha == 2 || escolha == 3) {
                boolean encontrado = false;

                for (Impresso impresso : impressos) {
                    if (impresso.getTitulo().equalsIgnoreCase(titulo) &&
                            impresso.getAutores().equalsIgnoreCase(autor) &&
                            impresso.getEditora().equalsIgnoreCase(editora)) {
                        System.out.println("Livro impresso já cadastrado. Quantidade atual: " + impresso.getEstoque());
                        impresso.setEstoque(impresso.getEstoque() + 1);
                        System.out.println("Nova quantidade: " + impresso.getEstoque());
                        encontrado = true;
                        em.merge(impresso);
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Digite o valor do frete:");
                    float frete = sc.nextFloat();
                    sc.nextLine();

                    Impresso novoImpresso = new Impresso(titulo, autor, editora, preco, frete, 1);
                    impressos.add(novoImpresso);
                    System.out.println("Livro impresso cadastrado com sucesso.");

                    em.persist(novoImpresso);
                }
            }
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {

        }
    }

    public void listarLivrosImpressos() {
        for (int i = 0; i < impressos.size(); i++) {
            Impresso impresso = impressos.get(i);
            System.out.println(i + " - " + impresso.getTitulo() +
                    " | Autor: " + impresso.getAutores() +
                    " | Preço: R$" + impresso.getPreco() +
                    " | Estoque: " + impresso.getEstoque());
        }
    }

    public void listarLivrosEletronicos() {
        for (int i = 0; i < eletronicos.size(); i++) {
            Eletronico eletronico = eletronicos.get(i);
            System.out.println(i + " - " +
                    eletronico.getTitulo() +
                    " | Autor: " + eletronico.getAutores() +
                    " | Preço: R$" + eletronico.getPreco() +
                    " | Tamanho: " + eletronico.getTamanho() + "MB");
        }
    }



    public void realizarVenda(Scanner sc) {
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Quantos livros deseja comprar?");
        int quantidadeLivros = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidadeLivros; i++) {
            System.out.println("Livro #" + (i + 1));
            System.out.println("Tipo do livro:");
            System.out.println("1. Eletrônico");
            System.out.println("2. Impresso");
            int tipo = sc.nextInt();
            sc.nextLine();

            if (tipo == 1) {
                if (eletronicos.isEmpty()) {
                    System.out.println("Não há livros eletrônicos disponíveis.");
                    continue;
                }

                listarLivrosEletronicos();

                System.out.println("Escolha o número do livro eletrônico que deseja comprar:");
                int escolha = sc.nextInt();
                sc.nextLine();

                if (escolha >= 0 && escolha < eletronicos.size()) {
                    Eletronico livro = eletronicos.get(escolha);
                    System.out.println("Livro eletrônico '" +
                            livro.getTitulo() +
                            "' comprado com sucesso por R$ " +
                            livro.getPreco());
                } else {
                    System.out.println("Opção inválida.");
                }

            } else if (tipo == 2) {
                if (impressos.isEmpty()) {
                    System.out.println("Não há livros impressos disponíveis.");
                    continue;
                }

                listarLivrosImpressos();

                System.out.println("Escolha o número do livro impresso que deseja comprar:");
                int escolha = sc.nextInt();
                sc.nextLine();

                if (escolha >= 0 && escolha < impressos.size()) {
                    Impresso livro = impressos.get(escolha);

                    if (livro.getEstoque() > 0) {
                        livro.setEstoque(livro.getEstoque() - 1);
                        System.out.println("Livro impresso '" +
                                livro.getTitulo() +
                                "' comprado com sucesso por R$ " +
                                livro.getPreco());
                    } else {
                        System.out.println("Este livro está fora de estoque.");
                    }
                } else {
                    System.out.println("Opção inválida.");
                }

            } else {
                System.out.println("Tipo inválido.");
            }
        }

        System.out.println("Venda finalizada para o cliente: " + nomeCliente);
    }

    public void fechar() {
        em.close();
        emf.close();
    }

}
