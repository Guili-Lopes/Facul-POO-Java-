package Enquete;

public class Enquete {
    private int[] notas;
    
    public Enquete(){
    }
    
    public Enquete(int num_entrevistados){
        this.notas = new int[num_entrevistados];
    }

    public int frequencia_nota(int nota){
        int frequencia=0;
        
        for(int i=0; i<this.notas.length; i++){
            if(this.notas[i] == nota)
                frequencia++;
        }
        
        return frequencia;
    }
    
    public double media_notas(){
        int soma=0;
        float media;
        
        for(int num : this.notas){
            soma += num;
        }
        
        return media = soma/this.notas.length;
    }
    
    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    
}