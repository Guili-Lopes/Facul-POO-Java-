package Principal;

public class Venda {

    private Item[] cupomFiscal;
    private double precoTotal;
    private int posicao;

    public Venda() {
        this.cupomFiscal = new Item[15];
        this.posicao = 0;
        this.precoTotal = 0;
    }
    
    public boolean adicionarProduto(Item item) {
        if (posicao < cupomFiscal.length) {
            cupomFiscal[posicao++] = item;
            return true;
        }
        return false;
    }

    public double precoVenda() {

        for (int i = 0; i < cupomFiscal.length; i++) {
            if(cupomFiscal[i] != null)
                this.precoTotal += this.cupomFiscal[i].getPrecoTotal();
        }
        return precoTotal;
    }
    
    public Item[] getCupomFiscal() {
        return cupomFiscal;
    }

    public void setCupomFiscal(Item[] cupomFiscal) {
        this.cupomFiscal = cupomFiscal;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}
