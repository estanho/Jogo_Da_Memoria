
package jogo_da_memoria;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class MenuPrincipal extends javax.swing.JFrame {

    // Construtor
    
    public MenuPrincipal() {
        initComponents();
        botao_login.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_MenuPrincipal = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        botao_jogar = new javax.swing.JPanel();
        texto_botao_jogar = new javax.swing.JLabel();
        botao_placar_lideres = new javax.swing.JPanel();
        texto_botao_placar_lideres = new javax.swing.JLabel();
        botao_sair = new javax.swing.JPanel();
        texto_botao_sair = new javax.swing.JLabel();
        titulo_jogo1 = new javax.swing.JLabel();
        titulo_jogo2 = new javax.swing.JLabel();
        botao_opcoes = new javax.swing.JPanel();
        icone_botao_opcoes = new javax.swing.JLabel();
        botao_login = new javax.swing.JPanel();
        icone_botao_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Memória com elementos químicos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("janela"); // NOI18N
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        painel_MenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painel_MenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        barra_inferior.setBackground(new java.awt.Color(255, 255, 255));
        barra_inferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout barra_inferiorLayout = new javax.swing.GroupLayout(barra_inferior);
        barra_inferior.setLayout(barra_inferiorLayout);
        barra_inferiorLayout.setHorizontalGroup(
            barra_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        botao_jogar.setBackground(new java.awt.Color(255, 255, 255));
        botao_jogar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_jogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_jogarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_jogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_jogarMouseExited(evt);
            }
        });

        texto_botao_jogar.setBackground(new java.awt.Color(0, 0, 0));
        texto_botao_jogar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_botao_jogar.setForeground(new java.awt.Color(0, 0, 0));
        texto_botao_jogar.setText("Jogar");

        javax.swing.GroupLayout botao_jogarLayout = new javax.swing.GroupLayout(botao_jogar);
        botao_jogar.setLayout(botao_jogarLayout);
        botao_jogarLayout.setHorizontalGroup(
            botao_jogarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_jogarLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(texto_botao_jogar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botao_jogarLayout.setVerticalGroup(
            botao_jogarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_jogarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_jogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        botao_placar_lideres.setBackground(new java.awt.Color(255, 255, 255));
        botao_placar_lideres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_placar_lideres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_placar_lideresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_placar_lideresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_placar_lideresMouseExited(evt);
            }
        });

        texto_botao_placar_lideres.setBackground(new java.awt.Color(0, 0, 0));
        texto_botao_placar_lideres.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_botao_placar_lideres.setForeground(new java.awt.Color(0, 0, 0));
        texto_botao_placar_lideres.setText("Placar de lideres");

        javax.swing.GroupLayout botao_placar_lideresLayout = new javax.swing.GroupLayout(botao_placar_lideres);
        botao_placar_lideres.setLayout(botao_placar_lideresLayout);
        botao_placar_lideresLayout.setHorizontalGroup(
            botao_placar_lideresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_placar_lideresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_placar_lideres)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botao_placar_lideresLayout.setVerticalGroup(
            botao_placar_lideresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_placar_lideresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_placar_lideres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        texto_botao_sair.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_botao_sair.setForeground(new java.awt.Color(0, 0, 0));
        texto_botao_sair.setText("Sair");

        javax.swing.GroupLayout botao_sairLayout = new javax.swing.GroupLayout(botao_sair);
        botao_sair.setLayout(botao_sairLayout);
        botao_sairLayout.setHorizontalGroup(
            botao_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_sairLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(texto_botao_sair)
                .addGap(79, 79, 79))
        );
        botao_sairLayout.setVerticalGroup(
            botao_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_sairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        titulo_jogo1.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        titulo_jogo1.setForeground(new java.awt.Color(0, 0, 0));
        titulo_jogo1.setText("Jogo da Memória");

        titulo_jogo2.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        titulo_jogo2.setForeground(new java.awt.Color(0, 0, 0));
        titulo_jogo2.setText("com elementos químicos!");

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

        botao_login.setBackground(new java.awt.Color(255, 255, 255));
        botao_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botao_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_loginMouseExited(evt);
            }
        });

        icone_botao_login.setIcon(new ImageIcon("icones/login.png"));

        javax.swing.GroupLayout botao_loginLayout = new javax.swing.GroupLayout(botao_login);
        botao_login.setLayout(botao_loginLayout);
        botao_loginLayout.setHorizontalGroup(
            botao_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icone_botao_login)
                .addContainerGap())
        );
        botao_loginLayout.setVerticalGroup(
            botao_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icone_botao_login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painel_MenuPrincipalLayout = new javax.swing.GroupLayout(painel_MenuPrincipal);
        painel_MenuPrincipal.setLayout(painel_MenuPrincipalLayout);
        painel_MenuPrincipalLayout.setHorizontalGroup(
            painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(barra_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(barra_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(titulo_jogo1)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(titulo_jogo2)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                        .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao_placar_lideres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao_jogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(botao_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        painel_MenuPrincipalLayout.setVerticalGroup(
            painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(titulo_jogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo_jogo2)
                .addGap(39, 39, 39)
                .addComponent(botao_jogar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_placar_lideres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                        .addComponent(botao_opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botao_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_jogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_jogarMouseEntered
        botao_jogar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_jogarMouseEntered

    private void botao_jogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_jogarMouseExited
        botao_jogar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_jogarMouseExited

    private void botao_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_sairMouseEntered
        botao_sair.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_sairMouseEntered

    private void botao_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_sairMouseExited
        botao_sair.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_sairMouseExited

    private void botao_placar_lideresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_placar_lideresMouseEntered
        botao_placar_lideres.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_placar_lideresMouseEntered

    private void botao_placar_lideresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_placar_lideresMouseExited
        botao_placar_lideres.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_placar_lideresMouseExited

    private void botao_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botao_sairMouseClicked

    private void botao_opcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_opcoesMouseClicked
        MenuOpcoes opcoes = new MenuOpcoes(new javax.swing.JFrame(),true);
        opcoes.setVisible(true);
    }//GEN-LAST:event_botao_opcoesMouseClicked

    private void botao_opcoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_opcoesMouseEntered
        botao_opcoes.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_opcoesMouseEntered

    private void botao_opcoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_opcoesMouseExited
        botao_opcoes.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_opcoesMouseExited

    private void botao_placar_lideresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_placar_lideresMouseClicked
        new PlacarLideres().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_placar_lideresMouseClicked

    private void botao_jogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_jogarMouseClicked
        new DefinirDificuldade().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_jogarMouseClicked

    private void botao_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_loginMouseClicked
        LoginAdministrador login = new LoginAdministrador(new javax.swing.JFrame(),true, this);
        login.setVisible(true);
    }//GEN-LAST:event_botao_loginMouseClicked

    private void botao_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_loginMouseEntered
        botao_login.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_loginMouseEntered

    private void botao_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_loginMouseExited
        botao_login.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_loginMouseExited

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            botao_login.setVisible(true);
        }
    }//GEN-LAST:event_formKeyPressed

    // Main
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_inferior;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel botao_jogar;
    private javax.swing.JPanel botao_login;
    private javax.swing.JPanel botao_opcoes;
    private javax.swing.JPanel botao_placar_lideres;
    private javax.swing.JPanel botao_sair;
    private javax.swing.JLabel icone_botao_login;
    private javax.swing.JLabel icone_botao_opcoes;
    private javax.swing.JPanel painel_MenuPrincipal;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_botao_jogar;
    private javax.swing.JLabel texto_botao_placar_lideres;
    private javax.swing.JLabel texto_botao_sair;
    private javax.swing.JLabel titulo_jogo1;
    private javax.swing.JLabel titulo_jogo2;
    // End of variables declaration//GEN-END:variables
}
