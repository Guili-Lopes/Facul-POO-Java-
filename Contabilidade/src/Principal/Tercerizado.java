package principal;

public class Tercerizado extends Funcionario {
    
    private double horasTrabalhadas;

    public Tercerizado(){
        
    }
    
    public Tercerizado(double horasTrabalhadas, String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    
    @Override
    public double getValorAPagar(int dia, int mes) {
        return this.horasTrabalhadas * Passivo.VALOR_HORA;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    

}
