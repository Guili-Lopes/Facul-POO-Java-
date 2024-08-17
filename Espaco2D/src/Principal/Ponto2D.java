package Principal;

public class Ponto2D {
    private double x;
    private double y;
    
    // MÉTODOS CONSTRUTORES
    public Ponto2D(){
        x = 0.0;
        y = 0.0;
    }
    
    public Ponto2D(double X, double Y){
        this.x = X;
        this.y = Y;
    }
    
    public Ponto2D(Ponto2D coordenadas){
        this.x = coordenadas.getX();
        this.y = coordenadas.getY();
    }
    
    // MÉTODOS PRINCIPAIS
    public double distancia(Ponto2D coordenada){
        double distancia;
        distancia = Math.sqrt(  Math.pow(this.x - coordenada.getX(), 2)  +  Math.pow(this.y - coordenada.getY(), 2) )  ;
        
        return distancia;
    }
    
    // METODOS GET e SET
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}