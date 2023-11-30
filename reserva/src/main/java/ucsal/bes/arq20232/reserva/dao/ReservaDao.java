package ucsal.bes.arq20232.reserva.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ucsal.bes.arq20232.reserva.model.Reserva;

import java.util.List;

@Repository
public interface ReservaDao extends JpaRepository<Reserva, Long> {

}
