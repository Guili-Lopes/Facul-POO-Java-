package Principal;
    
import java.util.HashSet;

public class Interpretadora {
    private HashSet<String> problemaCliente;
    
    public Interpretadora(){
        this.problemaCliente = new HashSet<String>();
    }
    
    public Interpretadora(String problema){
        this.problemaCliente = new HashSet<String>();
        String[] chave = problema.split(" ");
        
        for(int i=0; i<chave.length; i++){
            this.problemaCliente.add(chave[i].toLowerCase()); 
        }
    }
    
    public HashSet<String> getProblemaCliente() {
        return problemaCliente;
    }

    public void setProblemaCliente(HashSet<String> problemaCliente) {
        this.problemaCliente = problemaCliente;
    }

    
    public HashSet<String> palavraSolucao(){
        return getProblemaCliente();
    }
    
}