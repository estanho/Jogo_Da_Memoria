
package jogo_da_memoria;

import codigo_jogo_da_memoria.Curiosidade;
import codigo_jogo_da_memoria.ManipularArquivos;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AreaAdministrativaEditarCuriosidade extends javax.swing.JFrame {

    ArrayList <Curiosidade> curiosidades = new ArrayList();
    
    ManipularArquivos arquivos = new ManipularArquivos();
    
    DefaultTableModel modeloTabela;
    
    // Construtor
    
    public AreaAdministrativaEditarCuriosidade() {
        initComponents();
        
        botao_editar.setBackground(Color.GRAY);
        
        try {
            arquivos.preencherCuriosidades(curiosidades);

            modeloTabela = (DefaultTableModel) tabela.getModel();
            
            tabela.setRowSorter(new TableRowSorter(modeloTabela));

            for(int i=0;i<curiosidades.size();i++){
                Object[] dados = {curiosidades.get(i).getNumero(), curiosidades.get(i).getElemento(),curiosidades.get(i).getCuriosidade()};
                modeloTabela.addRow(dados);
            }
                      
        } catch (IOException ex) {
            Logger.getLogger(PlacarLideres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_cartas = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        titulo_areaAdministrativa = new javax.swing.JLabel();
        botao_voltar = new javax.swing.JPanel();
        icone_botao_voltar = new javax.swing.JLabel();
        painel_tabela1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botao_criar = new javax.swing.JPanel();
        texto_criar = new javax.swing.JLabel();
        botao_editar = new javax.swing.JPanel();
        texto_editar = new javax.swing.JLabel();
        botao_excluir = new javax.swing.JPanel();
        texto_excluir = new javax.swing.JLabel();
        PainelEditarCuriosidade = new javax.swing.JPanel();
        texto_editarCuriosidade = new javax.swing.JLabel();
        texto_curiosidade = new javax.swing.JLabel();
        campo_curiosidade = new javax.swing.JTextPane();
        botao_salvar = new javax.swing.JPanel();
        texto_salvar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Memória com elementos químicos");
        setResizable(false);

        painel_cartas.setBackground(new java.awt.Color(255, 255, 255));
        painel_cartas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

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

        titulo_areaAdministrativa.setFont(new java.awt.Font("Comic Sans MS", 3, 32)); // NOI18N
        titulo_areaAdministrativa.setForeground(new java.awt.Color(0, 0, 0));
        titulo_areaAdministrativa.setText("Área Administrativa");

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

        painel_tabela1.setBackground(new java.awt.Color(255, 255, 255));
        painel_tabela1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        painel_tabela1.setFocusable(false);
        painel_tabela1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        painel_tabela1.setWheelScrollingEnabled(false);

        tabela.setBackground(new java.awt.Color(255, 255, 255));
        tabela.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Atomico", "Elemento", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setGridColor(new java.awt.Color(102, 102, 102));
        tabela.setRowHeight(30);
        tabela.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setShowGrid(true);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        painel_tabela1.setViewportView(tabela);

        botao_criar.setBackground(new java.awt.Color(255, 255, 255));
        botao_criar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_criar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_criarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_criarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_criarMouseExited(evt);
            }
        });

        texto_criar.setBackground(new java.awt.Color(0, 0, 0));
        texto_criar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        texto_criar.setForeground(new java.awt.Color(0, 0, 0));
        texto_criar.setText("Criar Curiosidade");

        javax.swing.GroupLayout botao_criarLayout = new javax.swing.GroupLayout(botao_criar);
        botao_criar.setLayout(botao_criarLayout);
        botao_criarLayout.setHorizontalGroup(
            botao_criarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_criarLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(texto_criar)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        botao_criarLayout.setVerticalGroup(
            botao_criarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto_criar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        botao_editar.setBackground(new java.awt.Color(255, 255, 255));
        botao_editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        texto_editar.setBackground(new java.awt.Color(0, 0, 0));
        texto_editar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        texto_editar.setForeground(new java.awt.Color(0, 0, 0));
        texto_editar.setText("Editar Curiosidade");

        javax.swing.GroupLayout botao_editarLayout = new javax.swing.GroupLayout(botao_editar);
        botao_editar.setLayout(botao_editarLayout);
        botao_editarLayout.setHorizontalGroup(
            botao_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_editarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_editar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botao_editarLayout.setVerticalGroup(
            botao_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        botao_excluir.setBackground(new java.awt.Color(255, 255, 255));
        botao_excluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_excluirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_excluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_excluirMouseExited(evt);
            }
        });

        texto_excluir.setBackground(new java.awt.Color(0, 0, 0));
        texto_excluir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        texto_excluir.setForeground(new java.awt.Color(0, 0, 0));
        texto_excluir.setText("Excluir Curiosidade");

        javax.swing.GroupLayout botao_excluirLayout = new javax.swing.GroupLayout(botao_excluir);
        botao_excluir.setLayout(botao_excluirLayout);
        botao_excluirLayout.setHorizontalGroup(
            botao_excluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_excluirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_excluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botao_excluirLayout.setVerticalGroup(
            botao_excluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PainelEditarCuriosidade.setBackground(new java.awt.Color(255, 255, 255));
        PainelEditarCuriosidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        PainelEditarCuriosidade.setForeground(new java.awt.Color(255, 255, 255));

        texto_editarCuriosidade.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        texto_editarCuriosidade.setForeground(new java.awt.Color(0, 0, 0));
        texto_editarCuriosidade.setText("Editar Curiosidade");

        texto_curiosidade.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        texto_curiosidade.setForeground(new java.awt.Color(0, 0, 0));
        texto_curiosidade.setText("Curiosidade");

        campo_curiosidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        campo_curiosidade.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        botao_salvar.setBackground(new java.awt.Color(255, 255, 255));
        botao_salvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_salvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_salvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_salvarMouseExited(evt);
            }
        });

        texto_salvar.setBackground(new java.awt.Color(0, 0, 0));
        texto_salvar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        texto_salvar.setForeground(new java.awt.Color(0, 0, 0));
        texto_salvar.setText("Salvar Alteração");

        javax.swing.GroupLayout botao_salvarLayout = new javax.swing.GroupLayout(botao_salvar);
        botao_salvar.setLayout(botao_salvarLayout);
        botao_salvarLayout.setHorizontalGroup(
            botao_salvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_salvarLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(texto_salvar)
                .addGap(17, 17, 17))
        );
        botao_salvarLayout.setVerticalGroup(
            botao_salvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botao_salvarLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(texto_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PainelEditarCuriosidadeLayout = new javax.swing.GroupLayout(PainelEditarCuriosidade);
        PainelEditarCuriosidade.setLayout(PainelEditarCuriosidadeLayout);
        PainelEditarCuriosidadeLayout.setHorizontalGroup(
            PainelEditarCuriosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEditarCuriosidadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_editarCuriosidade)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEditarCuriosidadeLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(PainelEditarCuriosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botao_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelEditarCuriosidadeLayout.createSequentialGroup()
                        .addComponent(texto_curiosidade)
                        .addGap(18, 18, 18)
                        .addComponent(campo_curiosidade, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(19, 19, 19))
        );
        PainelEditarCuriosidadeLayout.setVerticalGroup(
            PainelEditarCuriosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEditarCuriosidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_editarCuriosidade)
                .addGap(25, 25, 25)
                .addGroup(PainelEditarCuriosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEditarCuriosidadeLayout.createSequentialGroup()
                        .addComponent(campo_curiosidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(botao_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(PainelEditarCuriosidadeLayout.createSequentialGroup()
                        .addComponent(texto_curiosidade)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout painel_cartasLayout = new javax.swing.GroupLayout(painel_cartas);
        painel_cartas.setLayout(painel_cartasLayout);
        painel_cartasLayout.setHorizontalGroup(
            painel_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barra_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_cartasLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(titulo_areaAdministrativa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_cartasLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(painel_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_cartasLayout.createSequentialGroup()
                        .addComponent(botao_criar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PainelEditarCuriosidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel_tabela1))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        painel_cartasLayout.setVerticalGroup(
            painel_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_cartasLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painel_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_cartasLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(titulo_areaAdministrativa))
                    .addGroup(painel_cartasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(painel_tabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelEditarCuriosidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(painel_cartasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao_editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_criar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_cartas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_cartas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_criarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_criarMouseExited
        botao_criar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_criarMouseExited

    private void botao_criarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_criarMouseEntered
        botao_criar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_criarMouseEntered

    private void botao_criarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_criarMouseClicked
        new AreaAdministrativaCriarCuriosidade().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_criarMouseClicked

    private void botao_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_excluirMouseClicked
        new AreaAdministrativaExcluirCuriosidade().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_excluirMouseClicked

    private void botao_excluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_excluirMouseEntered
        botao_excluir.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_excluirMouseEntered

    private void botao_excluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_excluirMouseExited
        botao_excluir.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_excluirMouseExited

    private void botao_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltarMouseClicked
        new DefinirAreaAdministrativa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_voltarMouseClicked

    private void botao_voltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltarMouseEntered
        botao_voltar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_voltarMouseEntered

    private void botao_voltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_voltarMouseExited
        botao_voltar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_voltarMouseExited

    private void botao_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarMouseClicked
        
        if ((campo_curiosidade.getText().matches("^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ'\\s!.,:@#$%&*\\(\\)?'[0-9]]+$")&&(!"".equals(campo_curiosidade.getText())))){
        
            int curiosidadeLinha = tabela.getSelectedRow();

            Curiosidade curiosidadeEditada = new Curiosidade(Integer.parseInt(tabela.getValueAt(curiosidadeLinha,0).toString()),tabela.getValueAt(curiosidadeLinha,1).toString(),campo_curiosidade.getText());

            curiosidades.set(tabela.getSelectedRow(), curiosidadeEditada);

            try {
                arquivos.editarCuriosidade(curiosidades);
            } catch (IOException ex) {
                Logger.getLogger(AreaAdministrativaExcluirCuriosidade.class.getName()).log(Level.SEVERE, null, ex);
            }

            if(tabela.getSelectedRow() != -1){
                modeloTabela.removeRow(tabela.getSelectedRow());
            }else{
                JOptionPane.showMessageDialog(null,"Selecione uma curiosidade para Editar!");
            }

            new AreaAdministrativaEditarCuriosidade().setVisible(true);
            
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,""
                        + "Caracter Invalido!\n","Atencao", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botao_salvarMouseClicked

    private void botao_salvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarMouseEntered
        botao_salvar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_salvarMouseEntered

    private void botao_salvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarMouseExited
        botao_salvar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_salvarMouseExited

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        int curiosidadeLinha = tabela.getSelectedRow();
        campo_curiosidade.setText(modeloTabela.getValueAt(curiosidadeLinha,2).toString());
    }//GEN-LAST:event_tabelaMouseClicked

    // Main
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaAdministrativaEditarCuriosidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelEditarCuriosidade;
    private javax.swing.JPanel barra_inferior;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel botao_criar;
    private javax.swing.JPanel botao_editar;
    private javax.swing.JPanel botao_excluir;
    private javax.swing.JPanel botao_salvar;
    private javax.swing.JPanel botao_voltar;
    private javax.swing.JTextPane campo_curiosidade;
    private javax.swing.JLabel icone_botao_voltar;
    private javax.swing.JPanel painel_cartas;
    private javax.swing.JScrollPane painel_tabela1;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_criar;
    private javax.swing.JLabel texto_curiosidade;
    private javax.swing.JLabel texto_editar;
    private javax.swing.JLabel texto_editarCuriosidade;
    private javax.swing.JLabel texto_excluir;
    private javax.swing.JLabel texto_salvar;
    private javax.swing.JLabel titulo_areaAdministrativa;
    // End of variables declaration//GEN-END:variables
}