package solutis.elasticcode.locadora_filmes.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solutis.elasticcode.locadora_filmes.controller.clienteDto.ClienteMapper;
import solutis.elasticcode.locadora_filmes.controller.clienteDto.ClienteRequestDto;
import solutis.elasticcode.locadora_filmes.controller.clienteDto.ClienteResponseDto;
import solutis.elasticcode.locadora_filmes.entity.Cliente;
import solutis.elasticcode.locadora_filmes.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteResponseDto>> listar(){
        List<Cliente> clientes = clienteService.listar();

        List<ClienteResponseDto> resposta = clientes.stream()
                .map(ClienteMapper::toDto)
                .toList();

        if (resposta.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(resposta);
    }

    @PostMapping
    public ResponseEntity<ClienteResponseDto> cadastrar(@Valid @RequestBody ClienteRequestDto dto) {
        Cliente cliente = ClienteMapper.toEntity(dto);
        Cliente clienteSalvo = clienteService.cadastrar(cliente);

        ClienteResponseDto resposta = ClienteMapper.toDto(clienteSalvo);

        return ResponseEntity.status(201).body(resposta);
    }


}
