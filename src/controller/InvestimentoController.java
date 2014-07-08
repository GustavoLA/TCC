package controller;

import java.util.List;
import modelo.negocio.Investimento;
import modelo.persistencia.InvestimentoDAOJPA;
import modelo.persistencia.dao.InvestimentoDAO;

public class InvestimentoController {

    //Método para salvar um investimento na base de dados
    public Investimento salvar(Investimento investimento) {
        InvestimentoDAO dao = new InvestimentoDAOJPA();
        return dao.save(investimento);
    }

    //Método para deletar um invetimento da base de dados
    public boolean excluir(int codigo) {
        InvestimentoDAO dao = new InvestimentoDAOJPA();
        return dao.remove(Investimento.class, codigo);
    }

    //Método para listar investimentos cadastrados na base de dados
    public List<Investimento> listarInvestimento() {
        InvestimentoDAO dao = new InvestimentoDAOJPA();
        return dao.getAll(Investimento.class);
    }

    //Método para listar funcionarios investimentos na base de dados por ID
    public Investimento listarInvestimentoPorId(int codigo) {
        InvestimentoDAO dao = new InvestimentoDAOJPA();
        return dao.getById(Investimento.class, codigo);
    }

    //Método para pesquisar investimentos cadastrados na base de dados por NOME
    public List<Investimento> pesquisarDescricao(String descricao) {
        InvestimentoDAO dao = new InvestimentoDAOJPA();
        return dao.pesquisarDescricao(descricao);

    }
}
