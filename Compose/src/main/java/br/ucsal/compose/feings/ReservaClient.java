package br.ucsal.compose.feings;

import br.ucsal.compose.models.Reserva;
import br.ucsal.compose.models.Solicitacao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "http://localhost:8081", name = "reserva")
public interface ReservaClient {
    @PostMapping("/reserva")
    Reserva criarReserva(@RequestBody Reserva reserva);

    @PostMapping("/reserva/{id}")
    Reserva alterarStatusReserva(@PathVariable Long id);

    @DeleteMapping("/reserva/{id}")
    Reserva delete(@PathVariable Long id);

    @GetMapping("/reserva")
    List<Reserva> listarTodos();

    @GetMapping("/reserva/solicitacoesNegadas")
    List<Solicitacao> obterSolicitacoesNegadas();
}
