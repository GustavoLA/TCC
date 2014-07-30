/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.negocio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

/**
 *
 * @author GUSTAVO
 */
@Entity
public class Produto {

    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    @Lob
    private String descricao;

    @ManyToMany
    private List<Suprimento> suprimento = new ArrayList();

    public List<Suprimento> getSuprimento() {
        return suprimento;
    }

    public void setSuprimento(List<Suprimento> suprimento) {
        this.suprimento = suprimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
