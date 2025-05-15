package solutis.elasticcode.desafio_locadora_carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import solutis.elasticcode.desafio_locadora_carros.entity.Aluguel;

import java.util.Date;
import java.util.List;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long> {

    @Query("SELECT COUNT(a) > 0 FROM Aluguel a WHERE a.carro.placa = :placa AND (a.dataDevolucao IS NULL OR a.dataDevolucao > CURRENT_TIMESTAMP)")
    boolean isCarroAlugadoPorPlaca(@Param("placa") String placa);

    List<Aluguel> findByDataDevolucaoIsNullOrDataDevolucaoAfter(java.time.LocalDate dataAtual);

}
