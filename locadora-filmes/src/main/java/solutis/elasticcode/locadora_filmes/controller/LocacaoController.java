package solutis.elasticcode.locadora_filmes.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solutis.elasticcode.locadora_filmes.controller.locacaoDto.LocacaoMapper;
import solutis.elasticcode.locadora_filmes.controller.locacaoDto.LocacaoRequestDto;
import solutis.elasticcode.locadora_filmes.controller.locacaoDto.LocacaoResponseDto;
import solutis.elasticcode.locadora_filmes.entity.Locacao;
import solutis.elasticcode.locadora_filmes.service.LocacaoService;

import java.util.List;

@RestController
@RequestMapping("/locacoes")
public class LocacaoController {

    @Autowired
    private LocacaoService locacaoService;

    @GetMapping
    public ResponseEntity<List<LocacaoResponseDto>> listar() {
        List<Locacao> locacoes = locacaoService.listar();

        List<LocacaoResponseDto> resposta = locacoes.stream()
                .map(LocacaoMapper::toDto)
                .toList();

        if (resposta.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(resposta);
    }

    @PostMapping
    public ResponseEntity<LocacaoResponseDto> cadastrar(@Valid @RequestBody LocacaoRequestDto dto) throws Exception {
        Locacao locacao = LocacaoMapper.toEntity(dto);
        Locacao locacaoSalva = locacaoService.alugar(locacao, dto.idCliente(), dto.idFilme());

        LocacaoResponseDto resposta = LocacaoMapper.toDto(locacaoSalva);
        return ResponseEntity.status(201).body(resposta);
    }

    @PutMapping("/{id}/devolucao")
    public ResponseEntity<LocacaoResponseDto> atualizarPorId(@PathVariable Long id) throws Exception {
        Locacao locacaoAtualizado = locacaoService.devolver(id);
        LocacaoResponseDto resposta = LocacaoMapper.toDto(locacaoAtualizado);

        return ResponseEntity.status(200).body(resposta);
    }
}
