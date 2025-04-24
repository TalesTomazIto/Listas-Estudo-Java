package solutis.elasticcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import solutis.elasticcode.service.AlunoService;
import solutis.elasticcode.service.ProfessorService;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    AlunoService alunoService;

    @Autowired
    ProfessorService professorService;


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {

        professorService.adicionarProfessor("Rolando Nero", "Matemática", 45);

        professorService.adicionarProfessor("Raimundo Lero", "Física", 32);

        alunoService.adicionarAluno("Pachco Vargas", "34345", 3);

        alunoService.adicionarAluno("Tereza Lopes", "65467", 4);

        alunoService.adicionarAluno("Joana Dark", "87844", 1);

    }
}