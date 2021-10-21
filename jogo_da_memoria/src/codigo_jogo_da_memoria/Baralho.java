
package codigo_jogo_da_memoria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Baralho {
    
    ArrayList <Carta> cartas = new ArrayList();
     
    //Construtor
    
    public Baralho(){        
    }
    
    // Funções
    
    public int[] GerarBaralhoFacil(){
        ManipularArquivos arquivos = new ManipularArquivos();
        
        int[] array_facil = {0,0,0,0};
        
        try {                   
            arquivos.preencherCartas(cartas);                         
        } catch (IOException ex) {
            Logger.getLogger(Baralho.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Random rnd = ThreadLocalRandom.current();
        
        do{

            Carta carta1 = cartas.get(rnd.nextInt(cartas.size()));
            Carta carta2 = cartas.get(rnd.nextInt(cartas.size()));

            if(carta1.getNumero() != carta2.getNumero()){
                array_facil[0] = carta1.getNumero();
                array_facil[1] = carta1.getNumero();
                array_facil[2] = carta2.getNumero();
                array_facil[3] = carta2.getNumero();
            }

        }while(array_facil[3] == 0);

        shuffleArray(array_facil);
        
        return array_facil;
    }
    
    
    public int[] GerarBaralhoMedio(){
        
        ManipularArquivos arquivos = new ManipularArquivos();

        int[] array_medio = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int[] array_nums = {0,0,0,0,0,0,0,0};
        
        try {                   
            arquivos.preencherCartas(cartas);                         
        } catch (IOException ex) {
            Logger.getLogger(Baralho.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Random rnd = ThreadLocalRandom.current();
        
        int index = 0;
        
        while(index != 8){
            
            Carta pick = cartas.get(rnd.nextInt(cartas.size()));
            int repete = 0;
            
            for(int k = 0; k < array_nums.length; k++){
                if(pick.getNumero() == array_nums[k]){
                    repete = 1;
                    break;
                }
            }
            
            if(repete == 0){
                array_nums[index] = pick.getNumero();
                index ++;
            }
            
        }
        
        array_medio[0] = array_nums[0];
        array_medio[1] = array_nums[0];
        array_medio[2] = array_nums[1];
        array_medio[3] = array_nums[1];
        array_medio[4] = array_nums[2];
        array_medio[5] = array_nums[2];
        array_medio[6] = array_nums[3];
        array_medio[7] = array_nums[3];
        array_medio[8] = array_nums[4];
        array_medio[9] = array_nums[4];
        array_medio[10] = array_nums[5];
        array_medio[11] = array_nums[5];
        array_medio[12] = array_nums[6];
        array_medio[13] = array_nums[6];
        array_medio[14] = array_nums[7];
        array_medio[15] = array_nums[7];
     
        shuffleArray(array_medio);
        
        return array_medio;
    }
    
    
    public int[] GerarBaralhoDificil(){
        
        ManipularArquivos arquivos = new ManipularArquivos();

        int[] array_dificil = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int[] array_nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        
        try {                   
            arquivos.preencherCartas(cartas);                         
        } catch (IOException ex) {
            Logger.getLogger(Baralho.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Random rnd = ThreadLocalRandom.current();
        
        int index = 0;
        
        while(index != 18){
            
            Carta pick = cartas.get(rnd.nextInt(cartas.size()));
            int repete = 0;
            
            for(int k = 0; k < array_nums.length; k++){
                if(pick.getNumero() == array_nums[k]){
                    repete = 1;
                    break;
                }
            }
            
            if(repete == 0){
                array_nums[index] = pick.getNumero();
                index ++;
            }
            
        }
        
        array_dificil[0] = array_nums[0];
        array_dificil[1] = array_nums[0];
        array_dificil[2] = array_nums[1];
        array_dificil[3] = array_nums[1];
        array_dificil[4] = array_nums[2];
        array_dificil[5] = array_nums[2];
        array_dificil[6] = array_nums[3];
        array_dificil[7] = array_nums[3];
        array_dificil[8] = array_nums[4];
        array_dificil[9] = array_nums[4];
        array_dificil[10] = array_nums[5];
        array_dificil[11] = array_nums[5];
        array_dificil[12] = array_nums[6];
        array_dificil[13] = array_nums[6];
        array_dificil[14] = array_nums[7];
        array_dificil[15] = array_nums[7];
        array_dificil[16] = array_nums[8];
        array_dificil[17] = array_nums[8];
        array_dificil[18] = array_nums[9];
        array_dificil[19] = array_nums[9];
        array_dificil[20] = array_nums[10];
        array_dificil[21] = array_nums[10];
        array_dificil[22] = array_nums[11];
        array_dificil[23] = array_nums[11];
        array_dificil[24] = array_nums[12];
        array_dificil[25] = array_nums[12];
        array_dificil[26] = array_nums[13];
        array_dificil[27] = array_nums[13];
        array_dificil[28] = array_nums[14];
        array_dificil[29] = array_nums[14];
        array_dificil[30] = array_nums[15];
        array_dificil[31] = array_nums[15];
        array_dificil[32] = array_nums[16];
        array_dificil[33] = array_nums[16];
        array_dificil[34] = array_nums[17];
        array_dificil[35] = array_nums[17];
     
        shuffleArray(array_dificil);
        
        return array_dificil;
    }
    
    
    void shuffleArray(int[] ar){
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
          int index = rnd.nextInt(i + 1);
          // Simple swap
          int a = ar[index];
          ar[index] = ar[i];
          ar[i] = a;
        }
      }
}
