package controller;

import java.util.List;
import modelo.negocio.EntradaSuprimento;
import modelo.negocio.Suprimento;
import modelo.persistencia.SuprimentoDAOJPA;
import modelo.persistencia.dao.SuprimentoDAO;

public class SuprimentoController {

    //Método para salvar um suprimento na base de dados
    public Suprimento salvar(Suprimento suprimento) {
        SuprimentoDAO dao = new SuprimentoDAOJPA();
        return dao.save(suprimento);
    }

    //Método para deletar um suprimento da base de dados
    public boolean excluir(int codigo) {
        SuprimentoDAO dao = new SuprimentoDAOJPA();
        return dao.remove(Suprimento.class, codigo);
    }

    //Método para listar suprimentos cadastrados na base de dados
    public List<Suprimento> listarSuprimento() {
        SuprimentoDAO dao = new SuprimentoDAOJPA();
        return dao.getAll(Suprimento.class);
    }

    //Método para listar suprimentos cadastrados na base de dados por ID
    public Suprimento listarSuprimentoPorId(int codigo) {
        SuprimentoDAO dao = new SuprimentoDAOJPA();
        return dao.getById(Suprimento.class, codigo);
    }

    //Método para pesquisar suprimentos cadastrados na base de dados por NOME
    public List<Suprimento> pesquisar(String nome) {
        SuprimentoDAO dao = new SuprimentoDAOJPA();
        return dao.pesquisar(nome);

    }
//*****************************************************************************
   

}
