package solutis.elasticcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solutis.elasticcode.entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
