package Principal;

public class Jogador {
  // Declarando os atributos da classe
  Cartas[] mao;

  // Método construtor que crio um vetor vazio de cartas com a quantidade de cartas que o jogador receberá
  public Jogador(int quantidade){
    mao = new Cartas[quantidade];
  }

  // Método que recebe as cartas do baralho e as armazena na mão do jogador
  public void receberCartas(Cartas[] carta){
    mao = carta;
  }

  // Método que joga a maior carta da mão do jogador
  public Cartas jogarMaiorCarta(){
    // Declarando variaveis locais
    Cartas maiorCarta = new Cartas();
    Cartas maiorAux = new Cartas();
    boolean ouros = false;

    // Atribuo a posicao 0 do vetor mao a maior carta
    maiorCarta = mao[0];

    // Loop resposável por percorrer o vetor mao e verificar se há uma carta de ouros
    for (int i=0; i<mao.length; i++) {
      // Condição que verifica se a carta é de ouros
        if (mao[i].getNaipe().equals("Ouros") ) {
          ouros = true;
          maiorAux = mao[i];
          break;
        }
    }

    // Condição que verifica se há ouros na mão do jogador
    if(ouros == true){
      // Loop que percorre o vetor mao
      for (int i=0; i<mao.length; i++) {
        // Condição que verifica se a posicao atual do vetor mao é ouros
        if (mao[i].getNaipe().equals("Ouros")) {
          // Condição que verifica se o valor da carta ouros atual é maior que a outra
          if (mao[i].getValor() > maiorAux.getValor()) {
            maiorAux = mao[i];
          }
        }
      }
      return maiorAux;
    }

    // Condição que verifica se não há ouros na mão do jogador
    else{
      // Loop que o vetor mao para pegar a carta de maior valor, uma vez que não tem uma carta de ouros
      for(int i=1; i<mao.length; i++){
        // Condição que verifica se a carta atual é maior que a outra
        if (mao[i].getValor() > maiorCarta.getValor() ) {
            maiorCarta = mao[i];
        }
      }   
      return maiorCarta;
    }
  }  
}

