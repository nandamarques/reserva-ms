package ucsal.bes.arq20232.reserva.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ucsal.bes.arq20232.reserva.model.Solicitacao;

import java.util.List;

@FeignClient(url = "http://localhost:8082", name = "solicitacao")
public interface SolicitacaoClient {

    @GetMapping("/solicitacao")
    List<Solicitacao> listarTodos();
}
