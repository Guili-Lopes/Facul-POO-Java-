package Principal;

import java.util.ArrayList;

public abstract class Forma {
    protected ArrayList<Ponto2D> pontos;
    
    //MÉTODOS CONSTRUTORES
    public Forma() {
        pontos = new ArrayList<>();
    }
    
    public Forma(ArrayList<Ponto2D> coordenadas){
        this.pontos = coordenadas;
    }
    
    //MÉTODOS PRINCIPAIS
    public abstract double calculaArea();
    
    public abstract double calculaPerimetro();
    
    public String tipoTriangulo(){
        return null;
    }
    
    public static Forma figuraPlana(ArrayList<Ponto2D> coordenadas){
        if(coordenadas.size() == 2){
            if(coordenadas.get(0).distancia(coordenadas.get(1)) > 0)
                return new Circulo(coordenadas);
        }
        else{
            if(coordenadas.size() == 3){
                double dist1 = coordenadas.get(0).distancia(coordenadas.get(1));
                double dist2 = coordenadas.get(0).distancia(coordenadas.get(2));
                double dist3 = coordenadas.get(1).distancia(coordenadas.get(2));
                
                if( (dist1 + dist2) > dist3 )
                    return new Triangulo(coordenadas);
            }
            else{
                if(coordenadas.size() == 4)
                    return new Quadrado(coordenadas);
            }
        }
        
        return null;
    }
    
    // MÉTODOS SET e GET
    public ArrayList<Ponto2D> getPontos() {
        return pontos;
    }

    public void setPontos(ArrayList<Ponto2D> pontos) {
        this.pontos = pontos;
    }           
}