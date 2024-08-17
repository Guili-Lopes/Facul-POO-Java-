package principal;

public class Assalariado extends Funcionario{
    
    private double horasExtras;

    public Assalariado(){
        
    }
    
    public Assalariado(double horasExtras, String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.horasExtras = horasExtras;
    }
    
    @Override
    public double getValorAPagar(int dia, int mes) {
        
        return Passivo.SALARIO + (Passivo.VALOR_HORA * this.horasExtras);
    }
    
}
