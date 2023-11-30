package ucsal.bes.arq20232.reserva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucsal.bes.arq20232.reserva.dao.ReservaDao;
import ucsal.bes.arq20232.reserva.model.Reserva;
import ucsal.bes.arq20232.reserva.model.Solicitacao;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaDao reservaDao;

    private void validarSolicitacao(Reserva reserva) {
        if (!reserva.getSolicitado())
            reserva.setSolicitado(true);
    }

    public Reserva salvar(Reserva reserva) {
        validarSolicitacao(reserva);
        return reservaDao.save(reserva);
    }

    public Reserva findById(Long id){
        return reservaDao.getReferenceById(id);
    }
}
