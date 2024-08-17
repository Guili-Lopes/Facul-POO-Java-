package principal;

public class Comissionado extends Funcionario{

    protected double valorVendas;   

    public Comissionado(){
    
    }
    
    public Comissionado(double valorVendas, String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.valorVendas = valorVendas;
    }
    
    
    @Override
    public double getValorAPagar(int dia, int mes) {
        return this.valorVendas * 0.6;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
 
}
