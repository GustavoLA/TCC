/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.negocio;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author GUSTAVO
 */
@Entity
public class EntradaProduto {

    @Id
    @GeneratedValue
    private int codigo;
    //Terá que virar uma lista de funcionarios Combobox
    private String responsavel;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtFabricacao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtValidade;
    private int qntidade;
    @ManyToOne
    @JoinColumn(name = "idProduto", referencedColumnName = "codigo")
    private Produto produto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Date getDtFabricacao() {
        return dtFabricacao;
    }

    public void setDtFabricacao(Date dtFabricacao) {
        this.dtFabricacao = dtFabricacao;
    }

    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public int getQntidade() {
        return qntidade;
    }

    public void setQntidade(int qntidade) {
        this.qntidade = qntidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
