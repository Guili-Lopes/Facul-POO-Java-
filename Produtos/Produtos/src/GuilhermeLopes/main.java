package GuilhermeLopes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guilherme Lopes
 */

public class main {

    public static void main(String[] args) {
        int aux = 1;
        int opcao = 0;
        int cont_estadual = 1;
        int cont_nacional = 1;
        int cont_importado = 1;
        double valor = 0;
        
        String descricao;
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        
        while(opcao != 8){
            System.out.println("MENU");
            System.out.println("1 – Cadastrar Produto Estadual");
            System.out.println("2 – Cadastrar Produto Nacional");
            System.out.println("3 – Cadastrar Produto Importado");
            System.out.println("4 – Exibir Produtos Estaduais");
            System.out.println("5 – Exibir Produtos Nacionais");
            System.out.println("6 – Exibir Produtos Importados");
            System.out.println("7 – Exibir Todos Produtos");
            System.out.println("8 – SAIR");
            
            System.out.print("\nDigite a opcao desejada: ");
            opcao = input.nextInt();
            
            input.nextLine(); // Limpa buffer do teclado
            
            switch(opcao){
                case 1:
                    System.out.print("\nDigite a descricao do Produto Estadual: ");
                    descricao = input.nextLine();
                    
                    System.out.print("Digite o valor do Produto Estadual: ");
                    valor = input.nextInt();
                    
                    produtos.add(new Estadual(descricao, valor));
                    System.out.print("\n");
                    break;
                    
                case 2:
                    System.out.print("\nDigite a descricao do Produto Nacional: ");
                    descricao = input.nextLine();
                    
                    System.out.print("Digite o valor do Produto Nacional: ");
                    valor = input.nextInt();
                    
                    produtos.add(new Nacional(descricao, valor));
                    System.out.print("\n");
                    break;
                    
                case 3:
                    System.out.print("\nDigite a descricao do Produto Importado: ");
                    descricao = input.nextLine();
                    
                    System.out.print("Digite o valor do Produto Importado: ");
                    valor = input.nextInt();
                    
                    produtos.add(new Importado(descricao, valor));
                    System.out.print("\n");
                    break;
                    
                case 4:
                    aux = 1;
                    System.out.println("\nProdutos Estaduais");
                    for(Produto mercadoria: produtos){
                        if(mercadoria instanceof  Estadual){
                            System.out.printf("Produto %d\n", aux);
                            System.out.println("Descricao: " + ((Estadual)mercadoria).getDescricao());
                            System.out.printf("Valor Total: %.2f\n", mercadoria.calculoValorFinal());
                            System.out.printf("Valor Imposto: %.2f\n\n", ((Estadual)mercadoria).getImposto());
                            aux++;
                        }
                    }
                    System.out.print("\n");
                    break;
                    
                case 5:
                    aux = 1;
                    System.out.println("\nProdutos Nacionais");
                    for(Produto mercadoria: produtos){
                        if(mercadoria instanceof  Nacional){
                            System.out.printf("Produto %d\n", aux);
                            System.out.println("Descricao: " + ((Nacional)mercadoria).getDescricao());
                            System.out.printf("Valor Total: %.2f\n", mercadoria.calculoValorFinal());
                            System.out.printf("Valor Imposto: %.2f\n", ((Nacional)mercadoria).getImposto());
                            System.out.printf("Valor taxa: %.2f\n\n", ((Nacional)mercadoria).getTaxa());
                            aux++;
                        }
                    }
                    System.out.print("\n");
                    break;
                    
                case 6:
                    aux = 1;
                    System.out.println("\nProdutos Importados");
                    for(Produto mercadoria: produtos){
                        if(mercadoria instanceof  Importado){
                            System.out.printf("Produto %d\n", aux);
                            System.out.println("Descricao: " + ((Importado)mercadoria).getDescricao());
                            System.out.printf("Valor Total: %.2f\n", mercadoria.calculoValorFinal());
                            System.out.printf("Valor Imposto: %.2f\n", ((Importado)mercadoria).getImposto());
                            System.out.printf("Valor taxa: %.2f\n", ((Importado)mercadoria).getTaxa());
                            System.out.printf("Valor taxa importacao: %.2f\n\n", ((Importado)mercadoria).getTaxaImportacao());
                            aux++;
                        }
                    }
                    System.out.print("\n");
                    break;
                    
                case 7:
                    cont_estadual = 1;
                    cont_nacional = 1;
                    cont_importado = 1;
                    for(Produto mercadoria: produtos){
                        if(mercadoria instanceof  Estadual){
                            System.out.printf("Produto Estadual %d\n", cont_estadual);
                            System.out.println("Descricao: " + ((Estadual)mercadoria).getDescricao());
                            System.out.printf("Valor Total: %.2f\n", mercadoria.calculoValorFinal());
                            System.out.printf("Valor Imposto: %.2f\n\n", ((Estadual)mercadoria).getImposto());
                            cont_estadual++;
                        }
                        
                        if(mercadoria instanceof  Nacional){
                            System.out.printf("Produto Nacional %d\n", cont_nacional);
                            System.out.println("Descricao: " + ((Nacional)mercadoria).getDescricao());
                            System.out.printf("Valor Total: %.2f\n", mercadoria.calculoValorFinal());
                            System.out.printf("Valor Imposto: %.2f\n", ((Nacional)mercadoria).getImposto());
                            System.out.printf("Valor taxa: %.2f\n\n", ((Nacional)mercadoria).getTaxa());
                            cont_nacional++;
                        }
                        
                        if(mercadoria instanceof  Importado){
                            System.out.printf("Produto Importado %d\n", cont_importado);
                            System.out.println("Descricao: " + ((Importado)mercadoria).getDescricao());
                            System.out.printf("Valor Total: %.2f\n", mercadoria.calculoValorFinal());
                            System.out.printf("Valor Imposto: %.2f\n", ((Importado)mercadoria).getImposto());
                            System.out.printf("Valor taxa: %.2f\n", ((Importado)mercadoria).getTaxa());
                            System.out.printf("Valor taxa importacao: %.2f\n\n", ((Importado)mercadoria).getTaxaImportacao());
                            cont_importado++;
                        }
                    }
                    break;
                    
                case 8:
                    System.out.println("\n\nADEUS!");
                    break;
                    
                default:
                    System.out.println("\nOPCAO INVALIDA!!!\n");
                    break;
            }
            
            if(opcao == 8){
                break;
            }
        }
    }
    
}
