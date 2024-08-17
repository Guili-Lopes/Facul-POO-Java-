/* 
PROGRAMAÇÃO ORIENTADA A OBJETOS
Atividade 01
Nome: Guilherme Lourenço Lopes
*/

// Importando Classes
import java.util.Scanner;


public class main {
    
    // Função Principal 
    public static void main(String[] args) {
        
        // Declaração de variaveis
        int valor1, valor2, ValorComparado;
        String naipe1, naipe2;
        boolean NaipeComparado;
        
        // Instaciando os objetos
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor da carta 01: ");
        valor1 = input.nextInt();
        System.out.print("Digite o naipe 01: ");
        naipe1 = input.next();
        
        System.out.print("Digite o valor da carta 02: ");
        valor2 = input.nextInt();
        System.out.println("Digite o naipe 02: ");
        naipe2 = input.next();
        
        Cartas c1 = new Cartas(valor1, naipe1);
        Cartas c2 = new Cartas(valor2, naipe2);
        
        
        // Comparando valores e naipes das cartas
        ValorComparado = c1.comparaValor(c2);
        NaipeComparado = c2.comparaNaipe(c1);
        
        // Printando o resultado das comparações
        System.out.println("\nValor comparado: " + ValorComparado);
        System.out.println("Naipe comparado: " + NaipeComparado);
    }
    
}
