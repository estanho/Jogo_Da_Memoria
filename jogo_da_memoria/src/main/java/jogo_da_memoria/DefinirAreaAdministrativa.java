
package jogo_da_memoria;

import java.awt.Color;
import javax.swing.ImageIcon;


public class DefinirAreaAdministrativa extends javax.swing.JFrame {

    // Construtor
    
    public DefinirAreaAdministrativa() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_MenuPrincipal = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        titulo_areaAdministrativa = new javax.swing.JLabel();
        botao_voltar = new javax.swing.JPanel();
        icone_botao_voltar = new javax.swing.JLabel();
        botao_cartas = new javax.swing.JPanel();
        texto_botao_cartas = new javax.swing.JLabel();
        botao_curiosidades = new javax.swing.JPanel();
        texto_botao_curiosidades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Memória com elementos químicos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("janela"); // NOI18N
        setResizable(false);

        painel_MenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painel_MenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        barra_inferior.setBackground(new java.awt.Color(255, 255, 255));
        barra_inferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout barra_inferiorLayout = new javax.swing.GroupLayout(barra_inferior);
        barra_inferior.setLayout(barra_inferiorLayout);
        barra_inferiorLayout.setHorizontalGroup(
            barra_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
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

        titulo_areaAdministrativa.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        titulo_areaAdministrativa.setForeground(new java.awt.Color(0, 0, 0));
        titulo_areaAdministrativa.setText("Area Administrativa");

        botao_voltar.setBackground(new java.awt.Color(255, 255, 255));
        botao_voltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
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

        icone_botao_voltar.setIcon(new ImageIcon("icones/voltar.png"));

        javax.swing.GroupLayout botao_voltarLayout = new javax.swing.GroupLayout(botao_voltar);
        botao_voltar.setLayout(botao_voltarLayout);
        botao_voltarLayout.setHorizontalGroup(
            botao_voltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_voltarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icone_botao_voltar)
                .addContainerGap())
        );
        botao_voltarLayout.setVerticalGroup(
            botao_voltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_voltarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icone_botao_voltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botao_cartas.setBackground(new java.awt.Color(255, 255, 255));
        botao_cartas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_cartas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_cartasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_cartasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_cartasMouseExited(evt);
            }
        });

        texto_botao_cartas.setBackground(new java.awt.Color(0, 0, 0));
        texto_botao_cartas.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_botao_cartas.setForeground(new java.awt.Color(0, 0, 0));
        texto_botao_cartas.setText("Cartas");

        javax.swing.GroupLayout botao_cartasLayout = new javax.swing.GroupLayout(botao_cartas);
        botao_cartas.setLayout(botao_cartasLayout);
        botao_cartasLayout.setHorizontalGroup(
            botao_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_cartasLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(texto_botao_cartas)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        botao_cartasLayout.setVerticalGroup(
            botao_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_cartasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_cartas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        botao_curiosidades.setBackground(new java.awt.Color(255, 255, 255));
        botao_curiosidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_curiosidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_curiosidadesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_curiosidadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_curiosidadesMouseExited(evt);
            }
        });

        texto_botao_curiosidades.setBackground(new java.awt.Color(0, 0, 0));
        texto_botao_curiosidades.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_botao_curiosidades.setForeground(new java.awt.Color(0, 0, 0));
        texto_botao_curiosidades.setText("Curiosidades");

        javax.swing.GroupLayout botao_curiosidadesLayout = new javax.swing.GroupLayout(botao_curiosidades);
        botao_curiosidades.setLayout(botao_curiosidadesLayout);
        botao_curiosidadesLayout.setHorizontalGroup(
            botao_curiosidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_curiosidadesLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(texto_botao_curiosidades)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        botao_curiosidadesLayout.setVerticalGroup(
            botao_curiosidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_curiosidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_curiosidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painel_MenuPrincipalLayout = new javax.swing.GroupLayout(painel_MenuPrincipal);
        painel_MenuPrincipal.setLayout(painel_MenuPrincipalLayout);
        painel_MenuPrincipalLayout.setHorizontalGroup(
            painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(barra_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barra_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botao_curiosidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_cartas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painel_MenuPrincipalLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(titulo_areaAdministrativa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_MenuPrincipalLayout.setVerticalGroup(
            painel_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPrincipalLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(titulo_areaAdministrativa)
                .addGap(64, 64, 64)
                .addComponent(botao_cartas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botao_curiosidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_cartasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cartasMouseEntered
        botao_cartas.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_cartasMouseEntered

    private void botao_cartasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cartasMouseExited
        botao_cartas.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_cartasMouseExited

    private void botao_curiosidadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_curiosidadesMouseEntered
        botao_curiosidades.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_curiosidadesMouseEntered

    private void botao_curiosidadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_curiosidadesMouseExited
        botao_curiosidades.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_curiosidadesMouseExited

    private void botao_curiosidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_curiosidadesMouseClicked
        AreaAdministrativaCriarCuriosidade areaCuriosidade = new AreaAdministrativaCriarCuriosidade();
        areaCuriosidade.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_curiosidadesMouseClicked

    private void botao_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltarMouseClicked
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_voltarMouseClicked

    private void botao_voltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltarMouseEntered
        botao_voltar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_voltarMouseEntered

    private void botao_voltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltarMouseExited
        botao_voltar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_voltarMouseExited

    private void botao_cartasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cartasMouseClicked
        
        AreaAdministrativaCriarCarta areaCarta = new AreaAdministrativaCriarCarta();
        areaCarta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_cartasMouseClicked

    // Main
    
    public static void main(String args[]) {      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefinirAreaAdministrativa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_inferior;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel botao_cartas;
    private javax.swing.JPanel botao_curiosidades;
    private javax.swing.JPanel botao_voltar;
    private javax.swing.JLabel icone_botao_voltar;
    private javax.swing.JPanel painel_MenuPrincipal;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_botao_cartas;
    private javax.swing.JLabel texto_botao_curiosidades;
    private javax.swing.JLabel titulo_areaAdministrativa;
    // End of variables declaration//GEN-END:variables

}
