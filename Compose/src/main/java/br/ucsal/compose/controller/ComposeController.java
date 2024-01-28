package br.ucsal.compose.controller;

import br.ucsal.compose.models.Solicitacao;
import br.ucsal.compose.service.ComposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/compose")
public class ComposeController {

    @Autowired
    ComposeService composeService;

    @GetMapping
    public List<Solicitacao> obterSolicitacoesNegadas(){
        return composeService.obterSolicitacoesNegadas();
    }
}
