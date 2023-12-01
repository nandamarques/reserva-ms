package ucsal.bes.arq20232.solicitacao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucsal.bes.arq20232.solicitacao.model.Solicitacao;

import java.util.List;

@Repository
public interface SolicitacaoDao extends JpaRepository<Solicitacao, Long> {
    List<Solicitacao> findByProfessorId(Long id);
    List<Solicitacao> findByDisciplinaId(Long id);
}
