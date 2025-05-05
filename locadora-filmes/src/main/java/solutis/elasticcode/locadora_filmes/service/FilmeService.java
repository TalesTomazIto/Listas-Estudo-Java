package solutis.elasticcode.locadora_filmes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.locadora_filmes.entity.Filme;
import solutis.elasticcode.locadora_filmes.repository.FilmeRepository;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public Filme cadastrar(Filme filme) {
        return filmeRepository.save(filme);
    }

    public List<Filme> listar() {
        return filmeRepository.findAll();
    }
}
