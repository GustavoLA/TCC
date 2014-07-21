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
    private String responsavel;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtMovimento;
    private int qntdade;
    @ManyToOne
    @JoinColumn(name = "idSuprimento", referencedColumnName = "codigo")
    private Suprimento suprimento;

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
