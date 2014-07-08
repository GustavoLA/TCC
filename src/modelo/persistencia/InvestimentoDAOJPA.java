package modelo.persistencia;

import java.util.List;
import modelo.negocio.Investimento;
import modelo.persistencia.dao.InvestimentoDAO;

public class InvestimentoDAOJPA extends DAOJPA<Investimento, Integer> implements InvestimentoDAO {

    @Override
    public List<Investimento> pesquisarDescricao(String descricao) {
        return getEntityManager().createQuery("select i from Investimento i where i.descricaoInvestimento like '%" + descricao + "%'").getResultList();
    }

}
