
package jogo_da_memoria;

import java.awt.Color;
import javax.swing.ImageIcon;

public class MenuOpcoes extends javax.swing.JDialog {

    // Construtor
    
    public MenuOpcoes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        ImageIcon img = new ImageIcon("icones/icone_janela.png");
        
        setIconImage(img.getImage());
        
        setSize(640, 640);
        setLocationRelativeTo(null); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_MenuOpcoes = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        botao_voltar = new javax.swing.JPanel();
        texto_botao_voltar = new javax.swing.JLabel();
        titulo_opcoes = new javax.swing.JLabel();
        painel_sons = new javax.swing.JPanel();
        texto_sons = new javax.swing.JLabel();
        slider_sons = new javax.swing.JSlider();
        painel_musica = new javax.swing.JPanel();
        texto_musica = new javax.swing.JLabel();
        slider_musica = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painel_MenuOpcoes.setBackground(new java.awt.Color(255, 255, 255));
        painel_MenuOpcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

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

        botao_voltar.setBackground(new java.awt.Color(255, 255, 255));
        botao_voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_voltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_voltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_voltarMouseExited(evt);
            }
        });

        texto_botao_voltar.setBackground(new java.awt.Color(0, 0, 0));
        texto_botao_voltar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_botao_voltar.setForeground(new java.awt.Color(0, 0, 0));
        texto_botao_voltar.setText("Voltar");

        javax.swing.GroupLayout botao_voltarLayout = new javax.swing.GroupLayout(botao_voltar);
        botao_voltar.setLayout(botao_voltarLayout);
        botao_voltarLayout.setHorizontalGroup(
            botao_voltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_voltarLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(texto_botao_voltar)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        botao_voltarLayout.setVerticalGroup(
            botao_voltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_voltarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        titulo_opcoes.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        titulo_opcoes.setForeground(new java.awt.Color(0, 0, 0));
        titulo_opcoes.setText("Opções de Som");

        painel_sons.setBackground(new java.awt.Color(255, 255, 255));

        texto_sons.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_sons.setForeground(new java.awt.Color(0, 0, 0));
        texto_sons.setText("Sons");

        javax.swing.GroupLayout painel_sonsLayout = new javax.swing.GroupLayout(painel_sons);
        painel_sons.setLayout(painel_sonsLayout);
        painel_sonsLayout.setHorizontalGroup(
            painel_sonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_sonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_sons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(slider_sons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painel_sonsLayout.setVerticalGroup(
            painel_sonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_sonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_sons)
                .addGap(20, 20, 20))
            .addGroup(painel_sonsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(slider_sons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_musica.setBackground(new java.awt.Color(255, 255, 255));

        texto_musica.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_musica.setForeground(new java.awt.Color(0, 0, 0));
        texto_musica.setText("Música");

        javax.swing.GroupLayout painel_musicaLayout = new javax.swing.GroupLayout(painel_musica);
        painel_musica.setLayout(painel_musicaLayout);
        painel_musicaLayout.setHorizontalGroup(
            painel_musicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_musicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_musica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(slider_musica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painel_musicaLayout.setVerticalGroup(
            painel_musicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_musicaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_musica)
                .addGap(20, 20, 20))
            .addGroup(painel_musicaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(slider_musica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painel_MenuOpcoesLayout = new javax.swing.GroupLayout(painel_MenuOpcoes);
        painel_MenuOpcoes.setLayout(painel_MenuOpcoesLayout);
        painel_MenuOpcoesLayout.setHorizontalGroup(
            painel_MenuOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_MenuOpcoesLayout.createSequentialGroup()
                .addGroup(painel_MenuOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuOpcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_MenuOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuOpcoesLayout.createSequentialGroup()
                        .addGroup(painel_MenuOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(painel_sons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo_opcoes)
                            .addComponent(painel_musica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuOpcoesLayout.createSequentialGroup()
                        .addComponent(botao_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        painel_MenuOpcoesLayout.setVerticalGroup(
            painel_MenuOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuOpcoesLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(titulo_opcoes)
                .addGap(31, 31, 31)
                .addComponent(painel_sons, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel_musica, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(botao_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_MenuOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_MenuOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_voltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltarMouseEntered
        botao_voltar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_voltarMouseEntered

    private void botao_voltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltarMouseExited
        botao_voltar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_voltarMouseExited

    private void botao_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_botao_voltarMouseClicked

    // Main
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuOpcoes dialog = new MenuOpcoes(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel botao_voltar;
    private javax.swing.JPanel painel_MenuOpcoes;
    private javax.swing.JPanel painel_musica;
    private javax.swing.JPanel painel_sons;
    private javax.swing.JSlider slider_musica;
    private javax.swing.JSlider slider_sons;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_botao_voltar;
    private javax.swing.JLabel texto_musica;
    private javax.swing.JLabel texto_sons;
    private javax.swing.JLabel titulo_opcoes;
    // End of variables declaration//GEN-END:variables
}
