package ucsal.bes.arq20232.reserva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucsal.bes.arq20232.reserva.dao.ReservaDao;
import ucsal.bes.arq20232.reserva.model.Reserva;
import ucsal.bes.arq20232.reserva.model.Solicitacao;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaDao reservaDao;
    private List<Solicitacao> solicitacoes = new ArrayList<>();

    private boolean validarReserva(Solicitacao solicitacao) {
        for (Solicitacao sol : solicitacoes){
            if (solicitacao.getHoraReservaInicio().equals(sol.getHoraReservaInicio())){
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public List<Solicitacao> obterSolicitacoesNegadas() {
            List<Solicitacao> solicitacoesNegadas = new ArrayList<>();

        for (Solicitacao solicitacao : solicitacoes){
            boolean solicitacaoInvalida = validarReserva(solicitacao);
            if(solicitacaoInvalida){
                solicitacoesNegadas.add(solicitacao);
            }
        }
        return solicitacoesNegadas;
        }

    public Reserva criarReserva(Reserva reserva) {
        return reservaDao.save(reserva);
    }

    public Reserva alterarStatusReserva(Solicitacao solicitacao) {
        Reserva reserva = reservaDao.getReferenceById(solicitacao.getReserva().getId());
        if(validarReserva(solicitacao))
            return reservaDao.save(reserva);
        return null;
    }


    public Reserva deletar(Long id) {
         Reserva reserva = reservaDao.getReferenceById(id);
         reservaDao.deleteById(id);
         return reserva;
    }

    public List<Reserva> listarTodos() {
        return reservaDao.findAll();
    }
}
