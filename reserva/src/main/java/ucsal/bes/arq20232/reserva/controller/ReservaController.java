package ucsal.bes.arq20232.reserva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ucsal.bes.arq20232.reserva.model.Reserva;
import ucsal.bes.arq20232.reserva.service.ReservaService;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    ReservaService reservaService;

    @Transactional
    @PostMapping
    public Reserva salvarReserva(@RequestBody Reserva reserva){
        return reservaService.salvar(reserva);
    }

    @Transactional
    @PostMapping("/{id}")
    public Reserva alterarStatusReserva(@PathVariable Long id){
        Reserva reserva = reservaService.findById(id);
        return reservaService.salvar(reserva);
    }
}
