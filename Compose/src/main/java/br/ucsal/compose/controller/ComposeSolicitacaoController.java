package br.ucsal.compose.controller;

import br.ucsal.compose.feings.SolicitacaoClient;
import br.ucsal.compose.models.Solicitacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/compose/solicitacao")
public class ComposeSolicitacaoController {
    @Autowired
    SolicitacaoClient solicitacaoClient;

    @GetMapping("/professor/{id}")
    List<Solicitacao> listarSolitacaoPorProfessor(@PathVariable Long id){
        return solicitacaoClient.listarSolitacaoPorProfessor(id);
    }
    @GetMapping("/disciplina/{id}")
    List<Solicitacao> listarSolitacaoPorDisciplina(@PathVariable Long id){
        return solicitacaoClient.listarSolitacaoPorDisciplina(id);
    }
}
