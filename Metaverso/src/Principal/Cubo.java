package Principal;

public class Cubo extends FormaTridimensional{
    private double aresta;

    public Cubo(){

    }

    public Cubo(String cor, double aresta){
        super(cor);
        this.aresta = aresta;
    }

    @Override
    public double calcularVolume() {
       return Math.pow(this.aresta, 3);
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(this.aresta, 4);
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    
}
