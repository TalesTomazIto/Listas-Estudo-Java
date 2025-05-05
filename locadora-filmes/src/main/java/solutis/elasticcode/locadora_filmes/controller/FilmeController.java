package solutis.elasticcode.locadora_filmes.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solutis.elasticcode.locadora_filmes.controller.filmeDto.FilmeMapper;
import solutis.elasticcode.locadora_filmes.controller.filmeDto.FilmeRequestDto;
import solutis.elasticcode.locadora_filmes.controller.filmeDto.FilmeResponseDto;
import solutis.elasticcode.locadora_filmes.entity.Filme;
import solutis.elasticcode.locadora_filmes.service.FilmeService;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public ResponseEntity<List<FilmeResponseDto>> listar() {
        List<Filme> filmes = filmeService.listar();

        List<FilmeResponseDto> resposta = filmes.stream().
                map(FilmeMapper::toDto)
                .toList();

        if (resposta.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(resposta);
    }

    @PostMapping
    public ResponseEntity<FilmeResponseDto> cadastrar(@Valid @RequestBody FilmeRequestDto dto) {
        Filme filme = FilmeMapper.toEntity(dto);
        Filme filmeSalvo = filmeService.cadastrar(filme);

        FilmeResponseDto resposta = FilmeMapper.toDto(filmeSalvo);
        return ResponseEntity.status(201).body(resposta);
    }
}