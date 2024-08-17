package principal;


public class Medico extends MembroComite{
    private String especialidade;

    public Medico() {
    }

    public Medico(String area, String nome, String genero, int idade) {
        super(nome, genero, idade);
        this.especialidade = area;
    }
    
    @Override
    public void exibirMembro() {
        System.out.println(this.especialidade.toUpperCase() + "\nNome: " + this.nome + "\nGenero: " + this.genero +"\n Idade: " + this.idade);
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
}
