package solutis.elasticcode.desafio_locadora_carros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Carro;
import solutis.elasticcode.desafio_locadora_carros.repository.CarroRepository;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository repository;

    public Carro cadastrarCarro(Carro carro) {
        return repository.save(carro);
    }

    public List<Carro> listarCarro() {
        return repository.findAll();
    }

    

}
