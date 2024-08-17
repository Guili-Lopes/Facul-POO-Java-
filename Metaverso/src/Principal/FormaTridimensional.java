package Principal;

public abstract class FormaTridimensional extends Forma{
    public abstract double calcularVolume();
    
    public FormaTridimensional(){
        
    }
    
    public FormaTridimensional(String cor){
        super(cor);
    }

}
