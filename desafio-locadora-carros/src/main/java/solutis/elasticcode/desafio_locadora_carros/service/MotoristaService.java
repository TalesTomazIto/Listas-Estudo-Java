package solutis.elasticcode.desafio_locadora_carros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.desafio_locadora_carros.dto.motorista.MotoristaRequestDto;
import solutis.elasticcode.desafio_locadora_carros.dto.motorista.MotoristaResponseDto;
import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Motorista;
import solutis.elasticcode.desafio_locadora_carros.mapper.MotoristaMapper;
import solutis.elasticcode.desafio_locadora_carros.repository.MotoristaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MotoristaService {

    @Autowired
    private MotoristaRepository motoristaRepository;

    public Motorista cadasrarMotorista(MotoristaRequestDto request) {
        Motorista motorista = new Motorista();
        motorista = MotoristaMapper.toEntity(request);

        motoristaRepository.save(motorista);

        return motorista;
    }

    public List<MotoristaResponseDto> listarMotoristas() {
        List<Motorista> motoristas = motoristaRepository.findAll();
        List<MotoristaResponseDto> responses = new ArrayList<>();

        for(Motorista motorista : motoristas) {
            responses.add(MotoristaMapper.toDto(motorista));
        }

        return responses;
    }
}
