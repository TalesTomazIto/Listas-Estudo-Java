package solutis.elasticcode.springbootex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solutis.elasticcode.springbootex.controller.dto.ProdutoAtualizarDto;
import solutis.elasticcode.springbootex.controller.dto.ProdutoCreateDto;
import solutis.elasticcode.springbootex.entity.Produto;
import solutis.elasticcode.springbootex.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody ProdutoCreateDto produtoCreateDto) {
        Produto produto = produtoService.cadastrarProduto(produtoCreateDto);
        return new ResponseEntity<>(produto, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id, @RequestBody ProdutoAtualizarDto produtoAtualizarDto) {
        Produto produtoAtualizado = produtoService.atualizarProduto(id, produtoAtualizarDto);

        return new ResponseEntity<>(produtoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {
        produtoService.deletarProduto(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProdutoPorId(@PathVariable Long id) {
        Produto produto = produtoService.buscarProdutoPorId(id);
        return new ResponseEntity<>(produto, HttpStatus.OK);
    }

}
