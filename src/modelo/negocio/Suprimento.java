package modelo.negocio;

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
    private String nome;
    private String unidadeMedida;
    private char notaFiscal;
    @Lob
    private String descricao;
    private char producao;
    @ManyToOne
    private Fornecedor fornecedor;
    private char outroFornecedor;

    public char getOutroFornecedor() {
        return outroFornecedor;
    }

    public void setOutroFornecedor(char outroFornecedor) {
        this.outroFornecedor = outroFornecedor;
    }

    //Para fazer a soma de todos as entradas de produto
    private int qnqtidadeTotal;

    public int getQnqtidadeTotal() {
        return qnqtidadeTotal;
    }

    public void setQnqtidadeTotal(int qnqtidadeTotal) {
        this.qnqtidadeTotal = qnqtidadeTotal;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
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

    public char getProducao() {
        return producao;
    }

    public void setProducao(char producao) {
        this.producao = producao;
    }

    @Override
    public String toString() {
        return nome;
    }

}
