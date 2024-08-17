package Principal;

public class Cartas {
  // Declarando os atributos da classe
  private  String naipe;
  private  int valor;

  // Método construtor vazio
  public Cartas(){}

  // Método construtor que recebe o valor e o naipe da carta
  public Cartas(int valor, String naipe){
    this.naipe = naipe;
    this.valor = valor;
  }

  //Método que retorna o valor da carta
  public int getValor(){
    return this.valor;
  }

  //Método que retorna o naipe da carta
  public String getNaipe(){
    return this.naipe;
  }

}