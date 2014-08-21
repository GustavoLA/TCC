/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author GUSTAVO
 */
@Entity
public class Estoque {

    @GeneratedValue
    @Id
    private int id;
    private int qntidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQntidade() {
        return qntidade;
    }

    public void setQntidade(int qntidade) {
        this.qntidade = qntidade;
    }

}
