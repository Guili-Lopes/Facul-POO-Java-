/* 
PROGRAMAÇÃO ORIENTADA A OBJETOS
Atividade 01 - Extra
Nome: Guilherme Lourenço Lopes
*/

package Principal;

// Importando bibliotecas
import java.util.Scanner;

public class main {

  // Definindo minha main
  public static void main(String[] args) {
    
    // Instanciando os objetos
    Cartas maiorA = new Cartas();
    Cartas maiorB = new Cartas();
    Jogador JogadorA;
    Jogador JogadorB;
    Baralho baralho;
    
    // Declarando variaveis locais
    int numCartas;
    int vitoria = 0;

    //Instaciando um objeto para realizar os input a partir do teclado
    Scanner scanner = new Scanner(System.in);
    
    do{
      // Criando o baralho
      baralho = new Baralho();
        
      System.out.println("Mesa embaralhando.........");
      // Embaralhando o baralho
      baralho.embaralhar();
      
      // Usuario insere quantas cartas jogador terá
      System.out.print("Quantas cartas cada jogador receberá? ");
      numCartas = scanner.nextInt();

      // Criando as mãos do jogadores. OBS: Estão vazias
      JogadorA = new Jogador(numCartas);
      JogadorB = new Jogador(numCartas);
      
      System.out.println("Mesa distribui as" + numCartas + "cartas para o jogador A e o jogador B");
       
      // Distribuindo as cartas
      JogadorA.receberCartas(baralho.DistribuirCartas(numCartas));
      JogadorB.receberCartas(baralho.DistribuirCartas(numCartas));

      // Cada jogador joga a maior carta em sua mao
      maiorA = JogadorA.jogarMaiorCarta();
      maiorB = JogadorB.jogarMaiorCarta();

      System.out.println("O jogador A joga a carta de naipe " + maiorA.getNaipe() + " e de valor " + maiorA.getValor());
      System.out.println("O jogador B joga a carta de naipe " + maiorB.getNaipe() + " e de valor " + maiorB.getValor());

      // Verificando quem ganhou a rodada
      if (maiorA.getValor() > maiorB.getValor() || (maiorA.getValor() == maiorB.getValor() && maiorA.getNaipe().equals("Ouros")) || (maiorA.getValor() < maiorB.getValor() && maiorA.getNaipe().equals("Ouros")))  {
        System.out.println("\nJogador A venceu o jogo");
        vitoria = 1;
      } 
        
      else if (maiorB.getValor() > maiorA.getValor() || (maiorB.getValor() == maiorA.getValor() && maiorB.getNaipe().equals("Ouros")) || (maiorB.getValor() < maiorA.getValor() &&  maiorB.getNaipe().equals("Ouros"))) {
        System.out.println("\nJogador B venceu o jogo");
        vitoria = 1;
      } 
        
      else {
        System.out.println( "Como os valores das cartas sao iguais e nenhum jogador tem carta de ouros o jogo ficou empatado!");
        System.out.println("Jogando novamente. . .");
      }
    } while(vitoria != 1);
  }
}