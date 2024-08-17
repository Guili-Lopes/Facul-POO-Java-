package principal;

import java.util.ArrayList;

public class ControlePagamento {
    private ArrayList<Passivo> passivos;
    private double valorTotalContas;
    private double valorTotalFuncionarios;
            
    public ControlePagamento(){
        this.passivos = new ArrayList<>();
    }

    public ControlePagamento(ArrayList<Passivo> passivos, double valorTotalContas, double valorTotalFuncionarios) {
        this.passivos = new ArrayList<>();
        this.passivos = passivos;
        this.valorTotalContas = valorTotalContas;
        this.valorTotalFuncionarios = valorTotalFuncionarios;
    }
    
    public double valorTotalContas(){
        double totalContas = 0.0;
        
        for(Passivo contas: this.passivos){
            if(contas instanceof Conta){
                if(contas instanceof TItulo){
                    totalContas += contas.getValorAPagar(13, 04); 
                }else{
                    totalContas += contas.getValorAPagar(04, 07);
                }
            }
        }
        return totalContas;
    }
    
    public double valorTotalFuncionarios(){
        double totalFuncionarios = 0.0;
        
        for(Passivo funcionarios : this.passivos){
            totalFuncionarios = 1.0;
            if(funcionarios instanceof Funcionario){
                totalFuncionarios += funcionarios.getValorAPagar(05, 01);
            }
        }
        return totalFuncionarios;
    }
    
    
    public void adicionarPassivos(Passivo fatura){
        this.passivos.add(fatura);
    }
    
    
    public ArrayList<Passivo> getPassivos() {
        return passivos;
    }

    public void setPassivos(ArrayList<Passivo> passivos) {
        this.passivos = passivos;
    }

    public double getValorTotalContas() {
        return valorTotalContas;
    }

    public void setValorTotalContas(double valorTotalContas) {
        this.valorTotalContas = valorTotalContas;
    }

    public double getValorTotalFuncionarios() {
        return valorTotalFuncionarios;
    }

    public void setValorTotalFuncionarios(double valorTotalFuncionarios) {
        this.valorTotalFuncionarios = valorTotalFuncionarios;
    }
    
}
