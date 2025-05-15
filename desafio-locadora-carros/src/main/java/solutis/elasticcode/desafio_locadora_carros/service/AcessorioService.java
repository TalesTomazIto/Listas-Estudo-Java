package solutis.elasticcode.desafio_locadora_carros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.desafio_locadora_carros.entity.carro.Acessorio;
import solutis.elasticcode.desafio_locadora_carros.repository.AcessorioRepository;

import java.util.List;

@Service
public class AcessorioService {

    @Autowired
    private AcessorioRepository repository;

    public Acessorio cadastrar(Acessorio acessorio) {
        return repository.save(acessorio);
    }

    public List<Acessorio> listarAcessorios() {
        return repository.findAll();
    }
}
