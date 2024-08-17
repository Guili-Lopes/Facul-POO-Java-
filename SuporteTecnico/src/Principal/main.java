package Principal;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Suporte retorno = new Suporte();
        Scanner str = new Scanner(System.in);
        
        while(true){
            System.out.println("Bem-vindo ao sistema de Suporte Tecnico\n" + "Pressione <enter> para continuar ou digite 'sair' para sair do sistema.\n");
            
            System.out.println("Descreva seu problema de maneira sucinta.");
            String entrada = str.nextLine();
                    
            if(entrada.equals("sair") || entrada.equals("Sair")){
                System.out.println("Obrigado por utilizar nossos servicos!");
                break;
            }
            else{
                System.out.println(retorno.RespostaSolucao(entrada));
            }
        }
    }
    
}