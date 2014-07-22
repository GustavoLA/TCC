/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author GUSTAVO
 */
@Entity
public class Ingrediente {

    @Id
    @GeneratedValue
    private int codigo;
    @ManyToOne
    private Suprimento nome;
    private int qntidade;
    private String medida;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Suprimento getNome() {
        return nome;
    }

    public void setNome(Suprimento nome) {
        this.nome = nome;
    }

    public int getQntidade() {
        return qntidade;
    }

    public void setQntidade(int qntidade) {
        this.qntidade = qntidade;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

}
