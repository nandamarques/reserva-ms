package br.ucsal.compose.controller;

import br.ucsal.compose.feings.ReservaClient;
import br.ucsal.compose.models.Reserva;
import br.ucsal.compose.models.Solicitacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compose/reserva")
public class ComposeReservaController {
    @Autowired
    ReservaClient reservaClient;

    @PostMapping
    public Reserva criarReserva(Reserva reserva){
        return reservaClient.criarReserva(reserva);
    }

    @PostMapping("/{id}")
    public Reserva alterarStatusReserva(Long id){
        return reservaClient.alterarStatusReserva(id);
    }
    @DeleteMapping("/{id}")
    public Reserva delete(Long id){
        return reservaClient.delete(id);
    }
    @GetMapping
    public List<Reserva> listarTodos(){
        return reservaClient.listarTodos();
    }
    @GetMapping("/solicitacoesNegadas")
    public List<Solicitacao> obterSolicitacoesNegadas(){
        return reservaClient.obterSolicitacoesNegadas();
    }
}
