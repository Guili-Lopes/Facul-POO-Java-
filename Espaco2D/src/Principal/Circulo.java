package Principal;

import java.util.ArrayList;

public class Circulo extends Forma {
    
    public Circulo(){
        super();
    }
    
    public Circulo(ArrayList<Ponto2D> coordenadas){
        super(coordenadas);
    }
    
    @Override //Querida Luciana por que a IDE recomenda eu colocar esse @Override, e o que ele significa ? 
    public double calculaArea(){
        double area = 0.0;
        double raio = pontos.get(0).distancia(pontos.get(1));
        area = Math.pow(raio, 2) * Math.PI;
        
        return area;
    }
    
    @Override
    public double calculaPerimetro(){
        double perimetro = 0.0;
        double raio = pontos.get(0).distancia(pontos.get(1));
        perimetro = 2 * Math.PI * raio;
        
        return perimetro;
    }
}
