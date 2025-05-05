package solutis.elasticcode.locadora_filmes.controller.locacaoDto;

import solutis.elasticcode.locadora_filmes.controller.clienteDto.ClienteResponseDto;
import solutis.elasticcode.locadora_filmes.controller.filmeDto.FilmeResponseDto;
import solutis.elasticcode.locadora_filmes.entity.Locacao;

public class LocacaoMapper {

    public static Locacao toEntity(LocacaoRequestDto requestDto) {
        Locacao locacao = new Locacao();
        locacao.setDataLocacao(requestDto.dataLocacao());

        return locacao;
    }

    public static LocacaoResponseDto toDto(Locacao locacao) {

        FilmeResponseDto filme = new FilmeResponseDto(
                locacao.getFilme().getId(),
                locacao.getFilme().getTitulo(),
                locacao.getFilme().getGenero());

        ClienteResponseDto cliente = new ClienteResponseDto(
                locacao.getCliente().getId(),
                locacao.getCliente().getNome()
        );

        LocacaoResponseDto responseDto = new LocacaoResponseDto(
                locacao.getId(),
                locacao.getDataDevolucao(),
                locacao.getDataLocacao(),
                filme,
                cliente
        );

        return responseDto;
    }
}
