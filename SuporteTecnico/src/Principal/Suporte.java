package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Suporte {
    private HashMap<String, String> resolucao;
    private ArrayList<String> padrao;
    
    public Suporte(){
        this.padrao = new ArrayList<String>();
        padrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?\n");
        padrao.add("Nenhum outro cliente detalhou um problema parecido com este. \n Qual é a sua configuração de sistema?\n");
        padrao.add("Isso parece interessante. Diga-me mais a respeito...\n");
        padrao.add("Preciso de maiores informações a respeito.\n");
        padrao.add("Você já verificou se existe algum conflito de DLL?\n");
        padrao.add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?\n");
        padrao.add("Sua descrição não foi satisfatória. Você já procurou um técnico\n que poderia detalhar melhor este problema?\n");
        padrao.add("Isso não é um problema, é apenas uma característica do software!\n");
        padrao.add("Você poderia explicar melhor?");
        
        this.resolucao = new HashMap<String, String>();
        resolucao.put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade\n do seu processador deve resolver o problema de performance. Você tem algum\n problema com o software?\n");
        resolucao.put("performance", "A performance está próxima do esperado nos testes que realizamos. Você está\n executando algum outro processo em paralelo?\n");
        resolucao.put("bug", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?\n");
        resolucao.put("buggy", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?\n");
        resolucao.put("windows", "Este é um problema do sistema operacional Windows. Por favor, \n entre em contato com a Microsoft. Não há nada que possamos fazer neste caso.\n");
        resolucao.put("macintosh", "Este é um problema do sistema operacional Mac. Por favor, \n entre em contato com a Apple. Não há nada que possamos fazer neste caso.\n");
        resolucao.put("caro", "O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado\n e comparou todas as características do nosso software com outras ofertas de mercado?\n");
        resolucao.put("instalacao","A instalação é simples e direta. Nós temos programas de instalação previamente configurados\n que farão todo o trabalho para você. Você já leu as instruções\n de instalação?\n");
        resolucao.put("memoria", "Se você observar detalhadamente os requisitos mínimos de sistema, você verá que\n a memória requerida é 1.5 giga byte. Você deverá adquirir\n mais memória. Mais alguma coisa que deseja saber?\n");
        resolucao.put("linux", "Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas.\n Muitos deles dizem respeito a versões incompatíveis. Você poderia ser\n mais preciso?\n");
        resolucao.put("danificaram", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.\n");
        resolucao.put("danificou",  "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.\n");
    }

    public HashMap<String, String> getResolucao() {
        return resolucao;
    }

    public void setResolucao(HashMap<String, String> resolucao) {
        this.resolucao = resolucao;
    }

    public String RespostaSolucao(String problema){
        Interpretadora palavraChave = new Interpretadora(problema);
        
        for(Map.Entry<String, String> i : resolucao.entrySet()){
            for(String j : palavraChave.palavraSolucao()){
                if(i.getKey().equals(j)){
                    return i.getValue(); 
                }
            }
        }
        
        return RespostaPadrao();
    }
    
    public String RespostaPadrao(){
        Random random = new Random();
        int num = random.nextInt(padrao.size());
        
        return this.padrao.get(num);
        
    }
    
}