package modelo.persistencia;

import java.util.List;
import modelo.negocio.Fornecedor;
import modelo.persistencia.dao.FornecedorDAO;

public class FornecedorDAOJPA extends DAOJPA<Fornecedor, Integer> implements FornecedorDAO {

    @Override
    public List<Fornecedor> pesquisar(String nome, String cnpj, String telefone) {
        return getEntityManager().createQuery("select f from Fornecedor f where f.nomeFantasia like '%" + nome + "%' or f.cnpj like '%" + cnpj + "%' or f.telefone like '%" + telefone + "%' order by nomeFantasia").getResultList();
    }

}
