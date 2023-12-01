package br.ucsal.compose.service;

import br.ucsal.compose.dao.ComposeDao;
import br.ucsal.compose.feings.ReservaClient;
import br.ucsal.compose.models.Compose;
import br.ucsal.compose.models.Solicitacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComposeService {

    @Autowired
    private ReservaClient reservaClient;

    @Autowired
    private ComposeDao composeDao;

    public List<Solicitacao> obterSolicitacoesNegadas(){
        List<Solicitacao> solicitacoesNegadas = reservaClient.obterSolicitacoesNegadas();

        return solicitacoesNegadas;
    }

    public void salvarCompose(Compose compose){
        composeDao.save(compose);
    }
}
