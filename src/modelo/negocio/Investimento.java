package modelo.negocio;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;

@Entity
public class Investimento {

    @Id
    @GeneratedValue
    private int codigo;
    @Lob
    private String descricaoInvestimento;
    private String formaPagamento;
    private double valorTotal;
    private double valorParcela;
    private int numeroParcelas;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtInvestimento;

    public Investimento() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoInvestimento() {
        return descricaoInvestimento;
    }

    public void setDescricaoInvestimento(String descricaoInvestimento) {
        this.descricaoInvestimento = descricaoInvestimento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public Date getDtInvestimento() {
        return dtInvestimento;
    }

    public void setDtInvestimento(Date dtInvestimento) {
        this.dtInvestimento = dtInvestimento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

}
