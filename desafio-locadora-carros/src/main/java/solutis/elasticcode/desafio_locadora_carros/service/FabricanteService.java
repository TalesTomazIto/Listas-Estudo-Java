package solutis.elasticcode.desafio_locadora_carros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Acessorio;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Fabricante;
import solutis.elasticcode.desafio_locadora_carros.repository.FabricanteRepository;

import java.util.List;

@Service
public class FabricanteService {

    @Autowired
    private FabricanteRepository repository;

    public Fabricante cadastrar(Fabricante fabricante) {
        return repository.save(fabricante);
    }

    public List<Fabricante> listarFabricantes() {
        return repository.findAll();
    }
}
