package modelo.persistencia;

import java.util.List;
import javax.persistence.Query;
import modelo.negocio.Funcionario;
import modelo.persistencia.dao.FuncionarioDAO;

public class FuncionarioDAOJPA extends DAOJPA<Funcionario, Integer> implements FuncionarioDAO {

    @Override
    public List<Funcionario> pesquisar(String nome, String cpf, String telefone) {
        return getEntityManager().createQuery("select f from Funcionario f where f.nome like '%" + nome + "%' or f.cpf like '%" + cpf + "%' or f.telefone like '%" + telefone + "%' order by nome").getResultList();
    }

    @Override
    public Funcionario verificaLoginSenha(String login, String senha) {

        Query q = getEntityManager().createQuery("select x from Funcionario x where x.login =:login and x.senha =:senha", Funcionario.class);
        q.setParameter("senha", senha);
        q.setParameter("login", login);
        Funcionario f = null;
        List<Funcionario> funcionarios = q.getResultList();
        for (Funcionario fun : funcionarios) {
            f = fun;
        }
        return f;

    }
}
