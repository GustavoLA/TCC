package modelo.persistencia;

import java.util.List;
import modelo.negocio.Suprimento;
import modelo.persistencia.dao.SuprimentoDAO;

public class SuprimentoDAOJPA extends DAOJPA<Suprimento, Integer> implements SuprimentoDAO {

    @Override
    public List<Suprimento> pesquisar(String nome) {
        return getEntityManager().createQuery("select s from Suprimento s where s.nome like '%" + nome + "%' order by nome").getResultList();

    }

}
