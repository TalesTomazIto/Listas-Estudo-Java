package solutis.elasticcode.desafio_locadora_carros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.desafio_locadora_carros.dto.funcionario.FuncionarioRequestDto;
import solutis.elasticcode.desafio_locadora_carros.dto.funcionario.FuncionarioResponseDto;
import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Funcionario;
import solutis.elasticcode.desafio_locadora_carros.mapper.FuncionarioMapper;
import solutis.elasticcode.desafio_locadora_carros.repository.FuncionarioRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario cadastrarFuncionario(FuncionarioRequestDto request) {
        Funcionario funcionario = new Funcionario();
        funcionario = FuncionarioMapper.toEntity(request);

        funcionarioRepository.save(funcionario);

        return funcionario;
    }

    public List<FuncionarioResponseDto> listarFuncionarios() {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        List<FuncionarioResponseDto> responses = new ArrayList<>();

        for (Funcionario funcionario : funcionarios) {
            responses.add(FuncionarioMapper.toDto(funcionario));
        }

        return responses;
    }
}
