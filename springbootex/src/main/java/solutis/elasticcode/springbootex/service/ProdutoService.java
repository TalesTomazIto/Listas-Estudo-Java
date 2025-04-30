package solutis.elasticcode.springbootex.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.springbootex.controller.dto.ProdutoAtualizarDto;
import solutis.elasticcode.springbootex.controller.dto.ProdutoCreateDto;
import solutis.elasticcode.springbootex.entity.Produto;
import solutis.elasticcode.springbootex.mapper.ProdutoMapper;
import solutis.elasticcode.springbootex.repository.ProdutoRepository;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public Produto cadastrarProduto(ProdutoCreateDto produtoCreateDto) {
        Produto produto = ProdutoMapper.toEntity(produtoCreateDto);

        Produto produtoPost = produtoRepository.save(produto);

        return produtoPost;
    }

    public Produto atualizarProduto(Long id, ProdutoAtualizarDto produto) {
        Optional<Produto> produtoOpt = produtoRepository.findById(id);

        if (produtoOpt.isEmpty()) {
            throw new RuntimeException("Produto não encontrado com ID: " + id);
        }

        Produto produtoExistente = produtoOpt.get();

        produtoExistente.setNome(produto.getNome());
        produtoExistente.setDescricao(produto.getDescricao());
        produtoExistente.setPreco(produto.getPreco());
        produtoExistente.setQtdEstoque(produto.getQtdEstoque());
        produtoExistente.setCategoria(produto.getCategoria());

        produtoRepository.save(produtoExistente);

        return produtoExistente;
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    @Transactional
    public Produto buscarProdutoPorId(Long id) {
        Optional<Produto> produtoOpt = produtoRepository.findById(id);

        return produtoOpt.get();
    }


}
