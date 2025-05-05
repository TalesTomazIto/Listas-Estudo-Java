package solutis.elasticcode.locadora_filmes.controller.clienteDto;

import solutis.elasticcode.locadora_filmes.entity.Cliente;

public class ClienteMapper {

    public static Cliente toEntity(ClienteRequestDto requestDto) {
        Cliente cliente = new Cliente();
        cliente.setEmail(requestDto.email());
        cliente.setNome(requestDto.nome());

        return cliente;
    }

    public static ClienteResponseDto toDto(Cliente cliente) {
        ClienteResponseDto responseDto = new ClienteResponseDto(
                cliente.getId(),
                cliente.getNome()
        );

        return responseDto;
    }
}
