package modelo.negocio;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;

@Entity
public class Funcionario extends Pessoa {

    //Carteira de trabalho
    private String cTrabalho;
    //Fazer radio box na interface grafica
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtAdmissao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtDemissao;
    private double salario;
    @Column(unique = true)
    private String login;
    private String senha;

    public Funcionario() {
    }

    public String getcTrabalho() {
        return cTrabalho;
    }

    public void setcTrabalho(String cTrabalho) {
        this.cTrabalho = cTrabalho;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public Date getDtDemissao() {
        return dtDemissao;
    }

    public void setDtDemissao(Date dtDemissao) {
        this.dtDemissao = dtDemissao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return login;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
