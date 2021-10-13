
package jogo_da_memoria;

import codigo_jogo_da_memoria.Curiosidade;
import codigo_jogo_da_memoria.ManipularArquivos;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaCuriosidade extends javax.swing.JDialog {

    LayoutFacil janelaPaiFacil;
    LayoutMedio janelaPaiMedio;
    LayoutDificil janelaPaiDificil;
    
    ArrayList <Curiosidade> curiosidades = new ArrayList();
    ArrayList <Curiosidade> curiosidadesSelecionadas = new ArrayList();
    
    ManipularArquivos arquivos = new ManipularArquivos();
    
    // Construtor
    
    public TelaCuriosidade(java.awt.Frame parent, boolean modal, LayoutFacil janelaFacil, LayoutMedio janelaMedio, LayoutDificil janelaDificil) throws IOException {
        
        super(parent, modal);
        initComponents();
        
        arquivos.preencherCuriosidades(curiosidades);
        
        Random r = new Random();
        
        if(janelaFacil != null){
            String[] dados = janelaFacil.C2Icon.split(".png");
            
            for(int i=0;i<curiosidades.size();i++){
                if(curiosidades.get(i).getNumero() == Integer.valueOf(dados[0])){
                    curiosidadesSelecionadas.add(curiosidades.get(i));
                }
            }
            
            Curiosidade curiosidadeSorteada = curiosidadesSelecionadas.get(r.nextInt(curiosidadesSelecionadas.size()));
            
            texto_curiosidade.setText(curiosidadeSorteada.getCuriosidade());
            
            janelaPaiFacil = janelaFacil;
            
        }else if(janelaMedio != null) {
            String[] dados = janelaMedio.C2Icon.split(".png");
            
            for(int i=0;i<curiosidades.size();i++){
                if(curiosidades.get(i).getNumero() == Integer.valueOf(dados[0])){
                    curiosidadesSelecionadas.add(curiosidades.get(i));
                }
            }
            
            Curiosidade curiosidadeSorteada = curiosidadesSelecionadas.get(r.nextInt(curiosidadesSelecionadas.size()));
            
            System.out.println(curiosidadeSorteada);
            texto_curiosidade.setText(curiosidadeSorteada.getCuriosidade());
            
            janelaPaiMedio = janelaMedio;
        }else if(janelaDificil != null) {
            String[] dados = janelaDificil.C2Icon.split(".png");
            
            for(int i=0;i<curiosidades.size();i++){
                if(curiosidades.get(i).getNumero() == Integer.valueOf(dados[0])){
                    curiosidadesSelecionadas.add(curiosidades.get(i));
                }
            }
            
            Curiosidade curiosidadeSorteada = curiosidadesSelecionadas.get(r.nextInt(curiosidadesSelecionadas.size()));
            
            System.out.println(curiosidadeSorteada);
            texto_curiosidade.setText(curiosidadeSorteada.getCuriosidade());
            
            janelaPaiDificil = janelaDificil;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_curiosidade = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        titulo_curiosidade = new javax.swing.JLabel();
        botao_continuar = new javax.swing.JPanel();
        texto_botao_continuar = new javax.swing.JLabel();
        texto_curiosidade = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        painel_curiosidade.setBackground(new java.awt.Color(255, 255, 255));
        painel_curiosidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

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

        titulo_curiosidade.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        titulo_curiosidade.setForeground(new java.awt.Color(0, 0, 0));
        titulo_curiosidade.setText("Curiosidade");

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
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(texto_botao_continuar)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        botao_continuarLayout.setVerticalGroup(
            botao_continuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(texto_botao_continuar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        texto_curiosidade.setBorder(null);
        texto_curiosidade.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        texto_curiosidade.setForeground(new java.awt.Color(0, 0, 0));
        texto_curiosidade.setFocusable(false);
        texto_curiosidade.setOpaque(false);

        javax.swing.GroupLayout painel_curiosidadeLayout = new javax.swing.GroupLayout(painel_curiosidade);
        painel_curiosidade.setLayout(painel_curiosidadeLayout);
        painel_curiosidadeLayout.setHorizontalGroup(
            painel_curiosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_curiosidadeLayout.createSequentialGroup()
                .addGroup(painel_curiosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painel_curiosidadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botao_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painel_curiosidadeLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(titulo_curiosidade)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painel_curiosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel_curiosidadeLayout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(texto_curiosidade, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(123, Short.MAX_VALUE)))
        );
        painel_curiosidadeLayout.setVerticalGroup(
            painel_curiosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_curiosidadeLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(titulo_curiosidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(botao_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painel_curiosidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel_curiosidadeLayout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(texto_curiosidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(125, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_curiosidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_curiosidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_continuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_continuarMouseExited
        botao_continuar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_continuarMouseExited

    private void botao_continuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_continuarMouseEntered
        botao_continuar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_continuarMouseEntered

    private void botao_continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_continuarMouseClicked

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
    }//GEN-LAST:event_botao_continuarMouseClicked

    // Main
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCuriosidade dialog = null;

                try {
                    dialog = new TelaCuriosidade(new javax.swing.JFrame(), true, new LayoutFacil(),new LayoutMedio(),new LayoutDificil());
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaCuriosidade.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaCuriosidade.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JPanel painel_curiosidade;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_botao_continuar;
    private javax.swing.JTextPane texto_curiosidade;
    private javax.swing.JLabel titulo_curiosidade;
    // End of variables declaration//GEN-END:variables
}
