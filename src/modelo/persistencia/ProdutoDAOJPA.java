/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.util.List;
import modelo.negocio.Produto;
import modelo.persistencia.dao.ProdutoDAO;

/**
 *
 * @author GUSTAVO
 */
public class ProdutoDAOJPA extends DAOJPA<Produto, Integer> implements ProdutoDAO {

    @Override
    public List<Produto> pesquisar(String nome) {
        return getEntityManager().createQuery("select x from Produto x where x.nome like '%" + nome + "%' order by nome").getResultList();
    }

}
