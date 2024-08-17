package Principal;

import java.util.ArrayList;

public class Triangulo extends Forma{
    
    public Triangulo(){
        super();
    }
    
    public Triangulo(ArrayList<Ponto2D> coordenadas){
        super(coordenadas);
    }
    
    @Override
    public double calculaArea(){
        double area = 0.0;
        double lado1 = pontos.get(0).distancia(pontos.get(1));
        double lado2 = pontos.get(0).distancia(pontos.get(2));
        double lado3 = pontos.get(1).distancia(pontos.get(2));
        double semi_perimetro = (lado1+lado2+lado3) / 2;
        
        area = Math.sqrt(  semi_perimetro *(semi_perimetro - lado1) * (semi_perimetro - lado2) * (semi_perimetro - lado3)  );
        return area;
    }
    
    @Override
    public double calculaPerimetro(){
        double perimetro = 0.0;
        double lado1 = pontos.get(0).distancia(pontos.get(1));
        double lado2 = pontos.get(0).distancia(pontos.get(2));
        double lado3 = pontos.get(1).distancia(pontos.get(2));
        
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
    
    @Override
    public String tipoTriangulo(){
        double lado1 = pontos.get(0).distancia(pontos.get(1));
        double lado2 = pontos.get(0).distancia(pontos.get(2));
        double lado3 = pontos.get(1).distancia(pontos.get(2));
        
        if(  (lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3) )
            return "ESCALENO";
        else{
            if ( (lado1 == lado2) && (lado1 == lado3) )
                return "EQUILATERO";
        }
        
        return "ISOSCELES";
    }
}
