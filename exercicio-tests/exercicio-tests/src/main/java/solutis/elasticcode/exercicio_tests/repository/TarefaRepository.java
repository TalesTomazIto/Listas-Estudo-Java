package solutis.elasticcode.exercicio_tests.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solutis.elasticcode.exercicio_tests.entity.Tarefa;

import java.util.Optional;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    Optional<Tarefa> findByTituloContainingIgnoreCase(String nome);
}
