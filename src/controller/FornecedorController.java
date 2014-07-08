package controller;

import java.util.List;
import modelo.negocio.Fornecedor;
import modelo.persistencia.FornecedorDAOJPA;
import modelo.persistencia.dao.FornecedorDAO;

public class FornecedorController {

    //Método para salvar um fornecedor na base de dados
    public Fornecedor salvar(Fornecedor fornecedor) {
        FornecedorDAO dao = new FornecedorDAOJPA();
        return dao.save(fornecedor);
    }

    //Método para deletar um fornecedor da base de dados
    public boolean excluir(int codigo) {
        FornecedorDAO dao = new FornecedorDAOJPA();
        return dao.remove(Fornecedor.class, codigo);
    }

    //Método para listar fornecedores cadastrados na base de dados
    public List<Fornecedor> listarFornecedor() {
        FornecedorDAO dao = new FornecedorDAOJPA();
        return dao.getAll(Fornecedor.class);
    }

    //Método para listar fornecedores cadastrados na base de dados por ID
    public Fornecedor listarFornecedorPorId(int codigo) {
        FornecedorDAO dao = new FornecedorDAOJPA();
        return dao.getById(Fornecedor.class, codigo);
    }

    //Método para pesquisar fornecedores cadastrados na base de dados
    public List<Fornecedor> pesquisar(String nome, String cnpj, String telefone) {
        FornecedorDAO dao = new FornecedorDAOJPA();
        return dao.pesquisar(nome, cnpj, telefone);

    }
}
