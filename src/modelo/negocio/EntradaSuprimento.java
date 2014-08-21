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
public class EntradaSuprimento {

    @Id
    @GeneratedValue
    private int codigo;
    @ManyToOne
    private Funcionario responsavel;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtMovimento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtVencimento;
    private int qntdade;
    @ManyToOne
    @JoinColumn(name = "idSuprimento", referencedColumnName = "codigo")
    private Suprimento suprimento;
    private double valor;
    private String formaPagamento;

    //Para fazer a soma de todos as entradas de produto
    private int qnqtidadeTotal;

    public int getQnqtidadeTotal() {
        return qnqtidadeTotal;
    }

    public void setQnqtidadeTotal(int qnqtidadeTotal) {
        this.qnqtidadeTotal = qnqtidadeTotal;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public int getQntdade() {
        return qntdade;
    }

    public void setQntdade(int qntdade) {
        this.qntdade = qntdade;
    }

    public Suprimento getSuprimento() {
        return suprimento;
    }

    public void setSuprimento(Suprimento suprimento) {
        this.suprimento = suprimento;
    }

}
