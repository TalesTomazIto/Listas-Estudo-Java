package solutis.elasticcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.entity.Professor;
import solutis.elasticcode.repository.ProfessorRepository;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public void adicionarProfessor(String nome, String disciplina, int idade) {
        Professor professor = new Professor(nome, disciplina, idade);

        repository.save(professor);
    }
 }
