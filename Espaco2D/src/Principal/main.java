package Principal;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        
        Espaco2D espaco = new Espaco2D();
        
        ArrayList<Ponto2D> pontosCirculo = new ArrayList<>();
        pontosCirculo.add(new Ponto2D(0, 0));
        pontosCirculo.add(new Ponto2D(0, 2));
        
        ArrayList<Ponto2D> pontosTriangulo = new ArrayList<>();
        pontosTriangulo.add(new Ponto2D(0, 0));
        pontosTriangulo.add(new Ponto2D(1, 0));
        pontosTriangulo.add(new Ponto2D(0, 1));
        
        
        ArrayList<Ponto2D> pontosQuadrado = new ArrayList<>();
        pontosQuadrado.add(new Ponto2D(0, 0));
        pontosQuadrado.add(new Ponto2D(0, 2));
        pontosQuadrado.add(new Ponto2D(2, 2));
        pontosQuadrado.add(new Ponto2D(2, 0));
        
        Forma circulo = Forma.figuraPlana(pontosCirculo);
        if (circulo != null) {
            espaco.adicionaForma(circulo);
        }

        
        Forma triangulo = Forma.figuraPlana(pontosTriangulo);
        if (triangulo != null) {
            espaco.adicionaForma(triangulo);
        }

        
        Forma quadrado = Forma.figuraPlana(pontosQuadrado);
        if (quadrado != null) {
            espaco.adicionaForma(quadrado);
        }

        System.out.println("Tipos de triângulo formados: " + espaco.mostraTipoTriangulo());

        double areaTotal = espaco.calculaAreaTotal();
        double perimetroTotal = espaco.calculaPerimetroTotal();
        
        String areaFormatada = df.format(areaTotal);
        String perimetroFormatado = df.format(perimetroTotal);
        
        System.out.println("Total da área das formas: " + areaFormatada);
        System.out.println("Total do perímetro das formas: " + perimetroFormatado);
    }
    
}
