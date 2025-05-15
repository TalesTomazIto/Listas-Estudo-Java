package solutis.elasticcode.desafio_locadora_carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solutis.elasticcode.desafio_locadora_carros.entity.ApoliceSeguro;

@Repository
public interface ApoliceSeguroRepository extends JpaRepository<ApoliceSeguro, Long> {
}
