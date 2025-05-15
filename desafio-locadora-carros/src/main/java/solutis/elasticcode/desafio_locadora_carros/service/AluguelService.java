package solutis.elasticcode.desafio_locadora_carros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.desafio_locadora_carros.entity.Aluguel;
import solutis.elasticcode.desafio_locadora_carros.repository.AluguelRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class AluguelService {

    @Autowired
    private AluguelRepository repository;

    public Aluguel cadastrar(Aluguel aluguel) {
        String carroPlaca = aluguel.getCarro().getPlaca().toLowerCase();

        boolean carroAlugado = repository.isCarroAlugadoPorPlaca(carroPlaca);

        if (carroAlugado) {
            throw new IllegalStateException("O carro já está alugado no momento.");
        }

        return repository.save(aluguel);
    }

    public List<Aluguel> listarAlugueis() {
        return repository.findAll();
    }

    public List<Aluguel> listarAlugueisAtrasados() {
        return repository.findByDataDevolucaoIsNullOrDataDevolucaoAfter(LocalDate.now());
    }

    public boolean carroEstaAlugadoPorPlaca(String placa) {
        return repository.isCarroAlugadoPorPlaca(placa);
    }


}
