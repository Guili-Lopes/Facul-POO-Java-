/*
    ATIVIDADE 03 - SUPERMERCADO
    Nome: Guilherme Lourenço Lopes
    Data: 21/03/2024
 */
package Principal;

// Importando bibliotecas
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int codigoProduto = -1, quantidadeProduto, cont = 0;
        double totalVenda = 0.0, valorAnt = 0.0;

        Scanner scanner = new Scanner(System.in);
        Estoque docas = new Estoque(7);
        Venda carrinho = new Venda();
                
        docas.adicionarItem(new Item(new Produto("Detergente ABC", 1, 1.0), 10));
        docas.adicionarItem(new Item(new Produto("Sabao em po OMO", 2, 6.50), 10));
        docas.adicionarItem(new Item(new Produto("Shampoo Beleza Facil", 3, 12.0), 10));
        docas.adicionarItem(new Item(new Produto("Creme dental Colgate ", 4, 3.50), 10));
        docas.adicionarItem(new Item(new Produto("Sabonete Nivea", 5, 1.80), 10));
        docas.adicionarItem(new Item(new Produto("Biscoito Maizena", 6, 2.0), 10));
        docas.adicionarItem(new Item(new Produto("Leite desnatado Parmalat", 7, 3.0), 10));

        System.out.println("Seja bem vindo ao Supermercado Noite LTDA! Que tal irmos as compras? Aqui temos as seguintes opcoes:\n");
        System.out.println("CODIGO | DESCRICAO | PRECO");
        System.out.println("1 - Detergente ABC - R$ 1,00");
        System.out.println("2 - Sabao em po OMO - R$ 6,50");
        System.out.println("3 - Shampoo Beleza Facil - R$ 12,00");
        System.out.println("4 - Creme dental Colgate - R$ 3,50");
        System.out.println("5 - Sabonete Nivea - R$ 1,80");
        System.out.println("6 - Biscoito Maizena - R$ 2,00");
        System.out.println("7 - Leite desnatado Parmalat - R$ 3,00");
        
        System.out.println("\n\nIniciando as compras. . .\n");
        while (codigoProduto != 0) {
            System.out.println("Para encerrar a compra basta digitar o codigo de produto 0");
            System.out.print("Digite o codigo do produto que deseja comprar: ");
            codigoProduto = scanner.nextInt();
            if(codigoProduto<0 || codigoProduto>7){
                System.out.println("CODIGO INVALIDO!");
                continue;
            }
            if (codigoProduto != 0) {
                System.out.print("Agora digite a quantidade desejada: ");
                quantidadeProduto = scanner.nextInt();

                if (docas.retirarItem(codigoProduto, quantidadeProduto) == false) {
                    System.out.println("\nQUANTIDADE DESEJADA INVALIDA! Tente novamente.");
                } else {
		    Item itemRetirar = docas.buscarItem(codigoProduto);
		    if(itemRetirar == null){
		    	continue;
                    }
                    Item mercadoria = new Item(docas.buscarItem(codigoProduto).getItem(), quantidadeProduto);
                    carrinho.adicionarProduto(mercadoria);
                    totalVenda = valorAnt + carrinho.precoVenda();
                    valorAnt = totalVenda;
                    docas.retirarItem(codigoProduto, quantidadeProduto);
                    cont++;
                }
            }
          System.out.println("\nContinuando as compras. . .");
        }
        
        Item[] cupom = new Item[cont];
        cupom = carrinho.getCupomFiscal();
       
        
        // Imprimindo o cupom fiscal da compra
        System.out.println("\n\n\tSUPERMERCADO NOITE LTDA\n");
        System.out.println("Rua Escura Nº 13, Bairro Madrugada Belo Horizonte - MG");
        System.out.println("CNPJ: 13.1313.13/1313-13" + "\t" + "25/03/2024");
        System.out.println("\n---------------------------------------------------------\n");
        System.out.println("ITENS COMPRADOS");
        for(int i=0; i<cupom.length; i++){
            if(cupom[i] != null){
                System.out.println(cupom[i].getQuantidade() + "x " + cupom[i].getItem().getDescricao() + " R$ " + cupom[i].getPrecoTotal());
            }
        }
        System.out.println("\nTOTAL DA COMPRA R$ " + totalVenda);
    }
}