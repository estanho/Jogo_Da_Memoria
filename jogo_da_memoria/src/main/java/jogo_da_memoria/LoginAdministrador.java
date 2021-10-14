
package jogo_da_memoria;

import java.awt.Color;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginAdministrador extends javax.swing.JDialog {

    MenuPrincipal janelaPaiMenu;
    
    // Construtor
    
    public LoginAdministrador(java.awt.Frame parent, boolean modal, MenuPrincipal janelaMenu) {
        super(parent, modal);
        
        janelaPaiMenu = janelaMenu;
        
        initComponents();
        
        ImageIcon img = new ImageIcon("icones/icone_janela.png");
        
        setIconImage(img.getImage());
        
        setSize(548, 358);
        setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_MenuPause = new javax.swing.JPanel();
        barra_inferior = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        texto_barra_superior = new javax.swing.JLabel();
        botao_acessar = new javax.swing.JPanel();
        texto_botao_acessar = new javax.swing.JLabel();
        titulo_acesso = new javax.swing.JLabel();
        titulo_senha = new javax.swing.JLabel();
        botao_cancelar = new javax.swing.JPanel();
        texto_botao_cancelar = new javax.swing.JLabel();
        campo_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painel_MenuPause.setBackground(new java.awt.Color(255, 255, 255));
        painel_MenuPause.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        barra_inferior.setBackground(new java.awt.Color(255, 255, 255));
        barra_inferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout barra_inferiorLayout = new javax.swing.GroupLayout(barra_inferior);
        barra_inferior.setLayout(barra_inferiorLayout);
        barra_inferiorLayout.setHorizontalGroup(
            barra_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
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

        botao_acessar.setBackground(new java.awt.Color(255, 255, 255));
        botao_acessar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botao_acessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_acessarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_acessarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_acessarMouseExited(evt);
            }
        });

        texto_botao_acessar.setBackground(new java.awt.Color(0, 0, 0));
        texto_botao_acessar.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        texto_botao_acessar.setForeground(new java.awt.Color(0, 0, 0));
        texto_botao_acessar.setText("Acessar");

        javax.swing.GroupLayout botao_acessarLayout = new javax.swing.GroupLayout(botao_acessar);
        botao_acessar.setLayout(botao_acessarLayout);
        botao_acessarLayout.setHorizontalGroup(
            botao_acessarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_acessarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_acessar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botao_acessarLayout.setVerticalGroup(
            botao_acessarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_acessarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_acessar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        titulo_acesso.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        titulo_acesso.setForeground(new java.awt.Color(0, 0, 0));
        titulo_acesso.setText("Acesso:");

        titulo_senha.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        titulo_senha.setForeground(new java.awt.Color(0, 0, 0));
        titulo_senha.setText("Senha");

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

        texto_botao_cancelar.setBackground(new java.awt.Color(0, 0, 0));
        texto_botao_cancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        texto_botao_cancelar.setForeground(new java.awt.Color(0, 0, 0));
        texto_botao_cancelar.setText("Cancelar");

        javax.swing.GroupLayout botao_cancelarLayout = new javax.swing.GroupLayout(botao_cancelar);
        botao_cancelar.setLayout(botao_cancelarLayout);
        botao_cancelarLayout.setHorizontalGroup(
            botao_cancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_cancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botao_cancelarLayout.setVerticalGroup(
            botao_cancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botao_cancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto_botao_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        campo_senha.setBackground(new java.awt.Color(255, 255, 255));
        campo_senha.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        campo_senha.setForeground(new java.awt.Color(0, 0, 0));
        campo_senha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout painel_MenuPauseLayout = new javax.swing.GroupLayout(painel_MenuPause);
        painel_MenuPause.setLayout(painel_MenuPauseLayout);
        painel_MenuPauseLayout.setHorizontalGroup(
            painel_MenuPauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel_MenuPauseLayout.createSequentialGroup()
                .addGroup(painel_MenuPauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_MenuPauseLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(titulo_acesso))
                    .addGroup(painel_MenuPauseLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(painel_MenuPauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painel_MenuPauseLayout.createSequentialGroup()
                                .addComponent(botao_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botao_acessar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_MenuPauseLayout.createSequentialGroup()
                                .addComponent(titulo_senha)
                                .addGap(18, 18, 18)
                                .addComponent(campo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPauseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(barra_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painel_MenuPauseLayout.setVerticalGroup(
            painel_MenuPauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_MenuPauseLayout.createSequentialGroup()
                .addComponent(barra_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo_acesso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(painel_MenuPauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_MenuPauseLayout.createSequentialGroup()
                        .addComponent(titulo_senha)
                        .addGap(49, 49, 49)
                        .addGroup(painel_MenuPauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_acessar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(campo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
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
            .addComponent(painel_MenuPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_acessarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_acessarMouseExited
        botao_acessar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_acessarMouseExited

    private void botao_acessarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_acessarMouseEntered
        botao_acessar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_acessarMouseEntered

    private void botao_acessarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_acessarMouseClicked
        
        if ("40bd001563085fc35165329ea1ff5c5ecbdbbeef".equals(gerarHash(campo_senha.getText()))){
                
                JOptionPane.showMessageDialog(null,""
                            + "Login realizado com sucesso!\n","Login", JOptionPane.WARNING_MESSAGE);
                
                this.dispose();
                janelaPaiMenu.dispose();
                new DefinirAreaAdministrativa().setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null,""
                            + "Senha incorreta!\n","Atencao", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_botao_acessarMouseClicked

    private void botao_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_botao_cancelarMouseClicked

    private void botao_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cancelarMouseEntered
        botao_cancelar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botao_cancelarMouseEntered

    private void botao_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_cancelarMouseExited
        botao_cancelar.setBackground(Color.WHITE);
    }//GEN-LAST:event_botao_cancelarMouseExited

    // Main
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginAdministrador dialog = new LoginAdministrador(new javax.swing.JFrame(), true,new MenuPrincipal());
                
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
    
    // Funções
    
    public static String gerarHash(String senha){
        String hexa=null;
        try {
            MessageDigest m = MessageDigest.getInstance("sha-1");
            m.update( senha.getBytes(), 0 , senha.length() );
            byte[] digest = m.digest();           
            hexa= new BigInteger(1,digest).toString(16);
            return hexa;            
        }catch(NoSuchAlgorithmException e){}
        return hexa;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_inferior;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel botao_acessar;
    private javax.swing.JPanel botao_cancelar;
    private javax.swing.JPasswordField campo_senha;
    private javax.swing.JPanel painel_MenuPause;
    private javax.swing.JLabel texto_barra_superior;
    private javax.swing.JLabel texto_botao_acessar;
    private javax.swing.JLabel texto_botao_cancelar;
    private javax.swing.JLabel titulo_acesso;
    private javax.swing.JLabel titulo_senha;
    // End of variables declaration//GEN-END:variables
}
