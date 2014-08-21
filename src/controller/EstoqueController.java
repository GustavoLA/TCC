/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo.negocio.Estoque;
import modelo.persistencia.EstoqueDAOJPA;
import modelo.persistencia.dao.EstoqueDAO;

/**
 *
 * @author GUSTAVO
 */
public class EstoqueController {

    public Estoque salvar(Estoque estoque) {
        EstoqueDAO dao = new EstoqueDAOJPA();
        return dao.save(estoque);
    }

}
