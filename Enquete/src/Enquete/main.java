//
//    ATIVIDADE 05 Extra - Enquete
//    Nome: Guilherme Lourenço Lopes
//    Data: 08/07/2024
//

package Enquete;

import java.security.SecureRandom;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        int num_entrevistados, nota_desejada, frequencia;  
        int[] aux;
        
        SecureRandom gerador = new SecureRandom();
        Scanner input = new Scanner(System.in);
        Enquete entrevista;
        
        System.out.print("Digite a quantidade de entrevistados: ");
        num_entrevistados = input.nextInt();
        
        System.out.print("As notas geradas foram: ");
        
        aux = new int[num_entrevistados];
        for(int i=0; i<num_entrevistados; i++){
            aux[i] = gerador.nextInt(11);
            System.out.print(aux[i] + " ");
        }
        
        entrevista = new Enquete(num_entrevistados);
        entrevista.setNotas(aux);
        
        System.out.print("\nDigite a nota que deseja saber a frequencia: ");
        nota_desejada = input.nextInt();
        
        frequencia = entrevista.frequencia_nota(nota_desejada);
        
        System.out.println("\nA nota " + nota_desejada + " apareceu " + frequencia + " vezes");
        
        System.out.println("A media das notas foram " + entrevista.media_notas());
    }
}
