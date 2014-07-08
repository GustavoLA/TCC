package controller;

import java.util.List;
import modelo.negocio.Funcionario;
import modelo.persistencia.FuncionarioDAOJPA;
import modelo.persistencia.dao.FuncionarioDAO;

public class FuncionarioController {

    //Método para salvar um funcionario na base de dados
    public Funcionario salvar(Funcionario funcionario) {
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.save(funcionario);
    }

    //Método para deletar um funcionario da base de dados
    public boolean excluir(int codigo) {
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.remove(Funcionario.class, codigo);
    }

    //Método para listar funcionarios cadastrados na base de dados
    public List<Funcionario> listarFuncionario() {
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.getAll(Funcionario.class);
    }

    //Método para listar funcionarios cadastrados na base de dados por ID
    public Funcionario listarFuncionarioPorId(int codigo) {
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.getById(Funcionario.class, codigo);
    }

    //Método para pesquisar funcionarios cadastrados na base de dados por NOME
    public List<Funcionario> pesquisar(String nome, String cpf, String telefone) {
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.pesquisar(nome, cpf, telefone);

    }

    //Método para realizar autenticação de login
    public Funcionario verificaLoginSenha(String login, String senha) {
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.verificaLoginSenha(login, senha);
    }
}
