package solutis.elasticcode.desafio_locadora_carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Fabricante;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {
}
