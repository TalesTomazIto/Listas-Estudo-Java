package solutis.elasticcode.locadora_filmes.service;

import org.springframework.stereotype.Service;
import solutis.elasticcode.locadora_filmes.entity.Locacao;
import solutis.elasticcode.locadora_filmes.repository.ClienteRepository;
import solutis.elasticcode.locadora_filmes.repository.FilmeRepository;
import solutis.elasticcode.locadora_filmes.repository.LocacaoRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class LocacaoService {

    private LocacaoRepository locacaoRepository;
    private FilmeRepository filmeRepository;
    private ClienteRepository clienteRepository;

    public Locacao alugar(Locacao locacao, Long idCliente, Long idFilme) throws Exception {
        var cliente = clienteRepository.findById(idCliente)
                .orElseThrow(() -> new Exception("Cliente não encontrado"));

        var filme = filmeRepository.findById(idFilme)
                .orElseThrow(() -> new Exception("FIlme não encontrado"));

        locacao.setCliente(cliente);
        locacao.setFilme(filme);
        locacao.setDevolvido(false);

        return locacaoRepository.save(locacao);
    }

    public List<Locacao> listar() {
        return locacaoRepository.findAll();
    }

    public Locacao devolver(Long id) throws Exception {
        Locacao locacao = locacaoRepository.findById(id)
                .orElseThrow(() -> new Exception("Locação não encontrada"));

        locacao.setDevolvido(true);
        locacao.setDataDevolucao(LocalDate.now());

        return locacaoRepository.save(locacao);
    }
}
