/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import modelo.negocio.EntradaProduto;
import modelo.negocio.Produto;
import modelo.persistencia.EntradaProdutoDAOJPA;
import modelo.persistencia.ProdutoDAOJPA;
import modelo.persistencia.dao.EntradaProdutoDAO;
import modelo.persistencia.dao.ProdutoDAO;

/**
 *
 * @author GUSTAVO
 */
public class EntradaProdutoController {

    public EntradaProduto salvar(EntradaProduto novo) {
        EntradaProdutoDAO dao = new EntradaProdutoDAOJPA();
        return dao.save(novo);
    }

    public List<EntradaProduto> listarEntradaProduto(int id) {
        ProdutoDAO daos = new ProdutoDAOJPA();
        Produto p = daos.getById(Produto.class, id);
        EntradaProdutoDAO dao = new EntradaProdutoDAOJPA();
        return dao.getByProduto(p);
    }

}
