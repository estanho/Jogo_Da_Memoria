
package jogo_da_memoria;

import codigo_jogo_da_memoria.AudioClip;
import codigo_jogo_da_memoria.Baralho;
import codigo_jogo_da_memoria.ControleSons;
import codigo_jogo_da_memoria.ManipularArquivos;
import java.awt.Color;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LayoutDificil extends javax.swing.JFrame {
    
    int CartasSelecionadas = 0;
    String Path = "";
    String C1Icon = "";
    String C2Icon = "";
    String SegundaSelecionada = "";
    String PrimeiraSelecionada = "";
    JPanel SegundaSelecionadaObj;
    JPanel PrimeiraSelecionadaObj;
    JLabel PrimeiraSelecionadaLabel;
    JLabel SegundaSelecionadaLabel;
    
    int[] array_dificil = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    int pontosTotal = 0;
    int pontosRodadaAtual = 0;
    
    int controlePontosRodada = 40;
    int controlePares = 0;
    int rodada = 1;
    
    boolean controleConfig = false;
    
    Timer timer = new Timer();
    int tempo = 90;
    
    AudioClip clip;
    AudioClip clipClick;
    AudioClip clipAcertou;
    AudioClip clipNovaRodada;
    AudioClip clipFim;
  
    // Construtor
    
    public LayoutDificil() {
        initComponents();
        
        ImageIcon img = new ImageIcon("icones/icone_janela.png");
        
        setIconImage(img.getImage());
        
        setSize(718, 795);
        setLocationRelativeTo(null); 
        
        this.DefinirCartas();
        this.tempo_jogo();
        
        clip = new AudioClip("sfx/click.wav");
        clipClick = new AudioClip("sfx/button_hover.wav");
        clipAcertou = new AudioClip("sfx/acertou.wav");
        clipNovaRodada = new AudioClip("sfx/rodadaconcluida.wav");
        clipFim = new AudioClip("sfx/gameover.wav");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_MenuPrincipal = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        texto_pontos = new javax.swing.JLabel();
        texto_tempo_restante = new javax.swing.JLabel();
        contador_tempo = new javax.swing.JLabel();
        contador_pontos = new javax.swing.JLabel();
        texto_pares = new javax.swing.JLabel();
        contador_pares = new javax.swing.JLabel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        botao_pause = new javax.swing.JPanel();
        icone_botao_pause = new javax.swing.JLabel();
        carta_1 = new javax.swing.JPanel();
        label_carta_1 = new javax.swing.JLabel();
        carta_2 = new javax.swing.JPanel();
        label_carta_2 = new javax.swing.JLabel();
        carta_3 = new javax.swing.JPanel();
        label_carta_3 = new javax.swing.JLabel();
        carta_4 = new javax.swing.JPanel();
        label_carta_4 = new javax.swing.JLabel();
        carta_5 = new javax.swing.JPanel();
        label_carta_5 = new javax.swing.JLabel();
        carta_6 = new javax.swing.JPanel();
        label_carta_6 = new javax.swing.JLabel();
        carta_7 = new javax.swing.JPanel();
        label_carta_7 = new javax.swing.JLabel();
        carta_8 = new javax.swing.JPanel();
        label_carta_8 = new javax.swing.JLabel();
        carta_9 = new javax.swing.JPanel();
        label_carta_9 = new javax.swing.JLabel();
        carta_10 = new javax.swing.JPanel();
        label_carta_10 = new javax.swing.JLabel();
        carta_11 = new javax.swing.JPanel();
        label_carta_11 = new javax.swing.JLabel();
        carta_12 = new javax.swing.JPanel();
        label_carta_12 = new javax.swing.JLabel();
        carta_13 = new javax.swing.JPanel();
        label_carta_13 = new javax.swing.JLabel();
        carta_14 = new javax.swing.JPanel();
        label_carta_14 = new javax.swing.JLabel();
        carta_15 = new javax.swing.JPanel();
        label_carta_15 = new javax.swing.JLabel();
        carta_16 = new javax.swing.JPanel();
        label_carta_16 = new javax.swing.JLabel();
        carta_17 = new javax.swing.JPanel();
        label_carta_17 = new javax.swing.JLabel();
        carta_18 = new javax.swing.JPanel();
        label_carta_18 = new javax.swing.JLabel();
        carta_19 = new javax.swing.JPanel();
        label_carta_19 = new javax.swing.JLabel();
        carta_20 = new javax.swing.JPanel();
        label_carta_20 = new javax.swing.JLabel();
        carta_21 = new javax.swing.JPanel();
        label_carta_21 = new javax.swing.JLabel();
        carta_22 = new javax.swing.JPanel();
        label_carta_22 = new javax.swing.JLabel();
        carta_23 = new javax.swing.JPanel();
        label_carta_23 = new javax.swing.JLabel();
        carta_24 = new javax.swing.JPanel();
        label_carta_24 = new javax.swing.JLabel();
        carta_25 = new javax.swing.JPanel();
        label_carta_25 = new javax.swing.JLabel();
        carta_26 = new javax.swing.JPanel();
        label_carta_26 = new javax.swing.JLabel();
        carta_27 = new javax.swing.JPanel();
        label_carta_27 = new javax.swing.JLabel();
        carta_28 = new javax.swing.JPanel();
        label_carta_28 = new javax.swing.JLabel();
        carta_29 = new javax.swing.JPanel();
        label_carta_29 = new javax.swing.JLabel();
        carta_30 = new javax.swing.JPanel();
        label_carta_30 = new javax.swing.JLabel();
        carta_31 = new javax.swing.JPanel();
        label_carta_31 = new javax.swing.JLabel();
        carta_32 = new javax.swing.JPanel();
        label_carta_32 = new javax.swing.JLabel();
        carta_33 = new javax.swing.JPanel();
        label_carta_33 = new javax.swing.JLabel();
        carta_34 = new javax.swing.JPanel();
        label_carta_34 = new javax.swing.JLabel();
        carta_35 = new javax.swing.JPanel();
        label_carta_35 = new javax.swing.JLabel();
        carta_36 = new javax.swing.JPanel();
        label_carta_36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel_MenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painel_MenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        barra_inferior.setBackground(new java.awt.Color(255, 255, 255));
        barra_inferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        texto_pontos.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        texto_pontos.setText("Pontos: ");

        texto_tempo_restante.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        texto_tempo_restante.setText("Tempo restante:");

        contador_tempo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        contador_tempo.setText("90");

        contador_pontos.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        contador_pontos.setText("0");

        texto_pares.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        texto_pares.setText("Pares:");

        contador_pares.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        contador_pares.setText("0");

        javax.swing.GroupLayout barra_inferiorLayout = new javax.swing.GroupLayout(barra_inferior);
        barra_inferior.setLayout(barra_inferiorLayout);
        barra_inferiorLayout.setHorizontalGroup(
            barra_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_inferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_pontos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contador_pontos)
                .addGap(33, 33, 33)
                .addComponent(texto_pares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contador_pares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_tempo_restante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contador_tempo)
                .addGap(15, 15, 15))
        );
        barra_inferiorLayout.setVerticalGroup(
            barra_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(texto_pontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_tempo_restante)
                .addComponent(contador_tempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contador_pontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_pares)
                .addComponent(contador_pares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barra_superior.setBackground(new java.awt.Color(255, 255, 255));
        barra_superior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        barra_superior.setToolTipText("");

        texto_barra_superior.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        texto_barra_superior.setText("Jogo da Memória");

        javax.swing.GroupLayout barra_superiorLayout = new javax.swing.GroupLayout(barra_superior);
        barra_superior.setLayout(barra_superiorLayout);
        barra_superiorLayout.setHorizontalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        barra_superiorLayout.setVerticalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto_barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
        );

        botao_pause.setBackground(new java.awt.Color(255, 255, 255));
        botao_pause.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botao_pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_pauseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_pauseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_pauseMouseExited(evt);
            }
        });

        icone_botao_pause.setIcon(new ImageIcon("icones/pause.png"));

        javax.swing.GroupLayout botao_pauseLayout = new javax.swing.GroupLayout(botao_pause);
        botao_pause.setLayout(botao_pauseLayout);
        botao_pauseLayout.setHorizontalGroup(
            botao_pauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_pauseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icone_botao_pause)
                .addContainerGap())
        );
        botao_pauseLayout.setVerticalGroup(
            botao_pauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_pauseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icone_botao_pause)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        carta_1.setBackground(new java.awt.Color(255, 255, 255));
        carta_1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_1Layout = new javax.swing.GroupLayout(carta_1);
        carta_1.setLayout(carta_1Layout);
        carta_1Layout.setHorizontalGroup(
            carta_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_1Layout.setVerticalGroup(
            carta_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_2.setBackground(new java.awt.Color(255, 255, 255));
        carta_2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_2Layout = new javax.swing.GroupLayout(carta_2);
        carta_2.setLayout(carta_2Layout);
        carta_2Layout.setHorizontalGroup(
            carta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_2Layout.setVerticalGroup(
            carta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_3.setBackground(new java.awt.Color(255, 255, 255));
        carta_3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_3Layout = new javax.swing.GroupLayout(carta_3);
        carta_3.setLayout(carta_3Layout);
        carta_3Layout.setHorizontalGroup(
            carta_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_3Layout.setVerticalGroup(
            carta_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_4.setBackground(new java.awt.Color(255, 255, 255));
        carta_4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_4MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_4Layout = new javax.swing.GroupLayout(carta_4);
        carta_4.setLayout(carta_4Layout);
        carta_4Layout.setHorizontalGroup(
            carta_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_4Layout.setVerticalGroup(
            carta_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_5.setBackground(new java.awt.Color(255, 255, 255));
        carta_5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_5MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_5Layout = new javax.swing.GroupLayout(carta_5);
        carta_5.setLayout(carta_5Layout);
        carta_5Layout.setHorizontalGroup(
            carta_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_5Layout.setVerticalGroup(
            carta_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_6.setBackground(new java.awt.Color(255, 255, 255));
        carta_6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_6MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_6Layout = new javax.swing.GroupLayout(carta_6);
        carta_6.setLayout(carta_6Layout);
        carta_6Layout.setHorizontalGroup(
            carta_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_6Layout.setVerticalGroup(
            carta_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_7.setBackground(new java.awt.Color(255, 255, 255));
        carta_7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_7MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_7Layout = new javax.swing.GroupLayout(carta_7);
        carta_7.setLayout(carta_7Layout);
        carta_7Layout.setHorizontalGroup(
            carta_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_7Layout.setVerticalGroup(
            carta_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_8.setBackground(new java.awt.Color(255, 255, 255));
        carta_8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_8MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_8Layout = new javax.swing.GroupLayout(carta_8);
        carta_8.setLayout(carta_8Layout);
        carta_8Layout.setHorizontalGroup(
            carta_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_8Layout.setVerticalGroup(
            carta_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_9.setBackground(new java.awt.Color(255, 255, 255));
        carta_9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_9MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_9Layout = new javax.swing.GroupLayout(carta_9);
        carta_9.setLayout(carta_9Layout);
        carta_9Layout.setHorizontalGroup(
            carta_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_9Layout.setVerticalGroup(
            carta_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_10.setBackground(new java.awt.Color(255, 255, 255));
        carta_10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_10MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_10Layout = new javax.swing.GroupLayout(carta_10);
        carta_10.setLayout(carta_10Layout);
        carta_10Layout.setHorizontalGroup(
            carta_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_10Layout.setVerticalGroup(
            carta_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_11.setBackground(new java.awt.Color(255, 255, 255));
        carta_11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_11MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_11Layout = new javax.swing.GroupLayout(carta_11);
        carta_11.setLayout(carta_11Layout);
        carta_11Layout.setHorizontalGroup(
            carta_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_11Layout.setVerticalGroup(
            carta_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_12.setBackground(new java.awt.Color(255, 255, 255));
        carta_12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_12MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_12Layout = new javax.swing.GroupLayout(carta_12);
        carta_12.setLayout(carta_12Layout);
        carta_12Layout.setHorizontalGroup(
            carta_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_12Layout.setVerticalGroup(
            carta_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_13.setBackground(new java.awt.Color(255, 255, 255));
        carta_13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_13MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_13Layout = new javax.swing.GroupLayout(carta_13);
        carta_13.setLayout(carta_13Layout);
        carta_13Layout.setHorizontalGroup(
            carta_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_13Layout.setVerticalGroup(
            carta_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_14.setBackground(new java.awt.Color(255, 255, 255));
        carta_14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_14MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_14Layout = new javax.swing.GroupLayout(carta_14);
        carta_14.setLayout(carta_14Layout);
        carta_14Layout.setHorizontalGroup(
            carta_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_14Layout.setVerticalGroup(
            carta_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_15.setBackground(new java.awt.Color(255, 255, 255));
        carta_15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_15MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_15MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_15Layout = new javax.swing.GroupLayout(carta_15);
        carta_15.setLayout(carta_15Layout);
        carta_15Layout.setHorizontalGroup(
            carta_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_15Layout.setVerticalGroup(
            carta_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_16.setBackground(new java.awt.Color(255, 255, 255));
        carta_16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_16MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_16MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_16Layout = new javax.swing.GroupLayout(carta_16);
        carta_16.setLayout(carta_16Layout);
        carta_16Layout.setHorizontalGroup(
            carta_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_16Layout.setVerticalGroup(
            carta_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_17.setBackground(new java.awt.Color(255, 255, 255));
        carta_17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_17MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_17MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_17Layout = new javax.swing.GroupLayout(carta_17);
        carta_17.setLayout(carta_17Layout);
        carta_17Layout.setHorizontalGroup(
            carta_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_17Layout.setVerticalGroup(
            carta_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_18.setBackground(new java.awt.Color(255, 255, 255));
        carta_18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_18MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_18MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_18Layout = new javax.swing.GroupLayout(carta_18);
        carta_18.setLayout(carta_18Layout);
        carta_18Layout.setHorizontalGroup(
            carta_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_18Layout.setVerticalGroup(
            carta_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_19.setBackground(new java.awt.Color(255, 255, 255));
        carta_19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_19MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_19MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_19Layout = new javax.swing.GroupLayout(carta_19);
        carta_19.setLayout(carta_19Layout);
        carta_19Layout.setHorizontalGroup(
            carta_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_19Layout.setVerticalGroup(
            carta_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_20.setBackground(new java.awt.Color(255, 255, 255));
        carta_20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_20MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_20MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_20Layout = new javax.swing.GroupLayout(carta_20);
        carta_20.setLayout(carta_20Layout);
        carta_20Layout.setHorizontalGroup(
            carta_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_20Layout.setVerticalGroup(
            carta_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_21.setBackground(new java.awt.Color(255, 255, 255));
        carta_21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_21MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_21Layout = new javax.swing.GroupLayout(carta_21);
        carta_21.setLayout(carta_21Layout);
        carta_21Layout.setHorizontalGroup(
            carta_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_21Layout.setVerticalGroup(
            carta_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_22.setBackground(new java.awt.Color(255, 255, 255));
        carta_22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_22MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_22MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_22Layout = new javax.swing.GroupLayout(carta_22);
        carta_22.setLayout(carta_22Layout);
        carta_22Layout.setHorizontalGroup(
            carta_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_22Layout.setVerticalGroup(
            carta_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_23.setBackground(new java.awt.Color(255, 255, 255));
        carta_23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_23MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_23MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_23Layout = new javax.swing.GroupLayout(carta_23);
        carta_23.setLayout(carta_23Layout);
        carta_23Layout.setHorizontalGroup(
            carta_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_23Layout.setVerticalGroup(
            carta_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_24.setBackground(new java.awt.Color(255, 255, 255));
        carta_24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_24MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_24MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_24Layout = new javax.swing.GroupLayout(carta_24);
        carta_24.setLayout(carta_24Layout);
        carta_24Layout.setHorizontalGroup(
            carta_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_24Layout.setVerticalGroup(
            carta_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_25.setBackground(new java.awt.Color(255, 255, 255));
        carta_25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_25MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_25MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_25Layout = new javax.swing.GroupLayout(carta_25);
        carta_25.setLayout(carta_25Layout);
        carta_25Layout.setHorizontalGroup(
            carta_25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_25Layout.setVerticalGroup(
            carta_25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_26.setBackground(new java.awt.Color(255, 255, 255));
        carta_26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_26MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_26MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_26Layout = new javax.swing.GroupLayout(carta_26);
        carta_26.setLayout(carta_26Layout);
        carta_26Layout.setHorizontalGroup(
            carta_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_26Layout.setVerticalGroup(
            carta_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_27.setBackground(new java.awt.Color(255, 255, 255));
        carta_27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_27MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_27MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_27Layout = new javax.swing.GroupLayout(carta_27);
        carta_27.setLayout(carta_27Layout);
        carta_27Layout.setHorizontalGroup(
            carta_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_27Layout.setVerticalGroup(
            carta_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_28.setBackground(new java.awt.Color(255, 255, 255));
        carta_28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_28MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_28MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_28Layout = new javax.swing.GroupLayout(carta_28);
        carta_28.setLayout(carta_28Layout);
        carta_28Layout.setHorizontalGroup(
            carta_28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_28Layout.setVerticalGroup(
            carta_28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_29.setBackground(new java.awt.Color(255, 255, 255));
        carta_29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_29MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_29MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_29Layout = new javax.swing.GroupLayout(carta_29);
        carta_29.setLayout(carta_29Layout);
        carta_29Layout.setHorizontalGroup(
            carta_29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_29Layout.setVerticalGroup(
            carta_29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_30.setBackground(new java.awt.Color(255, 255, 255));
        carta_30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_30MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_30MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_30Layout = new javax.swing.GroupLayout(carta_30);
        carta_30.setLayout(carta_30Layout);
        carta_30Layout.setHorizontalGroup(
            carta_30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_30Layout.setVerticalGroup(
            carta_30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_31.setBackground(new java.awt.Color(255, 255, 255));
        carta_31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_31MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_31MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_31Layout = new javax.swing.GroupLayout(carta_31);
        carta_31.setLayout(carta_31Layout);
        carta_31Layout.setHorizontalGroup(
            carta_31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_31Layout.setVerticalGroup(
            carta_31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_32.setBackground(new java.awt.Color(255, 255, 255));
        carta_32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_32MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_32MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_32Layout = new javax.swing.GroupLayout(carta_32);
        carta_32.setLayout(carta_32Layout);
        carta_32Layout.setHorizontalGroup(
            carta_32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_32Layout.setVerticalGroup(
            carta_32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_33.setBackground(new java.awt.Color(255, 255, 255));
        carta_33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_33MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_33MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_33Layout = new javax.swing.GroupLayout(carta_33);
        carta_33.setLayout(carta_33Layout);
        carta_33Layout.setHorizontalGroup(
            carta_33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_33Layout.setVerticalGroup(
            carta_33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_34.setBackground(new java.awt.Color(255, 255, 255));
        carta_34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_34MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_34MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_34Layout = new javax.swing.GroupLayout(carta_34);
        carta_34.setLayout(carta_34Layout);
        carta_34Layout.setHorizontalGroup(
            carta_34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_34Layout.setVerticalGroup(
            carta_34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_35.setBackground(new java.awt.Color(255, 255, 255));
        carta_35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_35MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_35MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_35Layout = new javax.swing.GroupLayout(carta_35);
        carta_35.setLayout(carta_35Layout);
        carta_35Layout.setHorizontalGroup(
            carta_35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_35Layout.setVerticalGroup(
            carta_35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        carta_36.setBackground(new java.awt.Color(255, 255, 255));
        carta_36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        carta_36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carta_36MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carta_36MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout carta_36Layout = new javax.swing.GroupLayout(carta_36);
        carta_36.setLayout(carta_36Layout);
        carta_36Layout.setHorizontalGroup(
            carta_36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        carta_36Layout.setVerticalGroup(
            carta_36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_carta_36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painel_MenuPrincipalLayout = new javax.swing.GroupLayout(painel_MenuPrincipal);
        painel_MenuPrincipal.setLayout(painel_MenuPrincipalLayout);
        painel_MenuPrincipalLayout.setHorizontalGroup(
            painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_pause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(barra_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addComponent(barra_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painel_MenuPrincipalLayout.setVerticalGroup(
            painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(carta_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                            .addComponent(carta_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_MenuPrincipalLayout.createSequentialGroup()
                            .addComponent(carta_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                            .addComponent(carta_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_MenuPrincipalLayout.createSequentialGroup()
                            .addComponent(carta_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(carta_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(carta_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_pause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void botao_pauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_pauseMouseClicked
        
        ControleSons.playSound(clip,0.5);
        
        timer.cancel();
        
        MenuPause pause = new MenuPause(new javax.swing.JFrame(),true, null, null, this);        
        pause.setVisible(true);
    }//GEN-LAST:event_botao_pauseMouseClicked

    private void botao_pauseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_pauseMouseEntered
        botao_pause.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_pauseMouseEntered

    private void botao_pauseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_pauseMouseExited
        botao_pause.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_pauseMouseExited

    private void carta_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_1MousePressed
        ControleSons.playSound(clipClick,1);
        carta_1.setName("carta_1");
        label_carta_1.setIcon(new ImageIcon("icones/"+array_dificil[0]+".png"));
    }//GEN-LAST:event_carta_1MousePressed

    private void carta_1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_1MouseReleased
        SelecionarCarta(carta_1,label_carta_1);
    }//GEN-LAST:event_carta_1MouseReleased

    private void carta_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_2MousePressed
        ControleSons.playSound(clipClick,1);
        carta_2.setName("carta_2");
        label_carta_2.setIcon(new ImageIcon("icones/"+array_dificil[1]+".png"));
    }//GEN-LAST:event_carta_2MousePressed

    private void carta_2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_2MouseReleased
        SelecionarCarta(carta_2,label_carta_2);
    }//GEN-LAST:event_carta_2MouseReleased

    private void carta_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_3MousePressed
        ControleSons.playSound(clipClick,1);
        carta_3.setName("carta_3");
        label_carta_3.setIcon(new ImageIcon("icones/"+array_dificil[2]+".png"));
    }//GEN-LAST:event_carta_3MousePressed

    private void carta_3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_3MouseReleased
        SelecionarCarta(carta_3,label_carta_3);
    }//GEN-LAST:event_carta_3MouseReleased

    private void carta_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_4MousePressed
        ControleSons.playSound(clipClick,1);
        carta_4.setName("carta_4");
        label_carta_4.setIcon(new ImageIcon("icones/"+array_dificil[3]+".png"));
    }//GEN-LAST:event_carta_4MousePressed

    private void carta_4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_4MouseReleased
        SelecionarCarta(carta_4,label_carta_4);
    }//GEN-LAST:event_carta_4MouseReleased

    private void carta_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_5MousePressed
        ControleSons.playSound(clipClick,1);
        carta_5.setName("carta_5");
        label_carta_5.setIcon(new ImageIcon("icones/"+array_dificil[4]+".png"));
    }//GEN-LAST:event_carta_5MousePressed

    private void carta_5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_5MouseReleased
        SelecionarCarta(carta_5,label_carta_5);
    }//GEN-LAST:event_carta_5MouseReleased

    private void carta_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_6MousePressed
        ControleSons.playSound(clipClick,1);
        carta_6.setName("carta_6");
        label_carta_6.setIcon(new ImageIcon("icones/"+array_dificil[5]+".png"));
    }//GEN-LAST:event_carta_6MousePressed

    private void carta_6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_6MouseReleased
        SelecionarCarta(carta_6,label_carta_6);
    }//GEN-LAST:event_carta_6MouseReleased

    private void carta_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_7MousePressed
        ControleSons.playSound(clipClick,1);
        carta_7.setName("carta_7");
        label_carta_7.setIcon(new ImageIcon("icones/"+array_dificil[6]+".png"));
    }//GEN-LAST:event_carta_7MousePressed

    private void carta_7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_7MouseReleased
        SelecionarCarta(carta_7,label_carta_7);
    }//GEN-LAST:event_carta_7MouseReleased

    private void carta_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_8MousePressed
        ControleSons.playSound(clipClick,1);
        carta_8.setName("carta_8");
        label_carta_8.setIcon(new ImageIcon("icones/"+array_dificil[7]+".png"));
    }//GEN-LAST:event_carta_8MousePressed

    private void carta_8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_8MouseReleased
        SelecionarCarta(carta_8,label_carta_8);
    }//GEN-LAST:event_carta_8MouseReleased

    private void carta_9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_9MousePressed
        ControleSons.playSound(clipClick,1);
        carta_9.setName("carta_9");
        label_carta_9.setIcon(new ImageIcon("icones/"+array_dificil[8]+".png"));
    }//GEN-LAST:event_carta_9MousePressed

    private void carta_9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_9MouseReleased
        SelecionarCarta(carta_9,label_carta_9);
    }//GEN-LAST:event_carta_9MouseReleased

    private void carta_10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_10MousePressed
        ControleSons.playSound(clipClick,1);
        carta_10.setName("carta_10");
        label_carta_10.setIcon(new ImageIcon("icones/"+array_dificil[9]+".png"));
    }//GEN-LAST:event_carta_10MousePressed

    private void carta_10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_10MouseReleased
        SelecionarCarta(carta_10,label_carta_10);
    }//GEN-LAST:event_carta_10MouseReleased

    private void carta_11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_11MousePressed
        ControleSons.playSound(clipClick,1);
        carta_11.setName("carta_11");
        label_carta_11.setIcon(new ImageIcon("icones/"+array_dificil[10]+".png"));
    }//GEN-LAST:event_carta_11MousePressed

    private void carta_11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_11MouseReleased
        SelecionarCarta(carta_11,label_carta_11);
    }//GEN-LAST:event_carta_11MouseReleased

    private void carta_12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_12MousePressed
        ControleSons.playSound(clipClick,1);
        carta_12.setName("carta_12");
        label_carta_12.setIcon(new ImageIcon("icones/"+array_dificil[11]+".png"));
    }//GEN-LAST:event_carta_12MousePressed

    private void carta_12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_12MouseReleased
        SelecionarCarta(carta_12,label_carta_12);
    }//GEN-LAST:event_carta_12MouseReleased

    private void carta_13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_13MousePressed
        ControleSons.playSound(clipClick,1);
        carta_13.setName("carta_13");
        label_carta_13.setIcon(new ImageIcon("icones/"+array_dificil[12]+".png"));
    }//GEN-LAST:event_carta_13MousePressed

    private void carta_13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_13MouseReleased
        SelecionarCarta(carta_13,label_carta_13);
    }//GEN-LAST:event_carta_13MouseReleased

    private void carta_14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_14MousePressed
        ControleSons.playSound(clipClick,1);
        carta_14.setName("carta_14");
        label_carta_14.setIcon(new ImageIcon("icones/"+array_dificil[13]+".png"));
    }//GEN-LAST:event_carta_14MousePressed

    private void carta_14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_14MouseReleased
        SelecionarCarta(carta_14,label_carta_14);
    }//GEN-LAST:event_carta_14MouseReleased

    private void carta_15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_15MousePressed
        ControleSons.playSound(clipClick,1);
        carta_15.setName("carta_15");
        label_carta_15.setIcon(new ImageIcon("icones/"+array_dificil[14]+".png"));
    }//GEN-LAST:event_carta_15MousePressed

    private void carta_15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_15MouseReleased
        SelecionarCarta(carta_15,label_carta_15);
    }//GEN-LAST:event_carta_15MouseReleased

    private void carta_16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_16MousePressed
        ControleSons.playSound(clipClick,1);
        carta_16.setName("carta_16");
        label_carta_16.setIcon(new ImageIcon("icones/"+array_dificil[15]+".png"));
    }//GEN-LAST:event_carta_16MousePressed

    private void carta_16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_16MouseReleased
        SelecionarCarta(carta_16,label_carta_16);
    }//GEN-LAST:event_carta_16MouseReleased

    private void carta_17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_17MousePressed
        ControleSons.playSound(clipClick,1);
        carta_17.setName("carta_17");
        label_carta_17.setIcon(new ImageIcon("icones/"+array_dificil[16]+".png"));
    }//GEN-LAST:event_carta_17MousePressed

    private void carta_17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_17MouseReleased
        SelecionarCarta(carta_17,label_carta_17);
    }//GEN-LAST:event_carta_17MouseReleased

    private void carta_18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_18MousePressed
        ControleSons.playSound(clipClick,1);
        carta_18.setName("carta_18");
        label_carta_18.setIcon(new ImageIcon("icones/"+array_dificil[17]+".png"));
    }//GEN-LAST:event_carta_18MousePressed

    private void carta_18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_18MouseReleased
        SelecionarCarta(carta_18,label_carta_18);
    }//GEN-LAST:event_carta_18MouseReleased

    private void carta_19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_19MousePressed
        ControleSons.playSound(clipClick,1);
        carta_19.setName("carta_19");
        label_carta_19.setIcon(new ImageIcon("icones/"+array_dificil[18]+".png"));
    }//GEN-LAST:event_carta_19MousePressed

    private void carta_19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_19MouseReleased
        SelecionarCarta(carta_19,label_carta_19);
    }//GEN-LAST:event_carta_19MouseReleased

    private void carta_20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_20MousePressed
        ControleSons.playSound(clipClick,1);
        carta_20.setName("carta_20");
        label_carta_20.setIcon(new ImageIcon("icones/"+array_dificil[19]+".png"));
    }//GEN-LAST:event_carta_20MousePressed

    private void carta_20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_20MouseReleased
        SelecionarCarta(carta_20,label_carta_20);
    }//GEN-LAST:event_carta_20MouseReleased

    private void carta_21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_21MousePressed
        ControleSons.playSound(clipClick,1);
        carta_21.setName("carta_21");
        label_carta_21.setIcon(new ImageIcon("icones/"+array_dificil[20]+".png"));
    }//GEN-LAST:event_carta_21MousePressed

    private void carta_21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_21MouseReleased
        SelecionarCarta(carta_21,label_carta_21);
    }//GEN-LAST:event_carta_21MouseReleased

    private void carta_22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_22MousePressed
        ControleSons.playSound(clipClick,1);
        carta_22.setName("carta_22");
        label_carta_22.setIcon(new ImageIcon("icones/"+array_dificil[21]+".png"));
    }//GEN-LAST:event_carta_22MousePressed

    private void carta_22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_22MouseReleased
        SelecionarCarta(carta_22,label_carta_22);
    }//GEN-LAST:event_carta_22MouseReleased

    private void carta_23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_23MousePressed
        ControleSons.playSound(clipClick,1);
        carta_23.setName("carta_23");
        label_carta_23.setIcon(new ImageIcon("icones/"+array_dificil[22]+".png"));
    }//GEN-LAST:event_carta_23MousePressed

    private void carta_23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_23MouseReleased
        SelecionarCarta(carta_23,label_carta_23);
    }//GEN-LAST:event_carta_23MouseReleased

    private void carta_24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_24MousePressed
        ControleSons.playSound(clipClick,1);
        carta_24.setName("carta_24");
        label_carta_24.setIcon(new ImageIcon("icones/"+array_dificil[23]+".png"));
    }//GEN-LAST:event_carta_24MousePressed

    private void carta_24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_24MouseReleased
        SelecionarCarta(carta_24,label_carta_24);
    }//GEN-LAST:event_carta_24MouseReleased

    private void carta_25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_25MousePressed
        ControleSons.playSound(clipClick,1);
        carta_25.setName("carta_25");
        label_carta_25.setIcon(new ImageIcon("icones/"+array_dificil[24]+".png"));
    }//GEN-LAST:event_carta_25MousePressed

    private void carta_25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_25MouseReleased
        SelecionarCarta(carta_25,label_carta_25);
    }//GEN-LAST:event_carta_25MouseReleased

    private void carta_26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_26MousePressed
        ControleSons.playSound(clipClick,1);
        carta_26.setName("carta_26");
        label_carta_26.setIcon(new ImageIcon("icones/"+array_dificil[25]+".png"));
    }//GEN-LAST:event_carta_26MousePressed

    private void carta_26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_26MouseReleased
        SelecionarCarta(carta_26,label_carta_26);
    }//GEN-LAST:event_carta_26MouseReleased

    private void carta_27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_27MousePressed
        ControleSons.playSound(clipClick,1);
        carta_27.setName("carta_27");
        label_carta_27.setIcon(new ImageIcon("icones/"+array_dificil[26]+".png"));
    }//GEN-LAST:event_carta_27MousePressed

    private void carta_27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_27MouseReleased
        SelecionarCarta(carta_27,label_carta_27);
    }//GEN-LAST:event_carta_27MouseReleased

    private void carta_28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_28MousePressed
        ControleSons.playSound(clipClick,1);
        carta_28.setName("carta_28");
        label_carta_28.setIcon(new ImageIcon("icones/"+array_dificil[27]+".png"));
    }//GEN-LAST:event_carta_28MousePressed

    private void carta_28MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_28MouseReleased
        SelecionarCarta(carta_28,label_carta_28);
    }//GEN-LAST:event_carta_28MouseReleased

    private void carta_29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_29MousePressed
        ControleSons.playSound(clipClick,1);
        carta_29.setName("carta_29");
        label_carta_29.setIcon(new ImageIcon("icones/"+array_dificil[28]+".png"));
    }//GEN-LAST:event_carta_29MousePressed

    private void carta_29MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_29MouseReleased
        SelecionarCarta(carta_29,label_carta_29);
    }//GEN-LAST:event_carta_29MouseReleased

    private void carta_30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_30MousePressed
        ControleSons.playSound(clipClick,1);
        carta_30.setName("carta_30");
        label_carta_30.setIcon(new ImageIcon("icones/"+array_dificil[29]+".png"));
    }//GEN-LAST:event_carta_30MousePressed

    private void carta_30MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_30MouseReleased
        SelecionarCarta(carta_30,label_carta_30);
    }//GEN-LAST:event_carta_30MouseReleased

    private void carta_31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_31MousePressed
        ControleSons.playSound(clipClick,1);
        carta_31.setName("carta_31");
        label_carta_31.setIcon(new ImageIcon("icones/"+array_dificil[30]+".png"));
    }//GEN-LAST:event_carta_31MousePressed

    private void carta_31MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_31MouseReleased
        SelecionarCarta(carta_31,label_carta_31);
    }//GEN-LAST:event_carta_31MouseReleased

    private void carta_32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_32MousePressed
        ControleSons.playSound(clipClick,1);
        carta_32.setName("carta_32");
        label_carta_32.setIcon(new ImageIcon("icones/"+array_dificil[31]+".png"));
    }//GEN-LAST:event_carta_32MousePressed

    private void carta_32MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_32MouseReleased
        SelecionarCarta(carta_32,label_carta_32);
    }//GEN-LAST:event_carta_32MouseReleased

    private void carta_33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_33MousePressed
        ControleSons.playSound(clipClick,1);
        carta_33.setName("carta_33");
        label_carta_33.setIcon(new ImageIcon("icones/"+array_dificil[32]+".png"));
    }//GEN-LAST:event_carta_33MousePressed

    private void carta_33MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_33MouseReleased
        SelecionarCarta(carta_33,label_carta_33);
    }//GEN-LAST:event_carta_33MouseReleased

    private void carta_34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_34MousePressed
        ControleSons.playSound(clipClick,1);
        carta_34.setName("carta_34");
        label_carta_34.setIcon(new ImageIcon("icones/"+array_dificil[33]+".png"));
    }//GEN-LAST:event_carta_34MousePressed

    private void carta_34MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_34MouseReleased
        SelecionarCarta(carta_34,label_carta_34);
    }//GEN-LAST:event_carta_34MouseReleased

    private void carta_35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_35MousePressed
        ControleSons.playSound(clipClick,1);
        carta_35.setName("carta_35");
        label_carta_35.setIcon(new ImageIcon("icones/"+array_dificil[34]+".png"));
    }//GEN-LAST:event_carta_35MousePressed

    private void carta_35MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_35MouseReleased
        SelecionarCarta(carta_35,label_carta_35);
    }//GEN-LAST:event_carta_35MouseReleased

    private void carta_36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_36MousePressed
        ControleSons.playSound(clipClick,1);
        carta_36.setName("carta_36");
        label_carta_36.setIcon(new ImageIcon("icones/"+array_dificil[35]+".png"));
    }//GEN-LAST:event_carta_36MousePressed

    private void carta_36MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_36MouseReleased
        SelecionarCarta(carta_36,label_carta_36);
    }//GEN-LAST:event_carta_36MouseReleased

    // Main
    
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutDificil().setVisible(true);
            }
        });
    }
    
    // Funções
    
    void DefinirCartas(){
        
        Baralho baralho = new Baralho();
             
        carta_1.setBackground(Color.WHITE);
        carta_2.setBackground(Color.WHITE);
        carta_3.setBackground(Color.WHITE);
        carta_4.setBackground(Color.WHITE);
        carta_5.setBackground(Color.WHITE);
        carta_6.setBackground(Color.WHITE);
        carta_7.setBackground(Color.WHITE);
        carta_8.setBackground(Color.WHITE);
        carta_9.setBackground(Color.WHITE);
        carta_10.setBackground(Color.WHITE);
        carta_11.setBackground(Color.WHITE);
        carta_12.setBackground(Color.WHITE);
        carta_13.setBackground(Color.WHITE);
        carta_14.setBackground(Color.WHITE);
        carta_15.setBackground(Color.WHITE);
        carta_16.setBackground(Color.WHITE);
        carta_17.setBackground(Color.WHITE);
        carta_18.setBackground(Color.WHITE);
        carta_19.setBackground(Color.WHITE);
        carta_20.setBackground(Color.WHITE);
        carta_21.setBackground(Color.WHITE);
        carta_22.setBackground(Color.WHITE);
        carta_23.setBackground(Color.WHITE);
        carta_24.setBackground(Color.WHITE);
        carta_25.setBackground(Color.WHITE);
        carta_26.setBackground(Color.WHITE);
        carta_27.setBackground(Color.WHITE);
        carta_28.setBackground(Color.WHITE);
        carta_29.setBackground(Color.WHITE);
        carta_30.setBackground(Color.WHITE);
        carta_31.setBackground(Color.WHITE);
        carta_32.setBackground(Color.WHITE);
        carta_33.setBackground(Color.WHITE);
        carta_34.setBackground(Color.WHITE);
        carta_35.setBackground(Color.WHITE);
        carta_36.setBackground(Color.WHITE);
                         
        array_dificil = baralho.GerarBaralhoDificil();
        
        espera();
    }
    
    public void tempo_jogo(){
        
        int delay = 1000;
        int interval = 1000;
        
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                                
                if(controleConfig == true && tempo == 90){
                    cartasPadroes();
                }
                
                if(controlePares == 18){
                    
                    timer.cancel();

                    proximaRodada();
                } else {
                    tempo --;
                }
                
                if(tempo > 0){
                    
                    contador_tempo.setText(valueOf(tempo));
                    
                }else{
                    
                    timer.cancel();
                    
                    dispose();
                    
                    fim();

                    JOptionPane.showMessageDialog(null,""
                                + "Fim de Jogo!\n","GAME OVER", JOptionPane.WARNING_MESSAGE);
                }
            }
        }, delay, interval);   
    }
    
    void proximaRodada(){
        
        this.controlePontosRodada += 150;
        this.pontosTotal += 150;
        this.tempo = 90;
        this.CartasSelecionadas = 0;
        this.controlePares = 0;
        this.rodada++;
        
        contador_pontos.setText(valueOf(pontosTotal));
        contador_pares.setText(valueOf(controlePares));
        
        ControleSons.playSound(clipNovaRodada,0.5);
        
        ProximaRodada proxima = new ProximaRodada(new javax.swing.JFrame(), true, null, null, this, pontosTotal, rodada);
        proxima.setVisible(true);        
    }
    
    void fim(){
        
        this.pontosTotal = pontosTotal + controlePares*20;
        
        ControleSons.playSound(clipFim,0.8);
        
        if(controlePares>0){
            InserirNomePlacar placar = new InserirNomePlacar(pontosTotal,rodada,"dificil");
            placar.setVisible(true);
        }else{
            new MenuPrincipal().setVisible(true);
        } 
    }
        
    void SelecionarCarta(JPanel carta,JLabel label){
        
        String cor_carta = carta.getBackground().toString();
        
        if(CartasSelecionadas == 0 && cor_carta.equals("java.awt.Color[r=255,g=255,b=255]")){
            
            Path = label.getIcon().toString();
            C1Icon = Path.substring(Path.lastIndexOf("/"  ) + 1);
            
            System.out.println("Carta 1 Selecionada!");
            carta.setBackground(Color.YELLOW);
            CartasSelecionadas ++;
            PrimeiraSelecionada = carta.getName();
            PrimeiraSelecionadaObj = carta;
            PrimeiraSelecionadaLabel = label;
            
        }else if(CartasSelecionadas == 1 && cor_carta.equals("java.awt.Color[r=255,g=255,b=255]")){
            
            SegundaSelecionada = carta.getName();
            SegundaSelecionadaObj = carta;
            
            if(!SegundaSelecionada.equals(PrimeiraSelecionada)){
                
                Path = label.getIcon().toString();
                C2Icon = Path.substring(Path.lastIndexOf("/"  ) + 1);
                SegundaSelecionadaLabel = label;

                System.out.println("Carta 2 Selecionada!");
                carta.setBackground(Color.YELLOW);
                
                CartasSelecionadas = 0;
                
                CompararCartas();
                
            }else{
                System.out.println("Não é possível selecionar a mesma carta!");
            }
                        
        }else{
            System.out.println("Você não pode selecionar esta carta!");
        }
    }
    
    void CompararCartas(){       
       
        if(C1Icon.equals(C2Icon)){
            System.out.println("Parabéns, você encontrou o par correto! + 10 Pontos");
            controlePares++;
            
            contador_pares.setText(valueOf(controlePares));
            PrimeiraSelecionadaObj.setBackground(Color.GREEN);
            SegundaSelecionadaObj.setBackground(Color.GREEN);
            
            exibirCuriosidade();
            
        }else{
            System.out.println("Beeeeeh! Par incorreto, tente novamente!");
            PrimeiraSelecionadaObj.setBackground(Color.WHITE);
            SegundaSelecionadaObj.setBackground(Color.WHITE);
            this.setEnabled(false);
            wait(500);
            this.setEnabled(true);
            PrimeiraSelecionadaLabel.setIcon(new ImageIcon("icones/carta.png"));
            SegundaSelecionadaLabel.setIcon(new ImageIcon("icones/carta.png"));
        }
    }
    
    public void exibirCuriosidade(){
        
        timer.cancel();
        
        ControleSons.playSound(clipAcertou,0.5);
        
        TelaCuriosidade telaCuriosidade = null;
        try {
            telaCuriosidade = new TelaCuriosidade(new javax.swing.JFrame(), true, null, null, this);
        } catch (IOException ex) {
            Logger.getLogger(LayoutMedio.class.getName()).log(Level.SEVERE, null, ex);
        }
        telaCuriosidade.setVisible(true);
    }

    public static void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    
    void espera(){
        ManipularArquivos arquivo = new ManipularArquivos();
        
        try {
            if(arquivo.getConfigMostrarCartas()){
                this.label_carta_1.setIcon(new ImageIcon("icones/"+array_dificil[0]+".png"));
                this.label_carta_2.setIcon(new ImageIcon("icones/"+array_dificil[1]+".png"));
                this.label_carta_3.setIcon(new ImageIcon("icones/"+array_dificil[2]+".png"));
                this.label_carta_4.setIcon(new ImageIcon("icones/"+array_dificil[3]+".png"));
                this.label_carta_5.setIcon(new ImageIcon("icones/"+array_dificil[4]+".png"));
                this.label_carta_6.setIcon(new ImageIcon("icones/"+array_dificil[5]+".png"));
                this.label_carta_7.setIcon(new ImageIcon("icones/"+array_dificil[6]+".png"));
                this.label_carta_8.setIcon(new ImageIcon("icones/"+array_dificil[7]+".png"));
                this.label_carta_9.setIcon(new ImageIcon("icones/"+array_dificil[8]+".png"));
                this.label_carta_10.setIcon(new ImageIcon("icones/"+array_dificil[9]+".png"));
                this.label_carta_11.setIcon(new ImageIcon("icones/"+array_dificil[10]+".png"));
                this.label_carta_12.setIcon(new ImageIcon("icones/"+array_dificil[11]+".png"));
                this.label_carta_13.setIcon(new ImageIcon("icones/"+array_dificil[12]+".png"));
                this.label_carta_14.setIcon(new ImageIcon("icones/"+array_dificil[13]+".png"));
                this.label_carta_15.setIcon(new ImageIcon("icones/"+array_dificil[14]+".png"));
                this.label_carta_16.setIcon(new ImageIcon("icones/"+array_dificil[15]+".png"));
                this.label_carta_17.setIcon(new ImageIcon("icones/"+array_dificil[16]+".png"));
                this.label_carta_18.setIcon(new ImageIcon("icones/"+array_dificil[17]+".png"));
                this.label_carta_19.setIcon(new ImageIcon("icones/"+array_dificil[18]+".png"));
                this.label_carta_20.setIcon(new ImageIcon("icones/"+array_dificil[19]+".png"));
                this.label_carta_21.setIcon(new ImageIcon("icones/"+array_dificil[20]+".png"));
                this.label_carta_22.setIcon(new ImageIcon("icones/"+array_dificil[21]+".png"));
                this.label_carta_23.setIcon(new ImageIcon("icones/"+array_dificil[22]+".png"));
                this.label_carta_24.setIcon(new ImageIcon("icones/"+array_dificil[23]+".png"));
                this.label_carta_25.setIcon(new ImageIcon("icones/"+array_dificil[24]+".png"));
                this.label_carta_26.setIcon(new ImageIcon("icones/"+array_dificil[25]+".png"));
                this.label_carta_27.setIcon(new ImageIcon("icones/"+array_dificil[26]+".png"));
                this.label_carta_28.setIcon(new ImageIcon("icones/"+array_dificil[27]+".png"));
                this.label_carta_29.setIcon(new ImageIcon("icones/"+array_dificil[28]+".png"));
                this.label_carta_30.setIcon(new ImageIcon("icones/"+array_dificil[29]+".png"));
                this.label_carta_31.setIcon(new ImageIcon("icones/"+array_dificil[30]+".png"));
                this.label_carta_32.setIcon(new ImageIcon("icones/"+array_dificil[31]+".png"));
                this.label_carta_33.setIcon(new ImageIcon("icones/"+array_dificil[32]+".png"));
                this.label_carta_34.setIcon(new ImageIcon("icones/"+array_dificil[33]+".png"));
                this.label_carta_35.setIcon(new ImageIcon("icones/"+array_dificil[34]+".png"));
                this.label_carta_36.setIcon(new ImageIcon("icones/"+array_dificil[35]+".png"));
                
                this.setEnabled(false);
                this.tempo = 94;
                this.controleConfig = true;
                
            }else{
                cartasPadroes();
            }
        } catch (IOException ex) {
            Logger.getLogger(LayoutDificil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    void cartasPadroes(){
        
        this.label_carta_1.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_2.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_3.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_4.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_5.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_6.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_7.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_8.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_9.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_10.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_11.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_12.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_13.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_14.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_15.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_16.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_17.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_18.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_19.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_20.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_21.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_22.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_23.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_24.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_25.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_26.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_27.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_28.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_29.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_30.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_31.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_32.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_33.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_34.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_35.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_36.setIcon(new ImageIcon("icones/carta.png"));

        this.setEnabled(true);
        this.tempo = 90;
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_inferior;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel botao_pause;
    private javax.swing.JPanel carta_1;
    private javax.swing.JPanel carta_10;
    private javax.swing.JPanel carta_11;
    private javax.swing.JPanel carta_12;
    private javax.swing.JPanel carta_13;
    private javax.swing.JPanel carta_14;
    private javax.swing.JPanel carta_15;
    private javax.swing.JPanel carta_16;
    private javax.swing.JPanel carta_17;
    private javax.swing.JPanel carta_18;
    private javax.swing.JPanel carta_19;
    private javax.swing.JPanel carta_2;
    private javax.swing.JPanel carta_20;
    private javax.swing.JPanel carta_21;
    private javax.swing.JPanel carta_22;
    private javax.swing.JPanel carta_23;
    private javax.swing.JPanel carta_24;
    private javax.swing.JPanel carta_25;
    private javax.swing.JPanel carta_26;
    private javax.swing.JPanel carta_27;
    private javax.swing.JPanel carta_28;
    private javax.swing.JPanel carta_29;
    private javax.swing.JPanel carta_3;
    private javax.swing.JPanel carta_30;
    private javax.swing.JPanel carta_31;
    private javax.swing.JPanel carta_32;
    private javax.swing.JPanel carta_33;
    private javax.swing.JPanel carta_34;
    private javax.swing.JPanel carta_35;
    private javax.swing.JPanel carta_36;
    private javax.swing.JPanel carta_4;
    private javax.swing.JPanel carta_5;
    private javax.swing.JPanel carta_6;
    private javax.swing.JPanel carta_7;
    private javax.swing.JPanel carta_8;
    private javax.swing.JPanel carta_9;
    private javax.swing.JLabel contador_pares;
    public static javax.swing.JLabel contador_pontos;
    private javax.swing.JLabel contador_tempo;
    private javax.swing.JLabel icone_botao_pause;
    public static javax.swing.JLabel label_carta_1;
    public static javax.swing.JLabel label_carta_10;
    public static javax.swing.JLabel label_carta_11;
    public static javax.swing.JLabel label_carta_12;
    public static javax.swing.JLabel label_carta_13;
    public static javax.swing.JLabel label_carta_14;
    public static javax.swing.JLabel label_carta_15;
    public static javax.swing.JLabel label_carta_16;
    public static javax.swing.JLabel label_carta_17;
    public static javax.swing.JLabel label_carta_18;
    public static javax.swing.JLabel label_carta_19;
    public static javax.swing.JLabel label_carta_2;
    public static javax.swing.JLabel label_carta_20;
    public static javax.swing.JLabel label_carta_21;
    public static javax.swing.JLabel label_carta_22;
    public static javax.swing.JLabel label_carta_23;
    public static javax.swing.JLabel label_carta_24;
    public static javax.swing.JLabel label_carta_25;
    public static javax.swing.JLabel label_carta_26;
    public static javax.swing.JLabel label_carta_27;
    public static javax.swing.JLabel label_carta_28;
    public static javax.swing.JLabel label_carta_29;
    public static javax.swing.JLabel label_carta_3;
    public static javax.swing.JLabel label_carta_30;
    public static javax.swing.JLabel label_carta_31;
    public static javax.swing.JLabel label_carta_32;
    public static javax.swing.JLabel label_carta_33;
    public static javax.swing.JLabel label_carta_34;
    public static javax.swing.JLabel label_carta_35;
    public static javax.swing.JLabel label_carta_36;
    public static javax.swing.JLabel label_carta_4;
    public static javax.swing.JLabel label_carta_5;
    public static javax.swing.JLabel label_carta_6;
    public static javax.swing.JLabel label_carta_7;
    public static javax.swing.JLabel label_carta_8;
    public static javax.swing.JLabel label_carta_9;
    private javax.swing.JPanel painel_MenuPrincipal;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_pares;
    private javax.swing.JLabel texto_pontos;
    private javax.swing.JLabel texto_tempo_restante;
    // End of variables declaration//GEN-END:variables
}
