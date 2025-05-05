package solutis.elasticcode.locadora_filmes.controller.locacaoDto;

import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record LocacaoRequestDto(Long idCliente, Long idFilme, @PastOrPresent LocalDate dataLocacao) {
}