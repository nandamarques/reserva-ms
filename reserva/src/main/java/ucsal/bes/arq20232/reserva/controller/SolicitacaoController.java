package ucsal.bes.arq20232.reserva.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucsal.bes.arq20232.reserva.model.Reserva;
import ucsal.bes.arq20232.reserva.model.Solicitacao;
import ucsal.bes.arq20232.reserva.service.ReservaService;
import ucsal.bes.arq20232.reserva.service.SolicitacaoService;

import java.util.List;


@RestController
@RequestMapping("/reserva")
public class SolicitacaoController {

    SolicitacaoService solicitacaoService;

    public List<Solicitacao> listarTodos(){
        return solicitacaoService.listarTodos();
    }


}
