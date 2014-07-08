package controller;

import java.util.List;
import modelo.negocio.Cliente;
import modelo.persistencia.ClienteDAOJPA;
import modelo.persistencia.dao.ClienteDAO;

public class ClienteController {

    //Método para salvar um cliente na base de dados
    public Cliente salvar(Cliente cliente) {
        ClienteDAO dao = new ClienteDAOJPA();
        return dao.save(cliente);
    }

    //Método para deletar um cliente da base de dados
    public boolean excluir(int codigo) {
        ClienteDAO dao = new ClienteDAOJPA();
        return dao.remove(Cliente.class, codigo);
    }

    //Método para listar clientes cadastrados na base de dados
    public List<Cliente> listarCliente() {
        ClienteDAO dao = new ClienteDAOJPA();
        return dao.getAll(Cliente.class);
    }

    //Método para listar clientes cadastrados na base de dados por ID
    public Cliente listarClientePorId(int codigo) {
        ClienteDAO dao = new ClienteDAOJPA();
        return dao.getById(Cliente.class, codigo);
    }

    //Método para pesquisar clientes cadastrados na base de dados por NOME
    public List<Cliente> pesquisar(String nome, String cpf, String telefone) {
        ClienteDAO dao = new ClienteDAOJPA();
        return dao.pesquisar(nome, cpf, nome);

    }
}
