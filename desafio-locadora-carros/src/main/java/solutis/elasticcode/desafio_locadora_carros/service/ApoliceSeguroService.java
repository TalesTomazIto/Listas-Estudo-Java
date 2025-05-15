package solutis.elasticcode.desafio_locadora_carros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.desafio_locadora_carros.entity.ApoliceSeguro;
import solutis.elasticcode.desafio_locadora_carros.repository.ApoliceSeguroRepository;

import java.util.List;

@Service
public class ApoliceSeguroService {

    @Autowired
    private ApoliceSeguroRepository repository;

    public ApoliceSeguro cadastrar(ApoliceSeguro apoliceSeguro) {
        return repository.save(apoliceSeguro);
    }

    public List<ApoliceSeguro> listarSeguros() {
        return repository.findAll();
    }

}
