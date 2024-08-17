package Principal;

public class Esfera extends FormaTridimensional{
    private double raio;
    
    public Esfera(){
    
    }
    
    public Esfera(String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularVolume() {
        return (4 * Math.PI * Math.pow(this.raio, 3)) / 3;
    }

    @Override
    public double calcularArea() {
       return 4 * Math.PI * Math.pow(this.raio, 3);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    

}
