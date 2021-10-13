
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

public class ManipularArquivos implements Runnable {
    
    //Construtor
    public ManipularArquivos(){        
    }
    
    // Funções
    
    public void criarArquivosIniciais() throws IOException{
        
        //Diretorio Base.
        File pastaDados = new File("Dados");
        boolean existePastaDados = pastaDados.exists();
        if (existePastaDados == false){   pastaDados.mkdir();  }
        
        //Diretorio Config.
        File pastaConfig = new File("Dados/Config");
        boolean existePastaConfig = pastaConfig.exists();
        if (existePastaConfig == false){   pastaConfig.mkdir();  }
        
        //txt config
        File txtConfig = new File("Dados/Config/Config.txt");
        boolean existeConfig = txtConfig.exists();

        if (existeConfig == false){   
            txtConfig.createNewFile();          
            FileWriter fw = new FileWriter(txtConfig);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("false");
            bw.close();
            fw.close();
        }
        
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

            bw.write("*;1;Hidrogenio;O Hidrogênio é o elemento químico de menor massa atômica e menor número atômico!;"); bw.newLine();
            bw.write("*;1;Hidrogenio;O hidrogênio molecular é mais leve que o ar e foi utilizado em dirigíveis rígidos pelo conde alemão Ferdinand von Zeppelin, daí o nome dos dirigíveis.;"); bw.newLine();

            bw.write("*;2;Helio;O Hélio é até sete vezes mais leve que o oxigênio que respiramos!;"); bw.newLine();
            bw.write("*;2;Helio;Você sabe de onde veio o nome hélio? Curiosamente, vem de 'Hélios', o deus grego do Sol.;"); bw.newLine();

            bw.write("*;3;Litio;O lítio é um metal alcalino . É branco prateado na forma pura e é tão macio que pode ser cortado com uma faca de manteiga.;"); bw.newLine();
            bw.write("*;3;Litio;O nome do lítio vem do grego Lithos, que significa pedra.;"); bw.newLine();

            bw.write("*;6;Carbono;Cerca de 20% do peso dos organismos vivos é referente ao carbono.;"); bw.newLine();
            bw.write("*;6;Carbono;O carbono é o 4° elemento mais abundante no Universo.;"); bw.newLine();

            bw.write("*;8;Oxigenio;Mesmo sendo fundamental para nossa existência, muito oxigênio pode ser um veneno!;"); bw.newLine();
            bw.write("*;8;Oxigenio;Os átomos de oxigênio (juntamente com outros elementos) excitados pelas radiações solares também são responsáveis pela geração das cores vistas nas auroras que acontecem nos polos.;"); bw.newLine();

            bw.write("*;11;Sodio;O sódio é um metal branco prateado pertencente ao Grupo 1 da Tabela Periódica, que é o grupo dos metais alcalinos.;"); bw.newLine();
            bw.write("*;11;Sodio;O sódio é um elemento abundante. É encontrado no sol e em muitas outras estrelas.;"); bw.newLine();

            bw.write("*;12;Magnesio;Magnésio é o metal mais leve da tabela periódica.;"); bw.newLine();
            bw.write("*;12;Magnesio;O nome é originário de Magnésia, que em grego designava uma região da Tessália na Grécia.;"); bw.newLine();

            bw.write("*;14;Silicio;O silício é o segundo elemento mais abundante na crosta terrestre (27,7%), ficando atrás somente do oxigênio.;"); bw.newLine();
            bw.write("*;14;Silicio;O silício está presente em praticamente toda areia, rocha, barro e solo.;"); bw.newLine();

            bw.write("*;15;Fosforo;Alguns textos referem-se ao fósforo como o 'Elemento do Diabo' por causa de seu brilho assustador, tendência a explodir em chamas e por ser o 13º elemento conhecido.;"); bw.newLine();
            bw.write("*;15;Fosforo;De acordo com um estudo publicado no Proceedings of the National Academies of Sciences, o fósforo pode ter sido trazido à Terra por meteoritos.;"); bw.newLine();

            bw.write("*;16;Enxofre;O enxofre é um elemento essencial para a vida. É encontrado em aminoácidos e proteínas.;"); bw.newLine();
            bw.write("*;16;Enxofre;O enxofre é criado como parte do processo alfa em estrelas massivas.;"); bw.newLine();

            bw.write("*;17;Cloro;Se o Cloro fosse liberado do oceano, ele pesaria 5 vezes mais do que nossa atmosfera atual.;"); bw.newLine();
            bw.write("*;17;Cloro;O Cloro foi usado pelos alemães na Primeira Guerra Mundial em 1915 como arma química.;"); bw.newLine();

            bw.write("*;19;Potassio;Os compostos de potássio emitem uma cor de chama lilás ou violeta quando queimados.;"); bw.newLine();
            bw.write("*;19;Potassio;Um uso menos conhecido de potássio é como uma fonte de oxigênio portátil.O superóxido de potássio é um sólido laranja usado para liberar oxigênio e absorver o dióxido de carbono no sistema de respiração de submarinos, espaçonaves e minas.;"); bw.newLine();

            bw.write("*;20;Calcio;O cálcio é o quinto elemento mais abundante na crosta terrestre (3,6% em massa) e na crosta da Lua se faz presente na porcentagem de 8%.;"); bw.newLine();
            bw.write("*;20;Calcio;O cálcio é componente de várias ligas de alumínio, cobre e chumbo, e é usado como agente redutor na preparação de metais como o tório, o urânio e o zircônio.;"); bw.newLine();

            bw.write("*;26;Ferro;O ferro é um elemento conhecido em sua forma pura há pelo menos 5.000 anos.;"); bw.newLine();
            bw.write("*;26;Ferro;Do ferro se faz o aço, a liga metálica mais utilizada no planeta. Sendo a principal substância metálica produzida no Brasil, tendo uma participação superior a 70% no valor total de produção de metais.;"); bw.newLine();

            bw.write("*;30;Zinco;O zinco forma várias ligas importantes . O primeiro deles é o latão , uma liga de cobre e zinco.;"); bw.newLine();
            bw.write("*;30;Zinco;Quase todo o zinco extraído (95%) vem do minério de sulfeto de zinco. O zinco é facilmente reciclado e cerca de 30% do zinco produzido anualmente é metal reciclado.;"); bw.newLine();

            bw.write("*;31;Galio;O gálio (Ga) é o elemento químico de número atômico 31, possui um baixo ponto de fusão (29,76ºC) entre os metais, derretendo nas mãos, além de ser muito usado em semicondutores.;"); bw.newLine();
            bw.write("*;31;Galio;O elemento químico gálio é usado na fabricação de espelhos.;"); bw.newLine();

            bw.write("*;50;Estanho;O estanho é 15 vezes mais caro que o bronze, e ao misturá-lo com certas substâncias essa mistura pode gerar o cobre.;"); bw.newLine();
            bw.write("*;50;Estanho;Sozinho, o estanho é um metal extremamente macio, por isso que sempre misturam metais com ele.;"); bw.newLine();

            bw.write("*;79;Ouro;O ouro é tão difícil de ser encontrado que os especialistas calculam que existam apenas cinco quilos do metal para cada 1 milhão de toneladas de terra.;"); bw.newLine();
            bw.write("*;79;Ouro;O ouro é o único metal que não oxida.;"); bw.newLine();
            bw.close();
            fw.close();
        }
        
