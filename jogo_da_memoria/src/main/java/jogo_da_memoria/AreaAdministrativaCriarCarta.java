
package jogo_da_memoria;

import codigo_jogo_da_memoria.Carta;
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


public class AreaAdministrativaCriarCarta extends javax.swing.JFrame {

    ArrayList <Carta> cartas = new ArrayList();
    ArrayList <Carta> todosElementos = new ArrayList();
    ArrayList <Carta> cartasAux = new ArrayList();
    
    ManipularArquivos arquivos = new ManipularArquivos();
    
    DefaultTableModel modeloTabela;
    
    // Construtor
    
    public AreaAdministrativaCriarCarta() {
        initComponents();
        
        ImageIcon img = new ImageIcon("icones/icone_janela.png");
        
        setIconImage(img.getImage());
        
        setSize(680, 700);
        setLocationRelativeTo(null); 
        
        botao_criar.setBackground(Color.GRAY);
        
        try {
            arquivos.preencherCartas(cartas);
            arquivos.preencherTodasCartas(todosElementos);

            modeloTabela = (DefaultTableModel) tabela.getModel();
            
            tabela.setRowSorter(new TableRowSorter(modeloTabela));

            for(int i=0;i<cartas.size();i++){
                Object[] dados = {cartas.get(i).getNumero(),cartas.get(i).getElemento()};
                modeloTabela.addRow(dados);
            }
            
            cartasAux = todosElementos;
            
            for(int i=0;i<todosElementos.size();i++){
                for(int x=0;x<cartas.size();x++){
                    if(todosElementos.get(i).getNumero() == cartas.get(x).getNumero()){
                        cartasAux.remove(i);
                    }
                }
            }
            
            
            for(int i=0;i<cartasAux.size();i++){
                campo_elemento.addItem(cartasAux.get(i).getNumero()+" - "+cartasAux.get(i).getElemento());
            }
            
            botao_criar.setBackground(Color.GRAY);
             
        } catch (IOException ex) {
            Logger.getLogger(PlacarLideres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_curiosidades = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        titulo_areaAdministrativa = new javax.swing.JLabel();
        botao_voltar = new javax.swing.JPanel();
        icone_botao_voltar = new javax.swing.JLabel();
        painel_tabela = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botao_criar = new javax.swing.JPanel();
        texto_criar = new javax.swing.JLabel();
        botao_excluir = new javax.swing.JPanel();
        texto_excluir = new javax.swing.JLabel();
        PainelCriarCuriosidade = new javax.swing.JPanel();
        texto_criarCarta = new javax.swing.JLabel();
        texto_curiosidade = new javax.swing.JLabel();
        campo_curiosidade = new javax.swing.JTextPane();
        botao_salvar = new javax.swing.JPanel();
        texto_salvar = new javax.swing.JLabel();
        campo_elemento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Memória com elementos químicos");
        setResizable(false);

        painel_curiosidades.setBackground(new java.awt.Color(255, 255, 255));
        painel_curiosidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

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
                "Nº Atomico", "Elemento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
        painel_tabela.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
        }

        botao_criar.setBackground(new java.awt.Color(255, 255, 255));
        botao_criar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        texto_criar.setBackground(new java.awt.Color(0, 0, 0));
        texto_criar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        texto_criar.setForeground(new java.awt.Color(0, 0, 0));
        texto_criar.setText("Criar Carta");

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
        texto_excluir.setText("Excluir Carta");

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

        PainelCriarCuriosidade.setBackground(new java.awt.Color(255, 255, 255));
        PainelCriarCuriosidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        PainelCriarCuriosidade.setForeground(new java.awt.Color(255, 255, 255));

        texto_criarCarta.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        texto_criarCarta.setForeground(new java.awt.Color(0, 0, 0));
        texto_criarCarta.setText("Criar Carta");

        texto_curiosidade.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        texto_curiosidade.setForeground(new java.awt.Color(0, 0, 0));
        texto_curiosidade.setText("Curiosidade");

        campo_curiosidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

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
        texto_salvar.setText("Salvar Carta");

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

        campo_elemento.setBackground(new java.awt.Color(255, 255, 255));
        campo_elemento.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        campo_elemento.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PainelCriarCuriosidadeLayout = new javax.swing.GroupLayout(PainelCriarCuriosidade);
        PainelCriarCuriosidade.setLayout(PainelCriarCuriosidadeLayout);
        PainelCriarCuriosidadeLayout.setHorizontalGroup(
            PainelCriarCuriosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCriarCuriosidadeLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(PainelCriarCuriosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCriarCuriosidadeLayout.createSequentialGroup()
                        .addComponent(campo_elemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(texto_criarCarta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCriarCuriosidadeLayout.createSequentialGroup()
                        .addGroup(PainelCriarCuriosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botao_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelCriarCuriosidadeLayout.createSequentialGroup()
                                .addComponent(texto_curiosidade)
                                .addGap(18, 18, 18)
                                .addComponent(campo_curiosidade, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(19, 19, 19))))
        );
        PainelCriarCuriosidadeLayout.setVerticalGroup(
            PainelCriarCuriosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCriarCuriosidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCriarCuriosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_criarCarta)
                    .addComponent(campo_elemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PainelCriarCuriosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCriarCuriosidadeLayout.createSequentialGroup()
                        .addComponent(campo_curiosidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(botao_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(PainelCriarCuriosidadeLayout.createSequentialGroup()
                        .addComponent(texto_curiosidade)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout painel_curiosidadesLayout = new javax.swing.GroupLayout(painel_curiosidades);
        painel_curiosidades.setLayout(painel_curiosidadesLayout);
        painel_curiosidadesLayout.setHorizontalGroup(
            painel_curiosidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barra_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_curiosidadesLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(titulo_areaAdministrativa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_curiosidadesLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(painel_curiosidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painel_tabela)
                    .addGroup(painel_curiosidadesLayout.createSequentialGroup()
                        .addComponent(botao_criar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PainelCriarCuriosidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        painel_curiosidadesLayout.setVerticalGroup(
            painel_curiosidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_curiosidadesLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painel_curiosidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_curiosidadesLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(titulo_areaAdministrativa))
                    .addGroup(painel_curiosidadesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(painel_tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelCriarCuriosidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(painel_curiosidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao_criar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_curiosidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_curiosidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_excluirMouseClicked
        new AreaAdministrativaExcluirCarta().setVisible(true);
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
        ManipularArquivos arquivos = new ManipularArquivos();
              
        try {
          
            if ((campo_curiosidade.getText().matches("^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ'\\s!.,:@#$%&*\\(\\)?'[0-9]]+$")&&(!"".equals(campo_curiosidade.getText())))){
                
                String[] dados_elemento = campo_elemento.getSelectedItem().toString().split(" - ");
                
                arquivos.salvarNovaCarta(Integer.valueOf(dados_elemento[0]),dados_elemento[1],campo_curiosidade.getText());
                
                Object[] dados = {dados_elemento[0],dados_elemento[1],campo_curiosidade.getText()};
                
                modeloTabela.addRow(dados);
                
                campo_curiosidade.setText("");
                
                JOptionPane.showMessageDialog(null,""
                            + "Carta cadastrada com sucesso!\n","Cadastro", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,""
                            + "Caracter Invalido!\n","Atencao", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(InserirNomePlacar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botao_salvarMouseClicked

    private void botao_salvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarMouseEntered
        botao_salvar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_salvarMouseEntered

    private void botao_salvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarMouseExited
        botao_salvar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_salvarMouseExited

    // Main

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaAdministrativaCriarCarta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCriarCuriosidade;
    private javax.swing.JPanel barra_inferior;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel botao_criar;
    private javax.swing.JPanel botao_excluir;
    private javax.swing.JPanel botao_salvar;
    private javax.swing.JPanel botao_voltar;
    private javax.swing.JTextPane campo_curiosidade;
    private javax.swing.JComboBox<String> campo_elemento;
    private javax.swing.JLabel icone_botao_voltar;
    private javax.swing.JPanel painel_curiosidades;
    private javax.swing.JScrollPane painel_tabela;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_criar;
    private javax.swing.JLabel texto_criarCarta;
    private javax.swing.JLabel texto_curiosidade;
    private javax.swing.JLabel texto_excluir;
    private javax.swing.JLabel texto_salvar;
    private javax.swing.JLabel titulo_areaAdministrativa;
    // End of variables declaration//GEN-END:variables
}