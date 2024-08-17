package principal;

public class AssalariadoComissionado extends Comissionado{
    private double percentualBonus;
    
    public AssalariadoComissionado(){
        
    }
    
    public AssalariadoComissionado(double valorVendas, String nome, String sobrenome, int numIdent, double bonus) {
        super(valorVendas, nome, sobrenome, numIdent);
        this.percentualBonus = bonus;
    }
    
    @Override
    public double getValorAPagar(int dia, int mes) {
        return Passivo.SALARIO + (this.valorVendas * this.percentualBonus);
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    public void setPercentualBonus(double percentualBonus) {
        this.percentualBonus = percentualBonus;
    }
    
    
    
}
