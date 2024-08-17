package principal;

public class Modalidade {
    private String esporte;
    private int limite_maximo;

    public Modalidade(){
    }
    
    public Modalidade(Modalidade esporte){
        this.esporte = esporte.getEsporte();
        this.limite_maximo = esporte.getLimite_maximo();
    }
    
    public Modalidade(String esporte, int limite_maximo) {
        this.esporte = esporte;
        this.limite_maximo = limite_maximo;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public int getLimite_maximo() {
        return limite_maximo;
    }

    public void setLimite_maximo(int limite_maximo) {
        this.limite_maximo = limite_maximo;
    }
    
    
}
