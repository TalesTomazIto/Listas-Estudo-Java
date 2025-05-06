package solutis.elasticcode.exercicio_tests.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solutis.elasticcode.exercicio_tests.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
