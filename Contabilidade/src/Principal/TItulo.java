package principal;

public class TItulo extends Conta {

    public TItulo(){
    
    }
    
    public TItulo(int dia_vencimento, int mes_vencimento, double valor) {
        super(dia_vencimento, mes_vencimento, valor);
    }

    @Override
    public double getValorAPagar(int pagamento_dia, int pagamento_mes) {
        if((pagamento_mes > this.mes) || ((pagamento_dia > this.vencimento_dia) && (pagamento_mes >= this.mes))){
            return this.valor*1.1;
        }
        return this.valor;
    }
    
}
