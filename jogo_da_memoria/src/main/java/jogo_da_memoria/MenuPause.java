
package jogo_da_memoria;

import codigo_jogo_da_memoria.AudioClip;
import codigo_jogo_da_memoria.ControleSons;
import java.awt.Color;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class MenuPause extends javax.swing.JDialog {

    LayoutFacil janelaPaiFacil;
    LayoutMedio janelaPaiMedio;
    LayoutDificil janelaPaiDificil;
    
    AudioClip clip;
    
    // Construtor
    
    public MenuPause(java.awt.Frame parent, boolean modal, LayoutFacil janelaFacil,LayoutMedio janelaMedio,LayoutDificil janelaDificil) {
        super(parent, modal);
        
        if(janelaFacil != null){
            janelaPaiFacil = janelaFacil;
        }else if(janelaMedio != null) {
            janelaPaiMedio = janelaMedio;
        }else if(janelaDificil != null) {
            janelaPaiDificil = janelaDificil;
        }
               
        initComponents();
        
        ImageIcon img = new ImageIcon("icones/icone_janela.png");
        
        setIconImage(img.getImage());
        
        setSize(640, 640);
        setLocationRelativeTo(null);
        
        clip = new AudioClip("sfx/click.wav");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_MenuPause = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        botao_voltar_menu = new javax.swing.JPanel();
        texto_botao_jogar = new javax.swing.JLabel();
        botao_sair = new javax.swing.JPanel();
        texto_botao_sair = new javax.swing.JLabel();
        titulo_pause1 = new javax.swing.JLabel();
        botao_opcoes = new javax.swing.JPanel();
        icone_botao_opcoes = new javax.swing.JLabel();
        botao_voltar_jogo = new javax.swing.JPanel();
        texto_voltar_jogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        painel_MenuPause.setBackground(new java.awt.Color(255, 255, 255));
        painel_MenuPause.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        barra_inferior.setBackground(new java.awt.Color(255, 255, 255));
        barra_inferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout barra_inferiorLayout = new javax.swing.GroupLayout(barra_inferior);
        barra_inferior.setLayout(barra_inferiorLayout);
        barra_inferiorLayout.setHorizontalGroup(
            barra_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );
        barra_inferiorLayout.setVerticalGroup(
            barra_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        barra_superior.setBackground(new java.awt.Color(255, 255, 255));
        barra_superior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        barra_superior.setToolTipText("");

        texto_barra_superior.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        texto_barra_superior.setForeground(new java.awt.Color(0, 0, 0));
        texto_barra_superior.setText("Jogo da Memória");

        javax.swing.GroupLayout barra_superiorLayout = new javax.swing.GroupLayout(barra_superior);
        barra_superior.setLayout(barra_superiorLayout);
        barra_superiorLayout.setHorizontalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        barra_superiorLayout.setVerticalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto_barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
        );

        botao_voltar_menu.setBackground(new java.awt.Color(255, 255, 255));
        botao_voltar_menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_voltar_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_voltar_menuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_voltar_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_voltar_menuMouseExited(evt);
            }
        });

        texto_botao_jogar.setBackground(new java.awt.Color(0, 0, 0));
        texto_botao_jogar.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        texto_botao_jogar.setForeground(new java.awt.Color(0, 0, 0));
        texto_botao_jogar.setText("Voltar para o menu");

        javax.swing.GroupLayout botao_voltar_menuLayout = new javax.swing.GroupLayout(botao_voltar_menu);
        botao_voltar_menu.setLayout(botao_voltar_menuLayout);
        botao_voltar_menuLayout.setHorizontalGroup(
            botao_voltar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_voltar_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_jogar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botao_voltar_menuLayout.setVerticalGroup(
            botao_voltar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_voltar_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_jogar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        botao_sair.setBackground(new java.awt.Color(255, 255, 255));
        botao_sair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_sairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_sairMouseExited(evt);
            }
        });

        texto_botao_sair.setBackground(new java.awt.Color(0, 0, 0));
        texto_botao_sair.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        texto_botao_sair.setForeground(new java.awt.Color(0, 0, 0));
        texto_botao_sair.setText("Desktop");

        javax.swing.GroupLayout botao_sairLayout = new javax.swing.GroupLayout(botao_sair);
        botao_sair.setLayout(botao_sairLayout);
        botao_sairLayout.setHorizontalGroup(
            botao_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_sairLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_botao_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        botao_sairLayout.setVerticalGroup(
            botao_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_sairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        titulo_pause1.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        titulo_pause1.setForeground(new java.awt.Color(0, 0, 0));
        titulo_pause1.setText("Jogo pausado");

        botao_opcoes.setBackground(new java.awt.Color(255, 255, 255));
        botao_opcoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botao_opcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_opcoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_opcoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_opcoesMouseExited(evt);
            }
        });

        icone_botao_opcoes.setIcon(new ImageIcon("icones/opcoes.png"));

        javax.swing.GroupLayout botao_opcoesLayout = new javax.swing.GroupLayout(botao_opcoes);
        botao_opcoes.setLayout(botao_opcoesLayout);
        botao_opcoesLayout.setHorizontalGroup(
            botao_opcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_opcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icone_botao_opcoes)
                .addContainerGap())
        );
        botao_opcoesLayout.setVerticalGroup(
            botao_opcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_opcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icone_botao_opcoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botao_voltar_jogo.setBackground(new java.awt.Color(255, 255, 255));
        botao_voltar_jogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_voltar_jogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_voltar_jogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_voltar_jogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_voltar_jogoMouseExited(evt);
            }
        });

        texto_voltar_jogo.setBackground(new java.awt.Color(0, 0, 0));
        texto_voltar_jogo.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        texto_voltar_jogo.setForeground(new java.awt.Color(0, 0, 0));
        texto_voltar_jogo.setText("Voltar ao jogo");

        javax.swing.GroupLayout botao_voltar_jogoLayout = new javax.swing.GroupLayout(botao_voltar_jogo);
        botao_voltar_jogo.setLayout(botao_voltar_jogoLayout);
        botao_voltar_jogoLayout.setHorizontalGroup(
            botao_voltar_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_voltar_jogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_voltar_jogo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        botao_voltar_jogoLayout.setVerticalGroup(
            botao_voltar_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_voltar_jogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_voltar_jogo, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painel_MenuPauseLayout = new javax.swing.GroupLayout(painel_MenuPause);
        painel_MenuPause.setLayout(painel_MenuPauseLayout);
        painel_MenuPauseLayout.setHorizontalGroup(
            painel_MenuPauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_MenuPauseLayout.createSequentialGroup()
                .addGroup(painel_MenuPauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPauseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_MenuPauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPauseLayout.createSequentialGroup()
                        .addComponent(botao_opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPauseLayout.createSequentialGroup()
                        .addComponent(titulo_pause1)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPauseLayout.createSequentialGroup()
                        .addGroup(painel_MenuPauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botao_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao_voltar_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao_voltar_jogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(197, 197, 197))))
        );
        painel_MenuPauseLayout.setVerticalGroup(
            painel_MenuPauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPauseLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(titulo_pause1)
                .addGap(45, 45, 45)
                .addComponent(botao_voltar_jogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(botao_voltar_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botao_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_MenuPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_MenuPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_voltar_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltar_menuMouseClicked
        
        ControleSons.playSound(clip,0.5);
        
        this.dispose();
        
        if(janelaPaiFacil != null){
            janelaPaiFacil.dispose();
        }else if(janelaPaiMedio != null) {
            janelaPaiMedio.dispose();
        }else if(janelaPaiDificil != null) {
            janelaPaiDificil.dispose();
        }
        
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_botao_voltar_menuMouseClicked

    private void botao_voltar_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltar_menuMouseEntered
        botao_voltar_menu.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_voltar_menuMouseEntered

    private void botao_voltar_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltar_menuMouseExited
        botao_voltar_menu.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_voltar_menuMouseExited

    private void botao_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_sairMouseClicked
        ControleSons.playSound(clip,0.5);
        System.exit(0);
    }//GEN-LAST:event_botao_sairMouseClicked

    private void botao_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_sairMouseEntered
        botao_sair.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_sairMouseEntered

    private void botao_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_sairMouseExited
        botao_sair.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_sairMouseExited

    private void botao_opcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_opcoesMouseClicked
        ControleSons.playSound(clip,0.5);
        MenuOpcoes opcoes = new MenuOpcoes(new javax.swing.JFrame(),true);
        opcoes.setVisible(true);
    }//GEN-LAST:event_botao_opcoesMouseClicked

    private void botao_opcoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_opcoesMouseEntered
        botao_opcoes.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_opcoesMouseEntered

    private void botao_opcoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_opcoesMouseExited
        botao_opcoes.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_opcoesMouseExited

    private void botao_voltar_jogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltar_jogoMouseClicked
        ControleSons.playSound(clip,0.5);
        
        this.dispose();
        
        if(janelaPaiFacil != null){
            janelaPaiFacil.timer = new Timer();
            janelaPaiFacil.tempo_jogo();
        }else if(janelaPaiMedio != null) {
            janelaPaiMedio.timer = new Timer();
            janelaPaiMedio.tempo_jogo();
        }else if(janelaPaiDificil != null) {
            janelaPaiDificil.timer = new Timer();
            janelaPaiDificil.tempo_jogo();
        }
        
    }//GEN-LAST:event_botao_voltar_jogoMouseClicked

    private void botao_voltar_jogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltar_jogoMouseEntered
        botao_voltar_jogo.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_voltar_jogoMouseEntered

    private void botao_voltar_jogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltar_jogoMouseExited
        botao_voltar_jogo.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_voltar_jogoMouseExited

    // Main
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPause dialog = null;
                try {
                    dialog = new MenuPause(new javax.swing.JFrame(), true, new LayoutFacil(),new LayoutMedio(),new LayoutDificil());
                } catch (InterruptedException ex) {
                    Logger.getLogger(MenuPause.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_inferior;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel botao_opcoes;
    private javax.swing.JPanel botao_sair;
    private javax.swing.JPanel botao_voltar_jogo;
    private javax.swing.JPanel botao_voltar_menu;
    private javax.swing.JLabel icone_botao_opcoes;
    private javax.swing.JPanel painel_MenuPause;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_botao_jogar;
    private javax.swing.JLabel texto_botao_sair;
    private javax.swing.JLabel texto_voltar_jogo;
    private javax.swing.JLabel titulo_pause1;
    // End of variables declaration//GEN-END:variables
}
