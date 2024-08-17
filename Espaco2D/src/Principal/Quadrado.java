package Principal;

import java.util.ArrayList;

public class Quadrado extends Forma{
    
    public Quadrado(){
        super();
    }
    
    public Quadrado(ArrayList<Ponto2D> coordenadas){
        super(coordenadas);
    }
    
    @Override
    public double calculaArea(){
        double area = 0.0;
        double lado = pontos.get(0).distancia(pontos.get(1));
        area = Math.pow(lado ,2);
        
        return area;
    }
    
    @Override
    public double calculaPerimetro(){
        double perimetro = 0.0;
        double lado = pontos.get(0).distancia(pontos.get(1));
        perimetro = 4 * lado;
        
        return perimetro;
    }
}
