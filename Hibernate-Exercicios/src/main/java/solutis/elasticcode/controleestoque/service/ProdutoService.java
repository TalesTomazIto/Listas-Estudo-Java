package solutis.elasticcode.controleestoque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutis.elasticcode.controleestoque.entity.Produto;
import solutis.elasticcode.controleestoque.repository.EstoqueRepository;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    EstoqueRepository repository;

    public ProdutoService(EstoqueRepository repository) {
        this.repository = repository;
    }

    public void adicionarProduto(Produto produto) {
        repository.save(produto);
    }

    public void alterarPrecoProduto(Double preco, Integer cod) {
        repository.updatePrecoByCod(preco, cod);  // Atualiza o preço diretamente no banco
    }


}
