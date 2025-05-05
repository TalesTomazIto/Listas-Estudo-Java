package solutis.elasticcode.locadora_filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solutis.elasticcode.locadora_filmes.entity.Filme;
import solutis.elasticcode.locadora_filmes.entity.Locacao;

import java.util.Optional;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {

}
