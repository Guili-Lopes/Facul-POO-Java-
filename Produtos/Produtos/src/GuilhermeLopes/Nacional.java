package GuilhermeLopes;

/**
 *
 * @author Guilherme Lopes
 */
public class Nacional extends Produto{
    private String descricao;
    private double valor;
    private double imposto;
    private double taxa;
    
    public Nacional(){
    
    }
    
    public Nacional(String descricao, double preco){
        this.descricao = descricao;
        this.valor = preco;
        this.imposto = (preco * 10) / 100;
        this.taxa = (preco * 5) / 100;
    }
    
    public double calculoValorFinal(){
        return this.valor + this.imposto + this.taxa;
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
    
    
}
