package solutis.elasticcode.controleestoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import solutis.elasticcode.controleestoque.service.ProdutoService;

@SpringBootApplication
public class AlteracaoDeProduto implements CommandLineRunner {

    private final ProdutoService service;

    @Autowired
    public AlteracaoDeProduto(ProdutoService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(AlteracaoDeProduto.class, args);
    }

    @Override
    public void run(String... args) {

        service.alterarPrecoProduto(345.00, 2);
    }
}

