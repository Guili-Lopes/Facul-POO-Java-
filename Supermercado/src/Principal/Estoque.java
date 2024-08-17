package Principal;

public class Estoque {

    private Item[] estante;
    private int posicao;

    public Estoque(int quantidade) {
        this.estante = new Item[quantidade];
        posicao = 0;
    }

    public Item buscarItem(int codigo) {
        Item aux = null;

        for (int i = 0; i < estante.length; i++) {
            if (estante[i].getItem().getCodigo() == codigo) {
                aux = estante[i];
                break;
            }
        }
        return aux;
    }

    public boolean retirarItem(int codigo, int quantidade) {
        Item itemRetirar = buscarItem(codigo);
        int aux = 0;

        if (itemRetirar.getQuantidade() - quantidade == 0) {
            for (int i = 0; i < estante.length; i++) {
                if (estante[i] == itemRetirar) {
                    estante[i] = null;
                    aux = i;
                    break;
                }
            }

            for (int i = aux; i < estante.length - 1; i++) {
                estante[i] = estante[i + 1];
            }

            posicao--;
            return true;
        } 
        else {
            if (itemRetirar.getQuantidade() - quantidade > 0) {
                for (int i = 0; i < estante.length; i++) {
                    if (estante[i] == itemRetirar) {
                        aux = i;
                        break;
                    }
                }
                estante[aux].setQuantidade(itemRetirar.getQuantidade() - quantidade);
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean adicionarItem(Item item) {
        if (posicao < estante.length) {
            estante[posicao++] = item;
            return true;
        }
        return false;
    }

    public Item[] getEstante() {
        return estante;
    }

    public void setEstante(Item[] estante) {
        this.estante = estante;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    
}
