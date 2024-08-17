package Principal;

public class Item {

    private Produto produto;
    private int quantidade;
    private double precoTotal;

    public Item() {
    }

    public Item(Produto item, int quantidade) {
        this.produto = item;
        this.quantidade = quantidade;
    }

    public Produto getItem() {
        return produto;
    }

    public void setItem(Produto item) {
        this.produto = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoTotal() {
        this.precoTotal = produto.getPreco() * this.quantidade;
        return precoTotal;
    }

}
