/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.persistencia.dao;

import java.util.List;
import modelo.negocio.Produto;

/**
 *
 * @author GUSTAVO
 */
public interface ProdutoDAO extends DAO<Produto, Integer>{
    
        List<Produto> pesquisar(String nome);

    
}
