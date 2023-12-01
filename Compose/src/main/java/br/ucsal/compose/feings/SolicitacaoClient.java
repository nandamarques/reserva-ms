package br.ucsal.compose.feings;

import br.ucsal.compose.models.Solicitacao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082", name = "solicitacao")
public interface SolicitacaoClient {
    @GetMapping("/solicitacao")
    List<Solicitacao> listarTodos();
    @GetMapping("/solicitacao/professor/{id}")
    List<Solicitacao> listarSolitacaoPorProfessor(@PathVariable Long id);
    @GetMapping("/solicitacao/disciplina/{id}")
    List<Solicitacao> listarSolitacaoPorDisciplina(@PathVariable Long id);
}
