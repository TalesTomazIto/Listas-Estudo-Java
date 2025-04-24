package solutis.elasticcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import solutis.elasticcode.entity.Dinossauros;
import solutis.elasticcode.repository.DinossaurosRepository;

import java.util.Optional;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private DinossaurosRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Inserção dinossauros no banco");

        for (int i = 1; i <= 4; i++) {
            Dinossauros dinossauro = new Dinossauros();
            dinossauro.setEspecie("Tiranossauro");
            dinossauro.setGenero("SufriciosSacrifis");
            repository.save(dinossauro);
        }

        System.out.println("\n Buscando dinossauro com ID 1:");
        Optional<Dinossauros> optionalDino = repository.findById(1);
        optionalDino.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Dinossauro com ID 1 não encontrado.")
        );

        System.out.println("\n Removendo dinossauro com ID 2...");
        if (repository.existsById(2)) {
            repository.deleteById(2);
            System.out.println("Dinossauro com ID 2 removido.");
        } else {
            System.out.println("Dinossauro com ID 2 não existe.");
        }

        System.out.println("\nListando todos os dinossauros no banco:");
        repository.findAllDinossauros().forEach(System.out::println);
    }
}
