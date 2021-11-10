
package jogo_da_memoria;

import codigo_jogo_da_memoria.AudioClip;
import codigo_jogo_da_memoria.Baralho;
import codigo_jogo_da_memoria.ControleSons;
import java.awt.Color;
import java.io.IOException;
import static java.lang.String.valueOf;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LayoutFacil extends javax.swing.JFrame {
    
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
        
    int[] array_facil = {0,0,0,0};
    
    int pontosTotal = 0;
    
    int controlePontosRodada = 20;
    int controlePares = 0;
    int rodada = 1;
       
    Timer timer = new Timer();
    int tempo = 10;
    
    
    AudioClip clip;
    AudioClip clipClick;
    AudioClip clipAcertou;
    AudioClip clipNovaRodada;
    AudioClip clipFim;
    
    //  Construtor
    
    public LayoutFacil() throws InterruptedException {
        initComponents();
        
        ImageIcon img = new ImageIcon("icones/icone_janela.png");
        
        setIconImage(img.getImage());
        
        setSize(640, 565);
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
        contador_tempo.setText("10");

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
                .addComponent(texto_pares)
                .addComponent(contador_pares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(barra_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(texto_pontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_tempo_restante)
                .addComponent(contador_tempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contador_pontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout painel_MenuPrincipalLayout = new javax.swing.GroupLayout(painel_MenuPrincipal);
        painel_MenuPrincipal.setLayout(painel_MenuPrincipalLayout);
        painel_MenuPrincipalLayout.setHorizontalGroup(
            painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_pause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(barra_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barra_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        painel_MenuPrincipalLayout.setVerticalGroup(
            painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(carta_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(carta_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carta_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(botao_pause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_pauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_pauseMouseClicked
        
        ControleSons.playSound(clip,0.5);
        
        timer.cancel();
        
        MenuPause pause = new MenuPause(new javax.swing.JFrame(),true, this, null, null);
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
        label_carta_1.setIcon(new ImageIcon("icones/"+array_facil[0]+".png"));
    }//GEN-LAST:event_carta_1MousePressed

    private void carta_1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_1MouseReleased
        SelecionarCarta(carta_1,label_carta_1);
    }//GEN-LAST:event_carta_1MouseReleased

    private void carta_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_2MousePressed
        ControleSons.playSound(clipClick,1);
        carta_2.setName("carta_2");
        label_carta_2.setIcon(new ImageIcon("icones/"+array_facil[1]+".png"));
    }//GEN-LAST:event_carta_2MousePressed

    private void carta_2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_2MouseReleased
        SelecionarCarta(carta_2,label_carta_2);
    }//GEN-LAST:event_carta_2MouseReleased

    private void carta_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_3MousePressed
        ControleSons.playSound(clipClick,1);
        carta_3.setName("carta_3");
        label_carta_3.setIcon(new ImageIcon("icones/"+array_facil[2]+".png"));
    }//GEN-LAST:event_carta_3MousePressed

    private void carta_3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_3MouseReleased
        SelecionarCarta(carta_3,label_carta_3);
    }//GEN-LAST:event_carta_3MouseReleased

    private void carta_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_4MousePressed
        ControleSons.playSound(clipClick,1);
        carta_4.setName("carta_4");
        label_carta_4.setIcon(new ImageIcon("icones/"+array_facil[3]+".png"));
    }//GEN-LAST:event_carta_4MousePressed

    private void carta_4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta_4MouseReleased
        SelecionarCarta(carta_4,label_carta_4);
    }//GEN-LAST:event_carta_4MouseReleased

    // Main 
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LayoutFacil().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(LayoutFacil.class.getName()).log(Level.SEVERE, null, ex);
                }
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
                   
        array_facil = baralho.GerarBaralhoFacil();
                
        this.label_carta_1.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_2.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_3.setIcon(new ImageIcon("icones/carta.png"));
        this.label_carta_4.setIcon(new ImageIcon("icones/carta.png"));
    }
    
    public void tempo_jogo(){
        
        int delay = 1000;
        int interval = 1000;  
        
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                
                if(controlePares == 2){
                    
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
        
        this.controlePontosRodada += 20;
        this.pontosTotal += 20;
        this.tempo = 10;
        this.CartasSelecionadas = 0;
        this.controlePares = 0;
        this.rodada++;
        
        contador_pontos.setText(valueOf(pontosTotal));
        contador_pares.setText(valueOf(controlePares));
        
        ControleSons.playSound(clipNovaRodada,0.5);
        
        ProximaRodada proxima = new ProximaRodada(new javax.swing.JFrame(), true, this, null, null,pontosTotal,rodada);
        proxima.setVisible(true);        
    }
    
    void fim(){

        this.pontosTotal = pontosTotal + controlePares*5;
        
        ControleSons.playSound(clipFim,0.8);
        
        if(controlePares>1){           
            InserirNomePlacar placar = new InserirNomePlacar(pontosTotal,rodada,"facil");
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
            telaCuriosidade = new TelaCuriosidade(new javax.swing.JFrame(), true, this, null, null);
        } catch (IOException ex) {
            Logger.getLogger(LayoutFacil.class.getName()).log(Level.SEVERE, null, ex);
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_inferior;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel botao_pause;
    public static javax.swing.JPanel carta_1;
    public static javax.swing.JPanel carta_2;
    public static javax.swing.JPanel carta_3;
    public static javax.swing.JPanel carta_4;
    private javax.swing.JLabel contador_pares;
    public static javax.swing.JLabel contador_pontos;
    private javax.swing.JLabel contador_tempo;
    private javax.swing.JLabel icone_botao_pause;
    public static javax.swing.JLabel label_carta_1;
    public static javax.swing.JLabel label_carta_2;
    public static javax.swing.JLabel label_carta_3;
    public static javax.swing.JLabel label_carta_4;
    private javax.swing.JPanel painel_MenuPrincipal;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_pares;
    private javax.swing.JLabel texto_pontos;
    private javax.swing.JLabel texto_tempo_restante;
    // End of variables declaration//GEN-END:variables

}
