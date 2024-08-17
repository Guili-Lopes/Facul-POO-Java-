package GuilhermeLopes;

/**
 *
 * @author Guilherme  Lopes
 */

public class Importado extends Produto{
    private String descricao;
    private double valor;
    private double imposto;
    private double taxa;
    private double taxaImportacao;
    
    public Importado(){
    
    }
    
    public Importado(String descricao, double preco){
        this.descricao = descricao;
        this.valor = preco;
        this.imposto = (preco * 10) / 100;
        this.taxa = (preco * 5) / 100;
        this.taxaImportacao = ((preco * 5) / 100);
    }
    
    @Override
    public double calculoValorFinal() {
        return this.valor + this.imposto + this.taxa + this.taxaImportacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
    
    
}
