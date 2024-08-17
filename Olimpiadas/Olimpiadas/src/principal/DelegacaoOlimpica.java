package principal;

import java.util.ArrayList;

public class DelegacaoOlimpica {
    private ArrayList<MembroComite> delegacao;

    public DelegacaoOlimpica() {
        this.delegacao = new ArrayList<>();
    }

    public DelegacaoOlimpica(ArrayList<MembroComite> delegacao) {
        this.delegacao = new ArrayList<>();
        this.delegacao = delegacao;
    }
    
    public void adicionarMembro(MembroComite membro) throws ModalidadeLotadaException{
        int contadorAtletas;
        
        if(membro instanceof Medico || membro instanceof Tecnico){
            delegacao.add(membro);
        }else if (membro instanceof Atleta){
            Modalidade esporte = new Modalidade(((Atleta)membro).getModalidade());
            contadorAtletas = 0;
            
            for(MembroComite comissao : delegacao){
                if(comissao instanceof Atleta){
                    if(esporte.getEsporte().equals( ((Atleta)comissao).getModalidade().getEsporte() )){
                        contadorAtletas++;
                    }  
                }
            }
            if(contadorAtletas >= esporte.getLimite_maximo()){
                        throw new ModalidadeLotadaException();
                    }
                    else{
                        delegacao.add(membro);
                    }
        }
    }

    public ArrayList<MembroComite> getDelegacao() {
        return delegacao;
    }

    public void setDelegacao(ArrayList<MembroComite> delegacao) {
        this.delegacao = delegacao;
    }
    
    
}
