package solutis.elasticcode.desafio_locadora_carros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Fabricante;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.ModeloCarro;
import solutis.elasticcode.desafio_locadora_carros.repository.FabricanteRepository;
import solutis.elasticcode.desafio_locadora_carros.repository.ModeloCarroRepository;

import java.util.List;

@Service
public class ModeloCarroService {

    @Autowired
    private ModeloCarroRepository repository;

    public ModeloCarro cadastrar(ModeloCarro modeloCarro) {
        return repository.save(modeloCarro);
    }

    public List<ModeloCarro> listarModelosCarros() {
        return repository.findAll();
    }
}
