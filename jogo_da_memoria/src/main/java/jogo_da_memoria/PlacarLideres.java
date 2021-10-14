
package jogo_da_memoria;

import codigo_jogo_da_memoria.Jogador;
import codigo_jogo_da_memoria.ManipularArquivos;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PlacarLideres extends javax.swing.JFrame {
   
    ArrayList <Jogador> jogadoresFacil = new ArrayList();
    ArrayList <Jogador> jogadoresMedio = new ArrayList();
    ArrayList <Jogador> jogadoresDificil = new ArrayList();
    
    ManipularArquivos arquivos = new ManipularArquivos();
    
    DefaultTableModel modeloTabela;
    
    // Construtor
    
    public PlacarLideres() {
        initComponents();
        
        ImageIcon img = new ImageIcon("icones/icone_janela.png");
        
        setIconImage(img.getImage());
        
        setSize(610, 670);
        setLocationRelativeTo(null); 

        try {
            arquivos.preencherPlacarLideres(jogadoresFacil,jogadoresMedio,jogadoresDificil);

            modeloTabela = (DefaultTableModel) tabela.getModel();
            
            TableRowSorter tableSorter = new TableRowSorter(modeloTabela);
            tabela.setRowSorter(tableSorter);
            tableSorter.toggleSortOrder(1);
            tableSorter.toggleSortOrder(1);

            for(int i=0;i<jogadoresFacil.size();i++){
                Object[] dados = {jogadoresFacil.get(i).getNome(),jogadoresFacil.get(i).getPontos(),jogadoresFacil.get(i).getRodadas()};
                modeloTabela.addRow(dados);
            }
            
            botao_facil.setBackground(Color.GRAY);
             
        } catch (IOException ex) {
            Logger.getLogger(PlacarLideres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_PlacarLideres = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        titulo_placarLideres = new javax.swing.JLabel();
        botao_voltar = new javax.swing.JPanel();
        icone_botao_voltar = new javax.swing.JLabel();
        painel_tabela = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botao_facil = new javax.swing.JPanel();
        texto_facil = new javax.swing.JLabel();
        botao_medio = new javax.swing.JPanel();
        texto_medio = new javax.swing.JLabel();
        botao_dificil = new javax.swing.JPanel();
        texto_dificil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Memória com elementos químicos");
        setResizable(false);

        painel_PlacarLideres.setBackground(new java.awt.Color(255, 255, 255));
        painel_PlacarLideres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        barra_superiorLayout.setVerticalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto_barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
        );

        titulo_placarLideres.setFont(new java.awt.Font("Comic Sans MS", 3, 32)); // NOI18N
        titulo_placarLideres.setForeground(new java.awt.Color(0, 0, 0));
        titulo_placarLideres.setText("Placar de Lideres");

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

        painel_tabela.setBackground(new java.awt.Color(255, 255, 255));
        painel_tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        painel_tabela.setFocusable(false);
        painel_tabela.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        painel_tabela.setWheelScrollingEnabled(false);

        tabela.setBackground(new java.awt.Color(255, 255, 255));
        tabela.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Pontos", "Rodadas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setFocusable(false);
        tabela.setGridColor(new java.awt.Color(102, 102, 102));
        tabela.setOpaque(false);
        tabela.setRequestFocusEnabled(false);
        tabela.setRowHeight(30);
        tabela.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabela.setShowGrid(true);
        tabela.getTableHeader().setReorderingAllowed(false);
        painel_tabela.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
        }

        botao_facil.setBackground(new java.awt.Color(255, 255, 255));
        botao_facil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_facil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_facilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_facilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_facilMouseExited(evt);
            }
        });

        texto_facil.setBackground(new java.awt.Color(0, 0, 0));
        texto_facil.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_facil.setForeground(new java.awt.Color(0, 0, 0));
        texto_facil.setText("Facil");

        javax.swing.GroupLayout botao_facilLayout = new javax.swing.GroupLayout(botao_facil);
        botao_facil.setLayout(botao_facilLayout);
        botao_facilLayout.setHorizontalGroup(
            botao_facilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_facilLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(texto_facil)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        botao_facilLayout.setVerticalGroup(
            botao_facilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_facilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_facil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        botao_medio.setBackground(new java.awt.Color(255, 255, 255));
        botao_medio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_medio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_medioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_medioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_medioMouseExited(evt);
            }
        });

        texto_medio.setBackground(new java.awt.Color(0, 0, 0));
        texto_medio.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_medio.setForeground(new java.awt.Color(0, 0, 0));
        texto_medio.setText("Medio");

        javax.swing.GroupLayout botao_medioLayout = new javax.swing.GroupLayout(botao_medio);
        botao_medio.setLayout(botao_medioLayout);
        botao_medioLayout.setHorizontalGroup(
            botao_medioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_medioLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(texto_medio)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        botao_medioLayout.setVerticalGroup(
            botao_medioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_medioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_medio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        botao_dificil.setBackground(new java.awt.Color(255, 255, 255));
        botao_dificil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_dificil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_dificilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_dificilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_dificilMouseExited(evt);
            }
        });

        texto_dificil.setBackground(new java.awt.Color(0, 0, 0));
        texto_dificil.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_dificil.setForeground(new java.awt.Color(0, 0, 0));
        texto_dificil.setText("Dificil");

        javax.swing.GroupLayout botao_dificilLayout = new javax.swing.GroupLayout(botao_dificil);
        botao_dificil.setLayout(botao_dificilLayout);
        botao_dificilLayout.setHorizontalGroup(
            botao_dificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_dificilLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(texto_dificil)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        botao_dificilLayout.setVerticalGroup(
            botao_dificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_dificilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_dificil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painel_PlacarLideresLayout = new javax.swing.GroupLayout(painel_PlacarLideres);
        painel_PlacarLideres.setLayout(painel_PlacarLideresLayout);
        painel_PlacarLideresLayout.setHorizontalGroup(
            painel_PlacarLideresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barra_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_PlacarLideresLayout.createSequentialGroup()
                .addGroup(painel_PlacarLideresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel_PlacarLideresLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(titulo_placarLideres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_PlacarLideresLayout.createSequentialGroup()
                        .addContainerGap(75, Short.MAX_VALUE)
                        .addGroup(painel_PlacarLideresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painel_tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painel_PlacarLideresLayout.createSequentialGroup()
                                .addComponent(botao_facil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_medio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_dificil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)))
                .addGap(12, 12, 12))
        );
        painel_PlacarLideresLayout.setVerticalGroup(
            painel_PlacarLideresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_PlacarLideresLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painel_PlacarLideresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_PlacarLideresLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(titulo_placarLideres))
                    .addGroup(painel_PlacarLideresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(painel_tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(painel_PlacarLideresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_medio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_facil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_dificil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_PlacarLideres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_PlacarLideres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_facilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_facilMouseExited
        Color cor = botao_facil.getBackground();
        if(cor != Color.GRAY)
            botao_facil.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_facilMouseExited

    private void botao_facilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_facilMouseEntered
        Color cor = botao_facil.getBackground();
        if(cor != Color.GRAY)
            botao_facil.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_facilMouseEntered

    private void botao_medioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_medioMouseExited
        Color cor = botao_medio.getBackground();
        if(cor != Color.GRAY)
            botao_medio.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_medioMouseExited

    private void botao_medioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_medioMouseEntered
        Color cor = botao_medio.getBackground();
        if(cor != Color.GRAY)
            botao_medio.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_medioMouseEntered

    private void botao_facilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_facilMouseClicked
        if(botao_facil.getBackground()!=Color.GRAY) {
            
            if(botao_medio.getBackground() == Color.GRAY)   botao_medio.setBackground(Color.WHITE);
            if(botao_dificil.getBackground() == Color.GRAY)   botao_dificil.setBackground(Color.WHITE);
            
            ((DefaultTableModel) tabela.getModel()).setRowCount(0);
        
            for(int i=0;i<jogadoresFacil.size();i++){
                    Object[] dados = {jogadoresFacil.get(i).getNome(),jogadoresFacil.get(i).getPontos(),jogadoresFacil.get(i).getRodadas()};
                    modeloTabela.addRow(dados);
                }

            botao_facil.setBackground(Color.GRAY);
        }
    }//GEN-LAST:event_botao_facilMouseClicked

    private void botao_medioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_medioMouseClicked
        if(botao_medio.getBackground()!=Color.GRAY) {
            
            if(botao_facil.getBackground() == Color.GRAY)   botao_facil.setBackground(Color.WHITE);
            if(botao_dificil.getBackground() == Color.GRAY)   botao_dificil.setBackground(Color.WHITE);
            
            ((DefaultTableModel) tabela.getModel()).setRowCount(0);
        
            for(int i=0;i<jogadoresMedio.size();i++){
                    Object[] dados = {jogadoresMedio.get(i).getNome(),jogadoresMedio.get(i).getPontos(),jogadoresMedio.get(i).getRodadas()};
                    modeloTabela.addRow(dados);
                }

            botao_medio.setBackground(Color.GRAY);
        }
    }//GEN-LAST:event_botao_medioMouseClicked

    private void botao_dificilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_dificilMouseClicked
        if(botao_dificil.getBackground()!=Color.GRAY) {
            
            if(botao_facil.getBackground() == Color.GRAY)   botao_facil.setBackground(Color.WHITE);
            if(botao_medio.getBackground() == Color.GRAY)   botao_medio.setBackground(Color.WHITE);
            
            ((DefaultTableModel) tabela.getModel()).setRowCount(0);
        
            for(int i=0;i<jogadoresDificil.size();i++){
                    Object[] dados = {jogadoresDificil.get(i).getNome(),jogadoresDificil.get(i).getPontos(),jogadoresDificil.get(i).getRodadas()};
                    modeloTabela.addRow(dados);
                }

            botao_dificil.setBackground(Color.GRAY);
        }
    }//GEN-LAST:event_botao_dificilMouseClicked

    private void botao_dificilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_dificilMouseEntered
        Color cor = botao_dificil.getBackground();
        if(cor != Color.GRAY)
            botao_dificil.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_dificilMouseEntered

    private void botao_dificilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_dificilMouseExited
        Color cor = botao_dificil.getBackground();
        if(cor != Color.GRAY)
            botao_dificil.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_dificilMouseExited

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

    // Main
    
    public void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlacarLideres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_inferior;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel botao_dificil;
    private javax.swing.JPanel botao_facil;
    private javax.swing.JPanel botao_medio;
    private javax.swing.JPanel botao_voltar;
    private javax.swing.JLabel icone_botao_voltar;
    private javax.swing.JPanel painel_PlacarLideres;
    private javax.swing.JScrollPane painel_tabela;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_dificil;
    private javax.swing.JLabel texto_facil;
    private javax.swing.JLabel texto_medio;
    private javax.swing.JLabel titulo_placarLideres;
    // End of variables declaration//GEN-END:variables
}