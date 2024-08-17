package Principal;

import java.util.ArrayList;

public class AmbienteVirtual {
    private ArrayList<Forma> espacovirtual;
    
    public AmbienteVirtual(){
        espacovirtual = new ArrayList<>();
    }
    
    public void adicionarForma(Forma forma){
        this.espacovirtual.add(forma);
    }
    
    public boolean removerForma(Forma forma){
        return this.espacovirtual.remove(forma);
    }
    
    public double calcularVolumeTotal(){
        double volumeTotal = 0;
        for(Forma figura: this.espacovirtual){
            if(figura instanceof FormaTridimensional){
                volumeTotal += ((FormaTridimensional)figura).calcularVolume();
            }
        }
        return volumeTotal;
    }
    
    public double calcularAreaTotal(){
        double areaTotal = 0;
        
        for(Forma figura : this.espacovirtual){
            areaTotal += figura.calcularArea();
        }
        
        return areaTotal;
    }

    public ArrayList<Forma> getEspacovirtual() {
        return espacovirtual;
    }

    public void setEspacovirtual(ArrayList<Forma> espacovirtual) {
        this.espacovirtual = espacovirtual;
    }
    
    
}
