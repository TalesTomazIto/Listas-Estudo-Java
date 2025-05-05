package solutis.elasticcode.locadora_filmes.controller.locacaoDto;

import solutis.elasticcode.locadora_filmes.controller.clienteDto.ClienteResponseDto;
import solutis.elasticcode.locadora_filmes.controller.filmeDto.FilmeResponseDto;

import java.time.LocalDate;

public record LocacaoResponseDto(Long id, LocalDate dataDevolucao, LocalDate dataLocacao, FilmeResponseDto filme, ClienteResponseDto cliente) {
}
