/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.util.List;
import modelo.negocio.EntradaProduto;
import modelo.negocio.Produto;
import modelo.persistencia.dao.EntradaProdutoDAO;

/**
 *
 * @author GUSTAVO
 */
public class EntradaProdutoDAOJPA extends DAOJPA<EntradaProduto, Integer> implements EntradaProdutoDAO {

    @Override
    public List<EntradaProduto> getByProduto(Produto p) {
        return getEntityManager().createQuery("select x from EntradaProduto x where x.produto.codigo = " + p.getCodigo()).getResultList();

    }
}
