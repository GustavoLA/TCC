package modelo.persistencia.dao;

import java.util.List;
import modelo.negocio.Investimento;

public interface InvestimentoDAO extends DAO<Investimento, Integer> {

    List<Investimento> pesquisarDescricao(String descricao);
}
