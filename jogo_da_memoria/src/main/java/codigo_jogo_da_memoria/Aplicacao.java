/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo_jogo_da_memoria;

/**
 *
 *
 */

import static java.awt.SystemColor.text;
import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import jogo_da_memoria.MenuPrincipal;
import jogo_da_memoria.LayoutDificil;

public class Aplicacao {
    public static void main(String[] args) throws IOException {
              
        ManipularArquivos arquivos = new ManipularArquivos();
        
        Thread criarArquivos = new Thread(arquivos);
        criarArquivos.start();
                  
        new MenuPrincipal().setVisible(true);
    }
}

