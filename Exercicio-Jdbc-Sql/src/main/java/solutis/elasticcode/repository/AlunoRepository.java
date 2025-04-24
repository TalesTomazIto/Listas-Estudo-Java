package solutis.elasticcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solutis.elasticcode.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
