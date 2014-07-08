package modelo.persistencia.dao;

import java.util.List;
import modelo.negocio.Cliente;

public interface ClienteDAO extends DAO<Cliente, Integer> {

    List<Cliente> pesquisar(String nome, String cpf, String telefone);
}
