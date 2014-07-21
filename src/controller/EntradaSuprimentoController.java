/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import modelo.negocio.EntradaSuprimento;
import modelo.negocio.Suprimento;
import modelo.persistencia.EntradaSuprimentoDAOJPA;
import modelo.persistencia.SuprimentoDAOJPA;
import modelo.persistencia.dao.EntradaSuprimentoDAO;
import modelo.persistencia.dao.SuprimentoDAO;

/**
 *
 * @author GUSTAVO
 */
public class EntradaSuprimentoController {

    public EntradaSuprimento salvar(EntradaSuprimento novo) {
        EntradaSuprimentoDAO dao = new EntradaSuprimentoDAOJPA();
        return dao.save(novo);
    }

    public List<EntradaSuprimento> listarEntradaSuprimento(int id) {
        SuprimentoDAO daos = new SuprimentoDAOJPA();
        Suprimento s = daos.getById(Suprimento.class, id);
        EntradaSuprimentoDAO dao = new EntradaSuprimentoDAOJPA();
        return dao.getBySuprimento(s);
    }

}
