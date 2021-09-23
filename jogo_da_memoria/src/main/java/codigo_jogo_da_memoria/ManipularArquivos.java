/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo_jogo_da_memoria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class ManipularArquivos implements Runnable {
    
    //Construtor
    public ManipularArquivos(){        
    }
    //Metodos
    public void criarArquivosIniciais() throws IOException{
        //Diretorio Base.
        File pastaDados = new File("Dados");
        boolean existePastaDados = pastaDados.exists();
        if (existePastaDados == false){   pastaDados.mkdir();  }
        
        //txt PlacarLideresFacil
        File txtPlacarLideresFacil = new File("Dados/PlacarLideresFacil.txt");
        boolean existePlacarLideresFacil = txtPlacarLideresFacil.exists();

        if (existePlacarLideresFacil == false){   
            txtPlacarLideresFacil.createNewFile();          
            FileWriter fw = new FileWriter(txtPlacarLideresFacil);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("- Placar de Lideres Facil:"); bw.newLine();
            bw.close();
            fw.close();
        }
        
        //txt PlacarLideresMedio
        File txtPlacarLideresMedio = new File("Dados/PlacarLideresMedio.txt");
        boolean existePlacarLideresMedio = txtPlacarLideresMedio.exists();

        if (existePlacarLideresMedio == false){   
            txtPlacarLideresMedio.createNewFile();          
            FileWriter fw = new FileWriter(txtPlacarLideresMedio);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("- Placar de Lideres Medio:"); bw.newLine();
            bw.close();
            fw.close();
        }
        
        //txt PlacarLideresDificil
        File txtPlacarLideresDificil = new File("Dados/PlacarLideresDificil.txt");
        boolean existePlacarLideresDificil = txtPlacarLideresDificil.exists();

        if (existePlacarLideresDificil == false){   
            txtPlacarLideresDificil.createNewFile();          
            FileWriter fw = new FileWriter(txtPlacarLideresDificil);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("- Placar de Lideres Dificil:"); bw.newLine();
            bw.close();
            fw.close();
        }
        
        //Diretorio Clientes.
        File pastaConfig = new File("Dados/Config");
        boolean existePastaConfig = pastaConfig.exists();
        
        if (existePastaConfig == false){    pastaConfig.mkdir();    }
        
    }
    
        
    public void salvarNovoJogador(String nome, Integer pontos, Integer rodadas, String dificuldade) throws IOException{       
        
        String placarLideresTxt = "Dados/PlacarLideres.txt";
                
        if("facil".equals(dificuldade)){
            placarLideresTxt = "Dados/PlacarLideresFacil.txt";               
        }else if("medio".equals(dificuldade)){
            placarLideresTxt = "Dados/PlacarLideresMedio.txt";
        }else if("dificil".equals(dificuldade)){
            placarLideresTxt = "Dados/PlacarLideresDificil.txt";
        }
            
        FileWriter fw = new FileWriter(placarLideresTxt,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("*,"+nome+","+pontos+","+rodadas+","+dificuldade+",");
        bw.newLine();
        bw.close();
        fw.close();
        
    }
    
   
    public void preencherPlacarLideres(ArrayList <Jogador> jogadoresFacil,
            ArrayList <Jogador> jogadoresMedio,
            ArrayList <Jogador> jogadoresDificil) throws FileNotFoundException, IOException{
        
        String enderecoFacil = "Dados/PlacarLideresFacil.txt";
        String enderecoMedio = "Dados/PlacarLideresMedio.txt";
        String enderecoDificil = "Dados/PlacarLideresDificil.txt";
        
        // Facil
        FileReader frF = new FileReader(enderecoFacil);
        BufferedReader brF = new BufferedReader( frF );
                                      
        while(brF.ready()){
            String linha = brF.readLine();
            if(linha.startsWith("*")){
                String[] dados = linha.split((","));
                Jogador jogador = new Jogador(dados[1],Integer.parseInt(dados[2]),Integer.parseInt(dados[3]),dados[4]);
                jogadoresFacil.add(jogador);
            }
        }
        frF.close(); brF.close();
        
        // Medio
        FileReader frM = new FileReader(enderecoMedio);
        BufferedReader brM = new BufferedReader( frM );
                                      
        while(brM.ready()){
            String linha = brM.readLine();
            if(linha.startsWith("*")){
                String[] dados = linha.split((","));
                Jogador jogador = new Jogador(dados[1],Integer.parseInt(dados[2]),Integer.parseInt(dados[3]),dados[4]);
                jogadoresMedio.add(jogador);
            }
        }
        frM.close(); brM.close();
        
        // Dificil
        FileReader frD = new FileReader(enderecoDificil);
        BufferedReader brD = new BufferedReader( frD );
                                      
        while(brD.ready()){
            String linha = brD.readLine();
            if(linha.startsWith("*")){
                String[] dados = linha.split((","));
                Jogador jogador = new Jogador(dados[1],Integer.parseInt(dados[2]),Integer.parseInt(dados[3]),dados[4]);
                jogadoresDificil.add(jogador);
            }
        }
        frD.close(); brD.close();
    }
    
    
    @Override
    public void run() {
        try {
            criarArquivosIniciais();
        } catch (IOException ex) {
            Logger.getLogger(ManipularArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
