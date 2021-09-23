/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo_jogo_da_memoria;

/**
 *
 * @author Estanho
 */

import java.io.*;
import java.util.*;
import jogo_da_memoria.MenuPrincipal;

public class Aplicacao {
    public static void main(String[] args) throws IOException {
              
        ManipularArquivos arquivos = new ManipularArquivos();
        
        Thread criarArquivos = new Thread(arquivos);
        criarArquivos.start();
                  
        new MenuPrincipal().setVisible(true);
    }
}

