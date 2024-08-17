package GuilhermeLopes;

/**
 *
 * @author Guilherme Lopes
 */
public class Estadual extends Produto{
    
    private String descricao;
    private double valor;
    private double imposto;
    
    public Estadual(){
    
    }
    
    public Estadual(String descricao, double preco){
        this.descricao = descricao;
        this.valor = preco;
        this.imposto = (preco * 10) / 100;
    }
    
    @Override
    public double calculoValorFinal(){
        return this.valor + this.imposto;
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
    
    
}
