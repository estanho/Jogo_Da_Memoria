
package codigo_jogo_da_memoria;

import java.io.*;
import jogo_da_memoria.MenuPrincipal;

public class Aplicacao {
    public static void main(String[] args) throws IOException {
              
        ManipularArquivos arquivos = new ManipularArquivos();
        
        Thread criarArquivos = new Thread(arquivos);
        criarArquivos.start();
                        
        new MenuPrincipal().setVisible(true);
        
        
    }    
}

