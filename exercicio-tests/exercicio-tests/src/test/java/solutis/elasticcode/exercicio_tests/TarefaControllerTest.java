package solutis.elasticcode.exercicio_tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import solutis.elasticcode.exercicio_tests.dto.TarefaRequestDto;
import solutis.elasticcode.exercicio_tests.entity.TarefaStatus;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class TarefaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void cadastrarTarefa_dadosValidos_retornaTarefaCriada() throws Exception {
        TarefaRequestDto requestDto = new TarefaRequestDto("Titulo Teste", "Descricao Teste", TarefaStatus.PENDENTE);

        mockMvc.perform(post("/tarefas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(requestDto)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.titulo").value("Titulo Teste"))
                .andExpect(jsonPath("$.descricao").value("Descricao Teste"))
                .andExpect(jsonPath("$.status").value("PENDENTE"));
    }

    @Test
    void buscarTarefaPorId_idInexistente_retornaNotFound() throws Exception {
        mockMvc.perform(get("/tarefas/999"))
                .andExpect(status().isNotFound());
    }

    @Test
    void listarTarefas_retornaListaDeTarefas() throws Exception {
        TarefaRequestDto requestDto = new TarefaRequestDto("Tarefa 1", "Descrição 1", TarefaStatus.PENDENTE);

        mockMvc.perform(post("/tarefas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(requestDto)))
                .andExpect(status().isCreated());

        mockMvc.perform(get("/tarefas"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[?(@.titulo == 'Tarefa 1')]").exists());  // Verifica se a tarefa com o título "Tarefa 1" existe
    }

    @Test
    void atualizarTarefa_tarefaExistente_retornaTarefaAtualizada() throws Exception {
        TarefaRequestDto requestDto = new TarefaRequestDto("Inicial", "Descricao", TarefaStatus.PENDENTE);
        String response = mockMvc.perform(post("/tarefas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(requestDto)))
                .andExpect(status().isCreated())
                .andReturn().getResponse().getContentAsString();

        Long id = objectMapper.readTree(response).get("id").asLong();

        TarefaRequestDto atualizacao = new TarefaRequestDto("Atualizado", "Desc Atualizada", TarefaStatus.CONCLUIDA);

        mockMvc.perform(put("/tarefas/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(atualizacao)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.titulo").value("Atualizado"))
                .andExpect(jsonPath("$.status").value("CONCLUIDA"));
    }

    @Test
    void deletarTarefa_tarefaExistente_retornaNoContent() throws Exception {
        TarefaRequestDto requestDto = new TarefaRequestDto("A deletar", "Será excluída", TarefaStatus.PENDENTE);

        String response = mockMvc.perform(post("/tarefas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(requestDto)))
                .andExpect(status().isCreated())
                .andReturn().getResponse().getContentAsString();

        Long id = objectMapper.readTree(response).get("id").asLong();

        mockMvc.perform(delete("/tarefas/" + id))
                .andExpect(status().isNoContent());
    }
}
