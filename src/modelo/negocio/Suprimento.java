package modelo.negocio;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Suprimento {

    @Id
    @GeneratedValue
    private int codigo;
    private int qtdade;
    private String nome;
    private Double valor;
    private String unidadeMedida;
    private char notaFiscal;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtVencimento;
    @Lob
    private String descricao;
    private char producao;
    @ManyToOne
    private Fornecedor fornecedor;
    @Column(nullable = false)
    private String formaPagamento;
    
    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public char getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(char notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtdade() {
        return qtdade;
    }

    public void setQtdade(int qtdade) {
        this.qtdade = qtdade;
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

    public char getProducao() {
        return producao;
    }

    public void setProducao(char producao) {
        this.producao = producao;
    }

}
