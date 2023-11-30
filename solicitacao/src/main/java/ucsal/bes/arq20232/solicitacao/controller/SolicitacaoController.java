package ucsal.bes.arq20232.solicitacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucsal.bes.arq20232.solicitacao.model.Solicitacao;
import ucsal.bes.arq20232.solicitacao.service.SolicitacaoService;

import java.util.List;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoController {

    @Autowired
    SolicitacaoService solicitacaoService;


    @GetMapping
    public List<Solicitacao> listarTodos(){
        return solicitacaoService.listarTodos();
    }


}
