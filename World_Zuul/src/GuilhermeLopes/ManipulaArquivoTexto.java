package GuilhermeLopes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class ManipulaArquivoTexto {

    private static Formatter gravador;
    private static Scanner leitor;

    public static void abrirArquivoGravacao(String nomeArquivo) {
        try {
            gravador = new Formatter(nomeArquivo);
        } catch (FileNotFoundException e) {
            System.err.print("Nao consegui criar o arquivo para gravacao");
        }

    }

    public static void gravarArquivo(String comando) {

        gravador.format("%s\n", comando);
        
        }
    public static void fecharArquivo(){
        if (gravador != null){
            gravador.close();
        }
    }
    
    public static void abrirArquivoLeitura(String nomeArquivo){
        try{
        leitor = new Scanner(Paths.get(nomeArquivo));
        }catch(IOException e){
            System.err.println("Nao consegui abrir o arquivo para leitura");
        }
    }
    
    public static ArrayList<String> lerArquivo(){
        ArrayList<String> retorno = new ArrayList<>();
        while(leitor.hasNext()){
            String linha = leitor.nextLine();
            retorno.add(linha);
        }
        return retorno;
    }
    
    public static void fecharArquivoLeitura(){
        if (leitor != null)
                leitor.close();
    }
    }
    