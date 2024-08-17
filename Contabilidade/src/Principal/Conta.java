package principal;

public abstract class  Conta implements Passivo{
    protected int vencimento_dia;
    protected int mes;
    protected double valor;

    public Conta(){
        
    }
    
    public Conta(int dia, int mes, double valor) {
        this.vencimento_dia = dia;
        this.mes = mes;
        this.valor = valor;
    }
    
    public int getDia() {
        return vencimento_dia;
    }

    public void setDia(int dia) {
        this.vencimento_dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
