package principal;

public class Atleta extends MembroComite{
    private Modalidade modalidade;

    public Atleta() {
    }

    public Atleta(Modalidade modalidade, String nome, String genero, int idade) {
        super(nome, genero, idade);
        this.modalidade = modalidade;
    }
    
    @Override
    public void exibirMembro() {
        System.out.println("ATLETA:\nNome: " + this.nome + "\nModalidade: " + modalidade.getEsporte() + "\nGenero: " + this.genero +"\n Idade: " + this.idade);
    }
    
    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
    
    
}
