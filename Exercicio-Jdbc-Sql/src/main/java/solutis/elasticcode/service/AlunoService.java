package solutis.elasticcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.entity.Aluno;
import solutis.elasticcode.entity.Professor;
import solutis.elasticcode.repository.AlunoRepository;
import solutis.elasticcode.repository.ProfessorRepository;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public void adicionarAluno(String nome, String matricula, int numdisciplinas) {
        Aluno aluno = new Aluno(nome, matricula, numdisciplinas);

        repository.save(aluno);
    }
}
