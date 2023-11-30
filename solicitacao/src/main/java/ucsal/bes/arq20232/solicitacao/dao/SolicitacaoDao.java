package ucsal.bes.arq20232.solicitacao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucsal.bes.arq20232.solicitacao.model.Solicitacao;

@Repository
public interface SolicitacaoDao extends JpaRepository<Solicitacao, Long> {
}
