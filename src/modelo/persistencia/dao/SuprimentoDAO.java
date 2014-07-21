package modelo.persistencia.dao;

import java.util.List;
import modelo.negocio.Suprimento;

public interface SuprimentoDAO extends DAO<Suprimento, Integer> {

    List<Suprimento> pesquisar(String nome);


}
