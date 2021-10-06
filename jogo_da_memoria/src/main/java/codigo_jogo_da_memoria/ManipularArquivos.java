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
        
        //txt Curiosidades
        File txtCuriosidades = new File("Dados/Curiosidades.txt");
        boolean existeCuriosidades = txtCuriosidades.exists();

        if (existeCuriosidades == false){   
            txtCuriosidades.createNewFile();          
            FileWriter fw = new FileWriter(txtCuriosidades);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("- Curiosidade:"); bw.newLine();

            bw.write("*;Hidrogenio;O Hidrogênio é o elemento químico de menor massa atômica e menor número atômico!;"); bw.newLine();
            bw.write("*;Hidrogenio;O hidrogênio molecular é mais leve que o ar e foi utilizado em dirigíveis rígidos pelo conde alemão Ferdinand von Zeppelin, daí o nome dos dirigíveis.;"); bw.newLine();

            bw.write("*;Helio;O Hélio é até sete vezes mais leve que o oxigênio que respiramos!;"); bw.newLine();
            bw.write("*;Helio;Você sabe de onde veio o nome hélio? Curiosamente, vem de 'Hélios', o deus grego do Sol.;"); bw.newLine();

            bw.write("*;Litio;O lítio é um metal alcalino . É branco prateado na forma pura e é tão macio que pode ser cortado com uma faca de manteiga.;"); bw.newLine();
            bw.write("*;Litio;O nome do lítio vem do grego Lithos, que significa pedra.;"); bw.newLine();

            bw.write("*;Carbono;Cerca de 20% do peso dos organismos vivos é referente ao carbono.;"); bw.newLine();
            bw.write("*;Carbono;O carbono é o 4° elemento mais abundante no Universo.;"); bw.newLine();

            bw.write("*;Oxigenio;Mesmo sendo fundamental para nossa existência, muito oxigênio pode ser um veneno!;"); bw.newLine();
            bw.write("*;Oxigenio;Os átomos de oxigênio (juntamente com outros elementos) excitados pelas radiações solares também são responsáveis pela geração das cores vistas nas auroras que acontecem nos polos.;"); bw.newLine();

            bw.write("*;Sodio;O sódio é um metal branco prateado pertencente ao Grupo 1 da Tabela Periódica, que é o grupo dos metais alcalinos.;"); bw.newLine();
            bw.write("*;Sodio;O sódio é um elemento abundante. É encontrado no sol e em muitas outras estrelas.;"); bw.newLine();

            bw.write("*;Magnesio;Magnésio é o metal mais leve da tabela periódica.;"); bw.newLine();
            bw.write("*;Magnesio;O nome é originário de Magnésia, que em grego designava uma região da Tessália na Grécia.;"); bw.newLine();

            bw.write("*;Silicio;O silício é o segundo elemento mais abundante na crosta terrestre (27,7%), ficando atrás somente do oxigênio.;"); bw.newLine();
            bw.write("*;Silicio;O silício está presente em praticamente toda areia, rocha, barro e solo.;"); bw.newLine();

            bw.write("*;Fosforo;Alguns textos referem-se ao fósforo como o 'Elemento do Diabo' por causa de seu brilho assustador, tendência a explodir em chamas e por ser o 13º elemento conhecido.;"); bw.newLine();
            bw.write("*;Fosforo;De acordo com um estudo publicado no Proceedings of the National Academies of Sciences, o fósforo pode ter sido trazido à Terra por meteoritos.;"); bw.newLine();

            bw.write("*;Enxofre;O enxofre é um elemento essencial para a vida. É encontrado em aminoácidos e proteínas.;"); bw.newLine();
            bw.write("*;Enxofre;O enxofre é criado como parte do processo alfa em estrelas massivas.;"); bw.newLine();

            bw.write("*;Cloro;Se o Cloro fosse liberado do oceano, ele pesaria 5 vezes mais do que nossa atmosfera atual.;"); bw.newLine();
            bw.write("*;Cloro;O Cloro foi usado pelos alemães na Primeira Guerra Mundial em 1915 como arma química.;"); bw.newLine();

            bw.write("*;Potassio;Os compostos de potássio emitem uma cor de chama lilás ou violeta quando queimados.;"); bw.newLine();
            bw.write("*;Potassio;Um uso menos conhecido de potássio é como uma fonte de oxigênio portátil.O superóxido de potássio é um sólido laranja usado para liberar oxigênio e absorver o dióxido de carbono no sistema de respiração de submarinos, espaçonaves e minas.;"); bw.newLine();

            bw.write("*;Calcio;O cálcio é o quinto elemento mais abundante na crosta terrestre (3,6% em massa) e na crosta da Lua se faz presente na porcentagem de 8%.;"); bw.newLine();
            bw.write("*;Calcio;O cálcio é componente de várias ligas de alumínio, cobre e chumbo, e é usado como agente redutor na preparação de metais como o tório, o urânio e o zircônio.;"); bw.newLine();

            bw.write("*;Ferro;O ferro é um elemento conhecido em sua forma pura há pelo menos 5.000 anos.;"); bw.newLine();
            bw.write("*;Ferro;Do ferro se faz o aço, a liga metálica mais utilizada no planeta. Sendo a principal substância metálica produzida no Brasil, tendo uma participação superior a 70% no valor total de produção de metais.;"); bw.newLine();

            bw.write("*;Zinco;O zinco forma várias ligas importantes . O primeiro deles é o latão , uma liga de cobre e zinco.;"); bw.newLine();
            bw.write("*;Zinco;Quase todo o zinco extraído (95%) vem do minério de sulfeto de zinco. O zinco é facilmente reciclado e cerca de 30% do zinco produzido anualmente é metal reciclado.;"); bw.newLine();

            bw.write("*;Galio;O gálio (Ga) é o elemento químico de número atômico 31, possui um baixo ponto de fusão (29,76ºC) entre os metais, derretendo nas mãos, além de ser muito usado em semicondutores.;"); bw.newLine();
            bw.write("*;Galio;O elemento químico gálio é usado na fabricação de espelhos.;"); bw.newLine();

            bw.write("*;Estanho;O estanho é 15 vezes mais caro que o bronze, e ao misturá-lo com certas substâncias essa mistura pode gerar o cobre.;"); bw.newLine();
            bw.write("*;Estanho;Sozinho, o estanho é um metal extremamente macio, por isso que sempre misturam metais com ele.;"); bw.newLine();

            bw.write("*;Ouro;O ouro é tão difícil de ser encontrado que os especialistas calculam que existam apenas cinco quilos do metal para cada 1 milhão de toneladas de terra.;"); bw.newLine();
            bw.write("*;Ouro;O ouro é o único metal que não oxida.;"); bw.newLine();
            bw.close();
            fw.close();
        }       
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
    
    public void salvarNovaCuriosidades( String nome, String curiosidade) throws IOException{       
        
        String curiosidadesTxt = "Dados/Curiosidades.txt";
                
            
        FileWriter fw = new FileWriter(curiosidadesTxt,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("*;"+nome+";"+curiosidade+";");
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
    
    public void preencherCuriosidades(ArrayList <Curiosidade> curiosidades) throws FileNotFoundException, IOException{
        
        String curiosidadesTxt = "Dados/Curiosidades.txt";
        
        FileReader fr = new FileReader(curiosidadesTxt);
        BufferedReader br = new BufferedReader( fr );
                                      
        while(br.ready()){
            String linha = br.readLine();
            if(linha.startsWith("*")){
                String[] dados = linha.split((";"));
                Curiosidade curiosidade = new Curiosidade (dados[1],dados[2]);
                curiosidades.add(curiosidade);
            }
        }
        fr.close(); br.close();

    }
    
    public void editarCuriosidade(ArrayList <Curiosidade> curiosidades) throws FileNotFoundException, IOException{
        
        String curiosidadesTxt = "Dados/Curiosidades.txt";
        
        FileWriter fw = new FileWriter(curiosidadesTxt,false); // False
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i=0;i<curiosidades.size();i++){
            bw.write("*;"+curiosidades.get(i).getNome()+";"+curiosidades.get(i).getCuriosidade()+";");
            bw.newLine();
        }

        bw.close();
        fw.close();

    }
    
    public void excluirCuriosidade(ArrayList <Curiosidade> curiosidades) throws FileNotFoundException, IOException{
        
        String curiosidadesTxt = "Dados/Curiosidades.txt";
        
        FileWriter fw = new FileWriter(curiosidadesTxt,false); // False
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i=0;i<curiosidades.size();i++){
            bw.write("*;"+curiosidades.get(i).getNome()+";"+curiosidades.get(i).getCuriosidade()+";");
            bw.newLine();
        }

        bw.close();
        fw.close();

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
