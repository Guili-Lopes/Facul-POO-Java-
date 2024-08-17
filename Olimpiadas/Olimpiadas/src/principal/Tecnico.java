package principal;

public class Tecnico extends MembroComite {
    private String cargo;
    private Modalidade modalidade;

    public Tecnico() {
    }

    public Tecnico(Modalidade modalidade, String nome, String genero, int idade) {
        super(nome, genero, idade);
        this.modalidade = modalidade;
    }

    @Override
    public void exibirMembro() {
        System.out.println(this.cargo.toUpperCase() +"\nNome: " + this.nome + "\nCargo: " + this.cargo + "\nModalidade: " + modalidade.getEsporte() +"\nGenero: " + this.genero +"\n Idade: " + this.idade + "");
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
    
    
}
