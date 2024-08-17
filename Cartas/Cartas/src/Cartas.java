public class Cartas {
    private  String naipe;
    private  int valor;
    
    public Cartas(){
    this.naipe = "";
    this.valor = 0;
    }
    
    public Cartas(int valor, String naipe){
        this.naipe = naipe;
        this.valor = valor;
    }
    
    public Cartas(Cartas carta){
        this.naipe = carta.getNaipe();
        this.valor = carta.getValor();
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public void setNaipe(String naipe){
        this.naipe = naipe;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public String getNaipe(){
        return this.naipe;
    }
    
    public int comparaValor(Cartas carta){
        if(this.valor > carta.valor){
            return 1;
        }
        else{
            if(this.valor < carta.valor){
                return -1;
            }
            else{
                return 0;
            }
        }     
    }
    
    public boolean comparaNaipe(Cartas carta){
        return this.naipe.equals(carta.getNaipe() );
    }
}


