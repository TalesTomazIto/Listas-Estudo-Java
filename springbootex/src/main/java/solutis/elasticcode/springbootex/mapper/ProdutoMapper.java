package solutis.elasticcode.springbootex.mapper;

import solutis.elasticcode.springbootex.controller.dto.ProdutoAtualizarDto;
import solutis.elasticcode.springbootex.controller.dto.ProdutoCreateDto;
import solutis.elasticcode.springbootex.entity.Produto;

import java.time.LocalDate;

public class ProdutoMapper {

    public static Produto toEntity(ProdutoCreateDto produtoCreateDto) {
        Produto produto = new Produto();

        produto.setNome(produtoCreateDto.getNome());
        produto.setDescricao(produtoCreateDto.getDescricao());
        produto.setPreco(produtoCreateDto.getPreco());
        produto.setQtdEstoque(produtoCreateDto.getQtdEstoque());
        produto.setQtdEstoque(produtoCreateDto.getQtdEstoque());
        produto.setCodigoDeBarras(produtoCreateDto.getCodigoDeBarras());
        produto.setCategoria(produtoCreateDto.getCategoria());
        produto.setDataCadasto(LocalDate.now());

        return produto;
    }

}
