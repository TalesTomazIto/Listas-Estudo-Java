package solutis.elasticcode.locadora_filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solutis.elasticcode.locadora_filmes.entity.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
