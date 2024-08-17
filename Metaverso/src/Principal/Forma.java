package Principal;

public abstract class Forma {
    private String cor;
    
    public Forma(){
        
    }
    
    public Forma(String cor){
        this.cor = cor;
    }
   
    public abstract double calcularArea();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
