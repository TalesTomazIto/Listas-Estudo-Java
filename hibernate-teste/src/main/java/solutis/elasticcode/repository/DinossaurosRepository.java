package solutis.elasticcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import solutis.elasticcode.entity.Dinossauros;

import java.util.List;

@Repository
public interface DinossaurosRepository extends JpaRepository<Dinossauros, Integer> {

    @Query("SELECT d FROM Dinossauros d")
    List<Dinossauros> findAllDinossauros();
}
