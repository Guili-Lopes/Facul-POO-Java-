package principal;

public class GuilhermeLopes {

    public static void main(String[] args) {
        DelegacaoOlimpica delegacao = new DelegacaoOlimpica();
        
        Modalidade futebol = new Modalidade("futebol", 5);
        Modalidade volei = new Modalidade("volei", 3);
        Modalidade basquete = new Modalidade("basquete", 2);
        
        MembroComite atletaFut1 = new Atleta(futebol, "Arana", "M" ,23);
        try{
            delegacao.adicionarMembro(atletaFut1);
        }
        catch (ModalidadeLotadaException e){
            System.err.println(e.getMessage());
        }
        
        MembroComite atletaFut2 = new Atleta(futebol, "Hulk", "M" ,37);
        try{
            delegacao.adicionarMembro(atletaFut2);
        }
        catch (ModalidadeLotadaException e){
            System.err.println(e.getMessage());
        }
        
        MembroComite atletaFut3 = new Atleta(futebol, "Marta", "F" ,35);
        try{
            delegacao.adicionarMembro(atletaFut3);
        }
        catch (ModalidadeLotadaException e){
            System.err.println(e.getMessage());
        }
        
        MembroComite atletaVol1 = new Atleta(volei, "Lucareli", "M" ,27);
        try{
            delegacao.adicionarMembro(atletaVol1);
        }
        catch (ModalidadeLotadaException e){
            System.err.println(e.getMessage());
        }
        
        MembroComite atletaVol2 = new Atleta(volei, "Gabi", "F" ,29);
        try{
            delegacao.adicionarMembro(atletaVol2);
        }
        catch (ModalidadeLotadaException e){
            System.err.println(e.getMessage());
        }
        
        MembroComite atletaBask1 = new Atleta(basquete, "Lebron", "M" ,42);
        try{
            delegacao.adicionarMembro(atletaBask1);
        }
        catch (ModalidadeLotadaException e){
            System.err.println(e.getMessage());
        }
        
        MembroComite atletaBask2 = new Atleta(basquete, "Curry", "M" ,38);
        try{
            delegacao.adicionarMembro(atletaBask2);
        }
        catch (ModalidadeLotadaException e){
            System.err.println(e.getMessage());
        }
        
        MembroComite atletaBask3 = new Atleta(basquete, "Hortencia", "F" ,67);
        try{
            delegacao.adicionarMembro(atletaBask3);
        }
        catch (ModalidadeLotadaException e){
            System.out.println("Deu erro aq fiote");
            System.err.println(e.getMessage());
        }
        
        MembroComite medico1 = new Medico("Esportivo", "Luciana", "F", 42);
        try{
            delegacao.adicionarMembro(medico1);
        }
        catch (ModalidadeLotadaException e){
           System.err.println(e.getMessage());
        }
        
        MembroComite medico2 = new Medico("Nutricionista", "Guilherme", "M", 20);
        try{
            delegacao.adicionarMembro(medico2);
        }
        catch (ModalidadeLotadaException e){
            System.err.println(e.getMessage());
        }
        
        MembroComite tecnico1 = new Medico("Principal", "Milito", "M", 42);
        try{
            delegacao.adicionarMembro(tecnico1);
        }
        catch (ModalidadeLotadaException e){
            System.err.println(e.getMessage());
        }
        
        MembroComite tecnico2 = new Medico("Auxiliar", "Dorival", "M", 20);
        try{
            delegacao.adicionarMembro(tecnico2);
        }
        catch (ModalidadeLotadaException e){
            System.err.println(e.getMessage());
        }
        
    }
    
}
