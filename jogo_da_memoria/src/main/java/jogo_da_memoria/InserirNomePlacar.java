
package jogo_da_memoria;

import codigo_jogo_da_memoria.ManipularArquivos;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InserirNomePlacar extends javax.swing.JFrame {

    static String dificuldade;
    static int pontos;
    static int rodada;
    
    // Main
    
    public InserirNomePlacar(int pontosJogador, int rodadasJogador, String dificuldadeJogador) {
        initComponents();
        
        ImageIcon img = new ImageIcon("icones/icone_janela.png");
        
        setIconImage(img.getImage());
        
        setSize(640, 640);
        setLocationRelativeTo(null); 
        
        this.pontos = pontosJogador;
        this.rodada = rodadasJogador;
        this.dificuldade = dificuldadeJogador;
        
        texto_pontos.setText("Pontos: "+ pontosJogador);
        texto_rodada.setText("Rodada: "+ rodadasJogador);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_InserirNomePlacar = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        titulo_inserirNomePlacar = new javax.swing.JLabel();
        texto_nome = new javax.swing.JLabel();
        campo_nome = new javax.swing.JTextField();
        texto_pontos = new javax.swing.JLabel();
        texto_rodada = new javax.swing.JLabel();
        botao_cancelar = new javax.swing.JPanel();
        texto_cancelar = new javax.swing.JLabel();
        botao_salvarNome = new javax.swing.JPanel();
        texto_salvarNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Memória com elementos químicos");
        setResizable(false);

        painel_InserirNomePlacar.setBackground(new java.awt.Color(255, 255, 255));
        painel_InserirNomePlacar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

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

        titulo_inserirNomePlacar.setFont(new java.awt.Font("Comic Sans MS", 3, 32)); // NOI18N
        titulo_inserirNomePlacar.setForeground(new java.awt.Color(0, 0, 0));
        titulo_inserirNomePlacar.setText("Inserir nome no Placar de Lideres");

        texto_nome.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        texto_nome.setForeground(new java.awt.Color(0, 0, 0));
        texto_nome.setText("Nome");

        campo_nome.setBackground(new java.awt.Color(255, 255, 255));
        campo_nome.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        campo_nome.setForeground(new java.awt.Color(0, 0, 0));
        campo_nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        campo_nome.setCaretColor(new java.awt.Color(0, 0, 0));
        campo_nome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campo_nome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_nome.setRequestFocusEnabled(false);
        campo_nome.setSelectionColor(new java.awt.Color(0, 0, 0));

        texto_pontos.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        texto_pontos.setForeground(new java.awt.Color(0, 0, 0));
        texto_pontos.setText("Pontos:");

        texto_rodada.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        texto_rodada.setForeground(new java.awt.Color(0, 0, 0));
        texto_rodada.setText("Rodada:");

        botao_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        botao_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_cancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_cancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_cancelarMouseExited(evt);
            }
        });

        texto_cancelar.setBackground(new java.awt.Color(0, 0, 0));
        texto_cancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_cancelar.setForeground(new java.awt.Color(0, 0, 0));
        texto_cancelar.setText("Cancelar");

        javax.swing.GroupLayout botao_cancelarLayout = new javax.swing.GroupLayout(botao_cancelar);
        botao_cancelar.setLayout(botao_cancelarLayout);
        botao_cancelarLayout.setHorizontalGroup(
            botao_cancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_cancelarLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(texto_cancelar)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        botao_cancelarLayout.setVerticalGroup(
            botao_cancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_cancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        botao_salvarNome.setBackground(new java.awt.Color(255, 255, 255));
        botao_salvarNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_salvarNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_salvarNomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_salvarNomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_salvarNomeMouseExited(evt);
            }
        });

        texto_salvarNome.setBackground(new java.awt.Color(0, 0, 0));
        texto_salvarNome.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        texto_salvarNome.setForeground(new java.awt.Color(0, 0, 0));
        texto_salvarNome.setText("Salvar Nome");

        javax.swing.GroupLayout botao_salvarNomeLayout = new javax.swing.GroupLayout(botao_salvarNome);
        botao_salvarNome.setLayout(botao_salvarNomeLayout);
        botao_salvarNomeLayout.setHorizontalGroup(
            botao_salvarNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_salvarNomeLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(texto_salvarNome)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        botao_salvarNomeLayout.setVerticalGroup(
            botao_salvarNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_salvarNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_salvarNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painel_InserirNomePlacarLayout = new javax.swing.GroupLayout(painel_InserirNomePlacar);
        painel_InserirNomePlacar.setLayout(painel_InserirNomePlacarLayout);
        painel_InserirNomePlacarLayout.setHorizontalGroup(
            painel_InserirNomePlacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_InserirNomePlacarLayout.createSequentialGroup()
                .addGroup(painel_InserirNomePlacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_InserirNomePlacarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(botao_salvarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_InserirNomePlacarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_pontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(texto_rodada, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(painel_InserirNomePlacarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(texto_nome)
                .addGap(34, 34, 34)
                .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_InserirNomePlacarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo_inserirNomePlacar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_InserirNomePlacarLayout.setVerticalGroup(
            painel_InserirNomePlacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_InserirNomePlacarLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(titulo_inserirNomePlacar)
                .addGap(64, 64, 64)
                .addGroup(painel_InserirNomePlacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_nome))
                .addGap(75, 75, 75)
                .addGroup(painel_InserirNomePlacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_pontos)
                    .addComponent(texto_rodada))
                .addGap(64, 64, 64)
                .addGroup(painel_InserirNomePlacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_salvarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_InserirNomePlacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_InserirNomePlacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cancelarMouseExited
        botao_cancelar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_cancelarMouseExited

    private void botao_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cancelarMouseEntered
        botao_cancelar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_cancelarMouseEntered

    private void botao_salvarNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarNomeMouseExited
        botao_salvarNome.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_salvarNomeMouseExited

    private void botao_salvarNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarNomeMouseEntered
        botao_salvarNome.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_salvarNomeMouseEntered

    private void botao_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cancelarMouseClicked
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_cancelarMouseClicked

    private void botao_salvarNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_salvarNomeMouseClicked
        ManipularArquivos arquivos = new ManipularArquivos();
        try {
            
            if ((campo_nome.getText().matches("^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ'\\s!.,:@#$%&*\\(\\)?'[0-9]]+$*")&&(!"".equals(campo_nome.getText())))){
                arquivos.salvarNovoJogador(campo_nome.getText(), pontos, rodada, dificuldade);
                JOptionPane.showMessageDialog(null,""
                            + "Jogador Cadastrado com sucesso!\n","Cadastro", JOptionPane.WARNING_MESSAGE);
                new MenuPrincipal().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,""
                            + "Os caracteres validos são somente letras e numeros!\n","Atencao", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(InserirNomePlacar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botao_salvarNomeMouseClicked

    // Main
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirNomePlacar( pontos, rodada, dificuldade).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_inferior;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel botao_cancelar;
    private javax.swing.JPanel botao_salvarNome;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JPanel painel_InserirNomePlacar;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_cancelar;
    private javax.swing.JLabel texto_nome;
    private javax.swing.JLabel texto_pontos;
    private javax.swing.JLabel texto_rodada;
    private javax.swing.JLabel texto_salvarNome;
    private javax.swing.JLabel titulo_inserirNomePlacar;
    // End of variables declaration//GEN-END:variables
}