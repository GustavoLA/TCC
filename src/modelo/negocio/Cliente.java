package modelo.negocio;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;

@Entity
public class Cliente extends Pessoa {

    private String celular;
    private String email;
    private String anotacoes;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtCadastro;

    public Cliente() {
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

}
