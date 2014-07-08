package modelo.persistencia.dao;

import java.util.List;
import modelo.negocio.Funcionario;

public interface FuncionarioDAO extends DAO<Funcionario, Integer> {

    List<Funcionario> pesquisar(String nome, String cpf, String telefone);

    Funcionario verificaLoginSenha(String login, String senha);
}