        //txt Cartas
        File txtCartas = new File("Dados/Cartas.txt");
        boolean existeCartas = txtCartas.exists();

        if (existeCartas == false){   
            txtCartas.createNewFile();          
            FileWriter fw = new FileWriter(txtCartas);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("- Cartas:"); bw.newLine();
            
            bw.write("*;1;Hidrogenio;"); bw.newLine();
            bw.write("*;2;Helio;"); bw.newLine();
            bw.write("*;3;Litio;"); bw.newLine();
            bw.write("*;6;Carbono;"); bw.newLine();
            bw.write("*;8;Oxigenio;"); bw.newLine();
            bw.write("*;11;Sodio;"); bw.newLine();
            bw.write("*;12;Magnesio;"); bw.newLine();
            bw.write("*;14;Silicio;"); bw.newLine();
            bw.write("*;15;Fosforo;"); bw.newLine();
            bw.write("*;16;Enxofre;"); bw.newLine();
            bw.write("*;17;Cloro;"); bw.newLine();
            bw.write("*;19;Potassio;"); bw.newLine();
            bw.write("*;20;Calcio;"); bw.newLine();
            bw.write("*;26;Ferro;"); bw.newLine();
            bw.write("*;30;Zinco;"); bw.newLine();
            bw.write("*;31;Galio;"); bw.newLine();
            bw.write("*;50;Estanho;"); bw.newLine();
            bw.write("*;79;Ouro;"); bw.newLine();

            bw.close();
            fw.close();
        }
        
        
        //txt TodosElementos
        File txtTodosElementos = new File("Dados/TodosElementos.txt");
        boolean existeTodosElementos = txtTodosElementos.exists();

