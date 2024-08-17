package Principal;  // Comparador de objetos ---> instanceof;

import java.util.ArrayList;

public class Espaco2D {
    private ArrayList<Forma> figuras;
   
     //MÉTODOS CONSTRUTORES
    public Espaco2D() {
        figuras = new ArrayList<Forma>();
    }
    
    // MÉTODOS PRINCIPAIS
    public boolean adicionaForma(Forma forma){
        forma = this.criaForma(forma.getPontos());
        if (forma != null) {
            return figuras.add(forma);
        } else {
            return false;
        }
    }
    
    public Forma criaForma(ArrayList<Ponto2D> pontos){
        return Forma.figuraPlana(pontos);    //return figuras.get(0).geraForma(pontos);
    }
    
    public double calculaAreaTotal(){
        double areaTotal = 0.0;
        
        for(Forma i : figuras)
            areaTotal += i.calculaArea();
        
        return areaTotal;
    }
    
    public double calculaPerimetroTotal(){
        double perimetroTotal = 0.0;
        
        for(Forma i : figuras)
            perimetroTotal += i.calculaPerimetro();
        
        return perimetroTotal;
    }
    
    public String mostraTipoTriangulo(){
        String tipo = new String();
        
        for (Forma i : figuras) {
            if (i instanceof Triangulo) {
                tipo = i.tipoTriangulo();
                return tipo;
            }
        }
        
        return null;
    }
    
    // MÉTODOS SET e GET
    public ArrayList<Forma> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Forma> figura) {
        this.figuras = figura;
    }  
}
