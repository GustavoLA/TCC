/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import modelo.negocio.EntradaProduto;
import modelo.negocio.Ingrediente;
import modelo.negocio.Produto;
import modelo.persistencia.EntradaProdutoDAOJPA;
import modelo.persistencia.IngredienteDAOJPA;
import modelo.persistencia.ProdutoDAOJPA;
import modelo.persistencia.dao.EntradaProdutoDAO;
import modelo.persistencia.dao.IngredienteDAO;
import modelo.persistencia.dao.ProdutoDAO;

/**
 *
 * @author GUSTAVO
 */
public class IngredienteController {

    public Ingrediente salvar(Ingrediente novo) {
        IngredienteDAO dao = new IngredienteDAOJPA();
        return dao.save(novo);
    }

    public List<Ingrediente> listarIngrediente() {
        IngredienteDAO dao = new IngredienteDAOJPA();
        return dao.getAll(Ingrediente.class);
    }

    public boolean excluir(int id) {
        IngredienteDAO dao = new IngredienteDAOJPA();
        return dao.remove(Ingrediente.class, id);
    }

}