        if (existeTodosElementos == false){   
            txtTodosElementos.createNewFile();          
            FileWriter fw = new FileWriter(txtTodosElementos);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("- Elementos:"); bw.newLine();
            bw.write("*;1;Hidrogenio;"); bw.newLine();
            bw.write("*;2;Helio;"); bw.newLine();
            bw.write("*;3;Litio;"); bw.newLine();
            bw.write("*;4;Berilio;"); bw.newLine();
            bw.write("*;5;Boro;"); bw.newLine();
            bw.write("*;6;Carbono;"); bw.newLine();
            bw.write("*;7;Nitrogenio;"); bw.newLine();
            bw.write("*;8;Oxigenio;"); bw.newLine();
            bw.write("*;9;Fluor;"); bw.newLine();
            bw.write("*;10;Neonio;"); bw.newLine();
            bw.write("*;11;Sodio;"); bw.newLine();
            bw.write("*;12;Magnesio;"); bw.newLine();
            bw.write("*;13;Aluminio;"); bw.newLine();
            bw.write("*;14;Silicio;"); bw.newLine();
            bw.write("*;15;Fosforo;"); bw.newLine();
            bw.write("*;16;Enxofre;"); bw.newLine();
            bw.write("*;17;Cloro;"); bw.newLine();
            bw.write("*;18;Argonio;"); bw.newLine();
            bw.write("*;19;Potassio;"); bw.newLine();
            bw.write("*;20;Calcio;"); bw.newLine();
            bw.write("*;21;Escandio;"); bw.newLine();
            bw.write("*;22;Titanio;"); bw.newLine();
            bw.write("*;23;Vanadio;"); bw.newLine();
            bw.write("*;24;Cromo;"); bw.newLine();
            bw.write("*;25;Manganes;"); bw.newLine();
            bw.write("*;26;Ferro;"); bw.newLine();
            bw.write("*;27;Cobalto;"); bw.newLine();
            bw.write("*;28;Niquel;"); bw.newLine();
            bw.write("*;29;Cobre;"); bw.newLine();
            bw.write("*;30;Zinco;"); bw.newLine();
            bw.write("*;31;Galio;"); bw.newLine();
            bw.write("*;32;Germanio;"); bw.newLine();
            bw.write("*;33;Arsenio;"); bw.newLine();
            bw.write("*;34;Selenio;"); bw.newLine();
            bw.write("*;35;Bromo;"); bw.newLine();
            bw.write("*;36;Criptonio;"); bw.newLine();
            bw.write("*;37;Rubidio;"); bw.newLine();
            bw.write("*;38;Estroncio;"); bw.newLine();
            bw.write("*;39;Itrio;"); bw.newLine();
            bw.write("*;40;Zirconio;"); bw.newLine();
            bw.write("*;41;Niobio;"); bw.newLine();
            bw.write("*;42;Molibdenio;"); bw.newLine();
            bw.write("*;43;Tecnecio;"); bw.newLine();
            bw.write("*;44;Rutenio;"); bw.newLine();
            bw.write("*;45;Rodio;"); bw.newLine();
            bw.write("*;46;Paladio;"); bw.newLine();
            bw.write("*;47;Prata;"); bw.newLine();
            bw.write("*;48;Cadmio;"); bw.newLine();
            bw.write("*;49;Indio;"); bw.newLine();
            bw.write("*;50;Estanho;"); bw.newLine();
            bw.write("*;51;Antimonio;"); bw.newLine();
            bw.write("*;52;Telurio;"); bw.newLine();
            bw.write("*;53;Iodo;"); bw.newLine();
            bw.write("*;54;Xenonio;"); bw.newLine();
            bw.write("*;55;Cesio;"); bw.newLine();
            bw.write("*;56;Bario;"); bw.newLine();
            bw.write("*;57;Lantanio;"); bw.newLine();
            bw.write("*;58;Cerio;"); bw.newLine();
            bw.write("*;59;Praseodimio;"); bw.newLine();
            bw.write("*;60;Neodimio;"); bw.newLine();
            bw.write("*;61;Promecio;"); bw.newLine();
            bw.write("*;62;Samario;"); bw.newLine();
            bw.write("*;63;Europio;"); bw.newLine();
            bw.write("*;64;Gadolinio;"); bw.newLine();
            bw.write("*;65;Terbio;"); bw.newLine();
            bw.write("*;66;Disprosio;"); bw.newLine();
            bw.write("*;67;Holmio;"); bw.newLine();
            bw.write("*;68;Erbio;"); bw.newLine();
            bw.write("*;69;Tulio;"); bw.newLine();
            bw.write("*;70;Iterbio;"); bw.newLine();
            bw.write("*;71;Lutecio;"); bw.newLine();
            bw.write("*;72;Hafnio;"); bw.newLine();
            bw.write("*;73;Tantalo;"); bw.newLine();
            bw.write("*;74;Tungstenio;"); bw.newLine();
            bw.write("*;75;Renio;"); bw.newLine();
            bw.write("*;76;Osmio;"); bw.newLine();
            bw.write("*;77;Iridio;"); bw.newLine();
            bw.write("*;78;Platina;"); bw.newLine();
            bw.write("*;79;Ouro;"); bw.newLine();
            bw.write("*;80;Mercurio;"); bw.newLine();
            bw.write("*;81;Talio;"); bw.newLine();
            bw.write("*;82;Chumbo;"); bw.newLine();
            bw.write("*;83;Bismuto;"); bw.newLine();
            bw.write("*;84;Polonio;"); bw.newLine();
            bw.write("*;85;Astato;"); bw.newLine();
            bw.write("*;86;Radonio;"); bw.newLine();
            bw.write("*;87;Francio;"); bw.newLine();
            bw.write("*;88;Radio;"); bw.newLine();
            bw.write("*;89;Actinio;"); bw.newLine();
            bw.write("*;90;Torio;"); bw.newLine();
            bw.write("*;91;Protactinio;"); bw.newLine();
            bw.write("*;92;Uranio;"); bw.newLine();
            bw.write("*;93;Neptunio;"); bw.newLine();
            bw.write("*;94;Plutonio;"); bw.newLine();
            bw.write("*;95;Americio;"); bw.newLine();
            bw.write("*;96;Curio;"); bw.newLine();
            bw.write("*;97;Berquelio;"); bw.newLine();
            bw.write("*;98;Californio;"); bw.newLine();
            bw.write("*;99;Einstenio;"); bw.newLine();
            bw.write("*;100;Fermio;"); bw.newLine();
            bw.write("*;101;Mendelevio;"); bw.newLine();
            bw.write("*;102;Nobelio;"); bw.newLine();
            bw.write("*;103;Laurencio;"); bw.newLine();
            bw.write("*;104;Rutherfordio;"); bw.newLine();
            bw.write("*;105;Dubnio;"); bw.newLine();
            bw.write("*;106;Seaborgio;"); bw.newLine();
            bw.write("*;107;Bohrio;"); bw.newLine();
            bw.write("*;108;Hassio;"); bw.newLine();
            bw.write("*;109;Meitnerio;"); bw.newLine();
            bw.write("*;110;Darmstacio;"); bw.newLine();
            bw.write("*;111;Roentgenio;"); bw.newLine();
            bw.write("*;112;Copernicio;"); bw.newLine();
            bw.write("*;113;Niponio;"); bw.newLine();
            bw.write("*;114;Flerovio;"); bw.newLine();
            bw.write("*;115;Moscovio;"); bw.newLine();
            bw.write("*;116;Livermorio;"); bw.newLine();
            bw.write("*;117;Tenesso;"); bw.newLine();
            bw.write("*;118;Oganesson;");

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
    
    public void salvarNovaCuriosidades( int numero, String elemento, String curiosidade) throws IOException{       
        
        String curiosidadesTxt = "Dados/Curiosidades.txt";
                           
        FileWriter fw = new FileWriter(curiosidadesTxt,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("*;"+numero+";"+elemento+";"+curiosidade+";");
        bw.newLine();
        bw.close();
        fw.close();
        
    }
    
    
    public void salvarNovaCarta( int numero, String elemento, String curiosidade) throws IOException{       
        
        String curiosidadesTxt = "Dados/Cartas.txt";
                
            
        FileWriter fw = new FileWriter(curiosidadesTxt,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("*;"+numero+";"+elemento+";");
        bw.newLine();
        bw.close();
        fw.close();
        
        salvarNovaCuriosidades(numero,elemento,curiosidade);
        
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
                Curiosidade curiosidade = new Curiosidade (Integer.parseInt(dados[1]),dados[2],dados[3]);
                curiosidades.add(curiosidade);
            }
        }
        fr.close(); br.close();

    }
    
    public void preencherCartas(ArrayList <Carta> cartas) throws FileNotFoundException, IOException{
        
        String cartasTxt = "Dados/Cartas.txt";
        
        FileReader fr = new FileReader(cartasTxt);
        BufferedReader br = new BufferedReader( fr );
                                      
        while(br.ready()){
            String linha = br.readLine();
            if(linha.startsWith("*")){
                String[] dados = linha.split((";"));
                Carta carta = new Carta (Integer.parseInt(dados[1]),dados[2]);
                cartas.add(carta);
            }
        }
        fr.close(); br.close();
        
    }
    
    public void preencherTodasCartas(ArrayList <Carta> cartas) throws FileNotFoundException, IOException{
        
        String cartasTxt = "Dados/TodosElementos.txt";
        
        FileReader fr = new FileReader(cartasTxt);
        BufferedReader br = new BufferedReader( fr );
                                      
        while(br.ready()){
            String linha = br.readLine();
            if(linha.startsWith("*")){
                String[] dados = linha.split((";"));
                Carta carta = new Carta (Integer.parseInt(dados[1]),dados[2]);
                cartas.add(carta);
            }
        }
        fr.close(); br.close();
        
    }
    
        
    public void editarCuriosidade(ArrayList <Curiosidade> curiosidades) throws FileNotFoundException, IOException{
        
        String curiosidadesTxt = "Dados/Curiosidades.txt";
        
        FileWriter fw = new FileWriter(curiosidadesTxt,false); // False
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i=0;i<curiosidades.size();i++){
            bw.write("*;"+curiosidades.get(i).getNumero()+";"+curiosidades.get(i).getElemento()+";"+curiosidades.get(i).getCuriosidade()+";");
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
            bw.write("*;"+curiosidades.get(i).getNumero()+";"+curiosidades.get(i).getElemento()+";"+curiosidades.get(i).getCuriosidade()+";");
            bw.newLine();
        }

        bw.close();
        fw.close();

    }
    
    
    public void excluirCarta(ArrayList <Carta> cartas) throws FileNotFoundException, IOException{
        
        String curiosidadesTxt = "Dados/Cartas.txt";
        
        FileWriter fw = new FileWriter(curiosidadesTxt,false); // False
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int i=0;i<cartas.size();i++){
            bw.write("*;"+cartas.get(i).getNumero()+";"+cartas.get(i).getElemento()+";");
            bw.newLine();
        }

        bw.close();
        fw.close();

    }
    
    
    public boolean getConfigMostrarCartas() throws FileNotFoundException, IOException{
        
        String configTxt = "Dados/Config/Config.txt";
        
        FileReader fr = new FileReader(configTxt);
        BufferedReader br = new BufferedReader( fr );
                                      
        String linha = br.readLine();
        
        fr.close(); br.close();
        
        System.out.println(linha);
        
        if(Boolean.valueOf(linha) == true){
            return true;
        }else{
            return false;
        }    
    }
    
    
    public void setConfigMostrarCartas(boolean config) throws FileNotFoundException, IOException{
        
        String configTxt = "Dados/Config/Config.txt";
        
        FileWriter fw = new FileWriter(configTxt,false);
        BufferedWriter bw = new BufferedWriter(fw);
        if(config == true){
            bw.write("true");
        }else{
            bw.write("false");
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
