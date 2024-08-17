
package Principal;

// Importando bibliotecas
import java.util.Random;

public class Baralho {
  // Declarando os atributos da classe
  private String[] naipes = {"Copas","Ouros","Paus","Espadas"};
  private Cartas[] baralho;
  private Random gerador;

  // Metodo construtor que cria o baralho em ordem
  public Baralho(){
    // Declarando variaveis locais
    int cont = 0;
    baralho = new Cartas[52];

    // Loop que cria o baralho com base no vetor String naipes e outro de loop de 1 a 13 (Numeros do baralho)
    for(int i=0; i<naipes.length; i++){
      for(int j=1; j<=13; j++){
        baralho[cont] = new Cartas(j, naipes[i]);
        cont++;
      }
    }
  }

  // Metodo que embaralha o baralho
  public void embaralhar(){
    // Declarando variaveis locais
    Cartas aux;
    int posicao;
    gerador = new Random();

    // Loop por pegar um numero aleatorio como posicao e trocar com a posicao atual
    for(int i=0; i<baralho.length; i++){
      posicao = gerador.nextInt(52);
      aux = baralho[posicao];
      baralho[i] = aux;
    }
  }

  //Metodo que distribui as cartas para os jogadores com base na quantidade de cartas que cada um receberá
  public Cartas[] DistribuirCartas(int quantidade){
    // Declarando variaveis locais
    Cartas[] aux = new Cartas[quantidade];
    int cont = 0;

    // Loop que armazena as primeiras cartas em um vetor auxiliar e depois apaga as cartas do baralho daquela posicao
    for(int i=0; i <quantidade; i++){
      aux[i] = baralho[cont];
      baralho[cont++] = null;

      // Loop responsável por preencher o valor null do baralho e o jogar para o final
      for(int j=2; j<baralho.length-1; j++){
        baralho[j-1] = baralho[j];
      }
    }     
    return aux;
  }
  
}