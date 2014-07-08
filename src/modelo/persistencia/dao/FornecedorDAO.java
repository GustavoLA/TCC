package modelo.persistencia.dao;

import java.util.List;
import modelo.negocio.Fornecedor;

public interface FornecedorDAO extends DAO<Fornecedor, Integer> {

    List<Fornecedor> pesquisar(String nome, String cnpj, String telefone);
}
