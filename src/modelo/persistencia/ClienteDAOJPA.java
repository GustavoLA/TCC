package modelo.persistencia;

import java.util.List;
import modelo.negocio.Cliente;
import modelo.persistencia.dao.ClienteDAO;

public class ClienteDAOJPA extends DAOJPA<Cliente, Integer> implements ClienteDAO {

    @Override
    public List<Cliente> pesquisar(String nome, String cpf, String telefone) {
        return getEntityManager().createQuery("select c from Cliente c where c.nome like '%" + nome + "%' or c.cpf like '%" + cpf + "%' or c.telefone like '%" + telefone + "%' order by nome").getResultList();
    }
}
