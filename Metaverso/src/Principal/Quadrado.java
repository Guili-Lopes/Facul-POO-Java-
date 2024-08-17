package Principal;

public class Quadrado extends FormaBidimensional{
    private double lado;
    
    public Quadrado(){
        
    }
    
    public Quadrado(String cor, double lado){
        super(cor);
        this.lado = lado;
    }
    
    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
 
    
}
