package solutis.elasticcode.locadora_filmes.controller.filmeDto;

import solutis.elasticcode.locadora_filmes.entity.Filme;

public class FilmeMapper {

    public static Filme toEntity(FilmeRequestDto requestDto) {
        if (requestDto == null) {
            return null;
        }

        Filme filme = new Filme();
        filme.setTitulo(requestDto.titulo());
        filme.setGenero(requestDto.genero());
        filme.setDiretor(requestDto.diretor());

        return filme;
    }

    public static FilmeResponseDto toDto(Filme filme) {
        if (filme == null) {
            return null;
        }

        FilmeResponseDto responseDto = new FilmeResponseDto(
                filme.getId(),
                filme.getTitulo(),
                filme.getGenero()
        );

        return responseDto;
    }


}
