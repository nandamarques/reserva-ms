package br.ucsal.compose.dao;

import br.ucsal.compose.models.Compose;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ComposeDao extends JpaRepository<Compose, Long>{

}
