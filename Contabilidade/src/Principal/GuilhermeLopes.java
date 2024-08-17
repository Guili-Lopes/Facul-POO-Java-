package principal;

public class GuilhermeLopes {

    public static void main(String[] args) {
        double pagamentoContas;
        double pagamentoFuncionarios;
        
        ControlePagamento passivos = new ControlePagamento();
        
        Conta conta1 = new TItulo(27, 03, 25);    //Atrasada
        Conta conta2 = new TItulo(13, 04, 50);    //Em dia
        Conta conta3 = new Concessionaria(15, 25, 100);
        
        Funcionario funcionario1 = new Assalariado(3, "Guilherme", "Lopes", 123);
        Funcionario funcionario2 = new Tercerizado(15, "Yan", "Pacheco", 456);
        Funcionario funcionario3 = new Comissionado(230, "Luciana", "Campos", 789);
        Funcionario funcionario4 = new AssalariadoComissionado(120, "Dom", "Pedro", 000, 0.3);
        
        passivos.adicionarPassivos(conta1);
        passivos.adicionarPassivos(conta2);
        passivos.adicionarPassivos(conta3);
        
        passivos.adicionarPassivos(funcionario1);
        passivos.adicionarPassivos(funcionario2);
        passivos.adicionarPassivos(funcionario3);
        passivos.adicionarPassivos(funcionario4);
        
        pagamentoContas = passivos.valorTotalContas();
        pagamentoFuncionarios = passivos.valorTotalFuncionarios();
        
        System.out.println("VALOR A SER PAGO: ");
        System.out.printf("Total a pagar de contas: R$ %.2f\n", pagamentoContas);
        System.out.printf("Total a pagar aos funcionarios: R$ %.2f\n", pagamentoFuncionarios);
    }
    
}
