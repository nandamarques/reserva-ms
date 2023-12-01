package ucsal.bes.arq20232.solicitacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucsal.bes.arq20232.solicitacao.dao.SolicitacaoDao;
import ucsal.bes.arq20232.solicitacao.model.Disciplina;
import ucsal.bes.arq20232.solicitacao.model.Solicitacao;

import java.util.List;

@Service
public class SolicitacaoService {

    @Autowired
    SolicitacaoDao solicitacaoDao;

    public List<Solicitacao> listarTodos() {
        return solicitacaoDao.findAll();
    }

    public List<Solicitacao> listarSolitacaoPorProfessor(Long id) {
        return solicitacaoDao.findByProfessorId(id);
    }

    public List<Solicitacao> listarSolicitacaoPorDisciplina(Long id){
        return solicitacaoDao.findByDisciplinaId(id);
    }

}
