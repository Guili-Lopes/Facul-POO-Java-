package Principal;

public class Circulo extends FormaBidimensional{
    private double raio;
    
    public Circulo(){
        
    }
    
    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return 2 * Math.PI * this.raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
}
