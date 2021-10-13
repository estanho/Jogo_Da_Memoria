
package jogo_da_memoria;

import java.awt.Color;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProximaRodada extends javax.swing.JDialog {

    LayoutFacil janelaPaiFacil;
    LayoutMedio janelaPaiMedio;
    LayoutDificil janelaPaiDificil;
    
    // Construtor
    
    public ProximaRodada(java.awt.Frame parent, boolean modal, LayoutFacil janelaFacil, LayoutMedio janelaMedio, LayoutDificil janelaDificil) {
        super(parent, modal);
        
        if(janelaFacil != null){
            janelaPaiFacil = janelaFacil;
        }else if(janelaMedio != null) {
            janelaPaiMedio = janelaMedio;
        }else if(janelaDificil != null) {
            janelaPaiDificil = janelaDificil;
        }
        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_ProximaRodada = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        botao_continuar = new javax.swing.JPanel();
        texto_botao_continuar = new javax.swing.JLabel();
        titulo_rodada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        painel_ProximaRodada.setBackground(new java.awt.Color(255, 255, 255));
        painel_ProximaRodada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

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

        botao_continuar.setBackground(new java.awt.Color(255, 255, 255));
        botao_continuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_continuarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_continuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_continuarMouseExited(evt);
            }
        });

        texto_botao_continuar.setBackground(new java.awt.Color(0, 0, 0));
        texto_botao_continuar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_botao_continuar.setForeground(new java.awt.Color(0, 0, 0));
        texto_botao_continuar.setText("Continuar");

        javax.swing.GroupLayout botao_continuarLayout = new javax.swing.GroupLayout(botao_continuar);
        botao_continuar.setLayout(botao_continuarLayout);
        botao_continuarLayout.setHorizontalGroup(
            botao_continuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_continuarLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(texto_botao_continuar)
                .addGap(48, 48, 48))
        );
        botao_continuarLayout.setVerticalGroup(
            botao_continuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto_botao_continuar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        titulo_rodada.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        titulo_rodada.setForeground(new java.awt.Color(0, 0, 0));
        titulo_rodada.setText("Próxima Rodada");

        javax.swing.GroupLayout painel_ProximaRodadaLayout = new javax.swing.GroupLayout(painel_ProximaRodada);
        painel_ProximaRodada.setLayout(painel_ProximaRodadaLayout);
        painel_ProximaRodadaLayout.setHorizontalGroup(
            painel_ProximaRodadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_ProximaRodadaLayout.createSequentialGroup()
                .addGroup(painel_ProximaRodadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_ProximaRodadaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_ProximaRodadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_ProximaRodadaLayout.createSequentialGroup()
                        .addComponent(botao_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_ProximaRodadaLayout.createSequentialGroup()
                        .addComponent(titulo_rodada)
                        .addGap(114, 114, 114))))
        );
        painel_ProximaRodadaLayout.setVerticalGroup(
            painel_ProximaRodadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_ProximaRodadaLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(titulo_rodada)
                .addGap(32, 32, 32)
                .addComponent(botao_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_ProximaRodada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_ProximaRodada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_continuarMouseClicked
        
        this.dispose();
        
        if(janelaPaiFacil != null){
            janelaPaiFacil.DefinirCartas();
            janelaPaiFacil.timer = new Timer();
            janelaPaiFacil.tempo_jogo();
        }else if(janelaPaiMedio != null) {
            janelaPaiMedio.DefinirCartas();
            janelaPaiMedio.timer = new Timer();
            janelaPaiMedio.tempo_jogo();
        }else if(janelaPaiDificil != null) {
            janelaPaiDificil.DefinirCartas();
            janelaPaiDificil.timer = new Timer();
            janelaPaiDificil.tempo_jogo();
        }
        
    }//GEN-LAST:event_botao_continuarMouseClicked

    private void botao_continuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_continuarMouseEntered
        botao_continuar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_continuarMouseEntered

    private void botao_continuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_continuarMouseExited
        botao_continuar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_continuarMouseExited

    // Main
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProximaRodada dialog = null;
                try {
                    dialog = new ProximaRodada(new javax.swing.JFrame(), true, new LayoutFacil(),new LayoutMedio(),new LayoutDificil());
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProximaRodada.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JPanel botao_continuar;
    private javax.swing.JPanel painel_ProximaRodada;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_botao_continuar;
    private javax.swing.JLabel titulo_rodada;
    // End of variables declaration//GEN-END:variables
}
