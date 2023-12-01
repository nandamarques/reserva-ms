package ucsal.bes.arq20232.reserva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ucsal.bes.arq20232.reserva.model.Reserva;
import ucsal.bes.arq20232.reserva.model.Solicitacao;
import ucsal.bes.arq20232.reserva.service.ReservaService;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    ReservaService reservaService;

    @Transactional
    @PostMapping
    public Reserva criarReserva(@RequestBody Reserva reserva){
        return reservaService.criarReserva(reserva);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public Reserva delete(@PathVariable Long id){
        return reservaService.deletar(id);
    }

    @GetMapping
    public List<Reserva> listarTodos(){
        return reservaService.listarTodos();
    }

    @GetMapping("/solicitacoesNegadas")
    public List<Solicitacao> obterSolicitacoesNegadas(){
        return reservaService.obterSolicitacoesNegadas();
    }

    @PostMapping("/alterarStatus")
    @Transactional
    public Reserva alterarStatusSolicitacao(@RequestBody Solicitacao solicitacao){
        return reservaService.alterarStatusReserva(solicitacao);
    }
}
