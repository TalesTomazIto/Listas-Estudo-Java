package solutis.elasticcode.desafio_locadora_carros.mapper;

import solutis.elasticcode.desafio_locadora_carros.dto.motorista.MotoristaRequestDto;
import solutis.elasticcode.desafio_locadora_carros.dto.motorista.MotoristaResponseDto;
import solutis.elasticcode.desafio_locadora_carros.entity.pessoa.Motorista;

public class MotoristaMapper {

    public static Motorista toEntity(MotoristaRequestDto request) {
        Motorista motorista = new Motorista();

        motorista.setNome(request.nome());
        motorista.setEmail(request.email());
        motorista.setDtNascimento(request.dataNascimento());
        motorista.setCpf(request.cpf());
        motorista.setSexo(request.sexo());
        motorista.setCnh(request.cnh());

        return motorista;
    }

    public static MotoristaResponseDto toDto(Motorista motorista) {
        MotoristaResponseDto response = new MotoristaResponseDto(
                motorista.getNome(),
                motorista.getEmail(),
                motorista.getDtNascimento(),
                motorista.getSexo(),
                motorista.getCnh()
        );

        return response;
    }
}
