package Principal;

public class Tetraedro extends FormaTridimensional{
    private double aresta;

    public Tetraedro(){

    }

    public Tetraedro(String cor, double aresta){
        super(cor);
        this.aresta = aresta;
    }

    @Override
    public double calcularVolume() {
       return (Math.pow(this.aresta, 3) * Math.sqrt(3)) / 12;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.aresta, 2) * Math.sqrt(3);
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    
}
