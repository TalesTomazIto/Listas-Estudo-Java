package solutis.elasticcode.desafio_locadora_carros.mapper;

import solutis.elasticcode.desafio_locadora_carros.dto.funcionario.FuncionarioRequestDto;
import solutis.elasticcode.desafio_locadora_carros.dto.funcionario.FuncionarioResponseDto;
import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Funcionario;

public class FuncionarioMapper {

    public static Funcionario toEntity(FuncionarioRequestDto request) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome(request.nome());
        funcionario.setCpf(request.cpf());
        funcionario.setEmail(request.email());
        funcionario.setDtNascimento(request.dataNascimento());
        funcionario.setMatricula(request.matricula());
        funcionario.setSexo(request.sexo());

        return funcionario;
    }

    public static FuncionarioResponseDto toDto(Funcionario funcionario) {
        FuncionarioResponseDto response = new FuncionarioResponseDto(
                funcionario.getNome(),
                funcionario.getEmail(),
                funcionario.getDtNascimento(),
                funcionario.getSexo(),
                funcionario.getMatricula()
        );

        return response;
    }
}
