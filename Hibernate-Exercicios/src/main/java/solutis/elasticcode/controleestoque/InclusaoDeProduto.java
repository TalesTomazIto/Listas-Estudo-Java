package solutis.elasticcode.controleestoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import solutis.elasticcode.controleestoque.entity.Produto;
import solutis.elasticcode.controleestoque.service.ProdutoService;

@SpringBootApplication
public class InclusaoDeProduto implements CommandLineRunner {

    private final ProdutoService service;

    @Autowired
    public InclusaoDeProduto(ProdutoService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(InclusaoDeProduto.class, args);
    }

    @Override
    public void run(String... args) {
        Produto panela = new Produto("Panela", "Panela de pressão 10 Litros", 56.80);
        service.adicionarProduto(panela);

        Produto cama = new Produto("Cama", "Cama de casal Big", 450.68);
        service.adicionarProduto(cama);

        Produto caixaDeSom = new Produto("Caixa de Som", "Caixa de som JBL", 160.00);
        service.adicionarProduto(caixaDeSom);

    }
}
