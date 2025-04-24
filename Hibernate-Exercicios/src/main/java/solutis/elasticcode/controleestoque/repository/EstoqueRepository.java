package solutis.elasticcode.controleestoque.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import solutis.elasticcode.controleestoque.entity.Produto;

@Repository
public interface EstoqueRepository extends JpaRepository<Produto, Integer> {

    @Modifying
    @Transactional
    @Query("UPDATE Produto p SET p.preco = :preco WHERE p.cod = :cod")
    void updatePrecoByCod(Double preco, Integer cod);
}
