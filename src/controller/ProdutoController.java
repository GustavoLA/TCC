/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import modelo.negocio.Produto;
import modelo.persistencia.ProdutoDAOJPA;
import modelo.persistencia.dao.ProdutoDAO;

/**
 *
 * @author GUSTAVO
 */
public class ProdutoController {

    //Método para salvar um produto na base de dados
    public Produto salvar(Produto produto) {
        ProdutoDAO dao = new ProdutoDAOJPA();
        return dao.save(produto);
    }

    //Método para deletar um produto da base de dados
    public boolean excluir(int codigo) {
        ProdutoDAO dao = new ProdutoDAOJPA();
        return dao.remove(Produto.class, codigo);
    }

    //Método para listar produtos cadastrados na base de dados
    public List<Produto> listarProduto() {
        ProdutoDAO dao = new ProdutoDAOJPA();
        return dao.getAll(Produto.class);
    }

    //Método para listar produtos cadastrados na base de dados por ID
    public Produto listarProdutoPorId(int codigo) {
        ProdutoDAO dao = new ProdutoDAOJPA();
        return dao.getById(Produto.class, codigo);
    }

    //Método para pesquisar produtos cadastrados na base de dados por NOME
    public List<Produto> pesquisar(String nome) {
        ProdutoDAO dao = new ProdutoDAOJPA();
        return dao.pesquisar(nome);

    }

}
