/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package linguagensac2.views;

/**
 *
 * @author Fernando
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
        telaPrincipal login = new telaPrincipal();
        new Thread(){
            public void run(){
                try{
                    for (int i = 0; i <= 100; i++){
                        Thread.sleep(75);
                        lblPorcento.setText(i + "%");
                        if (i <=25){
                            lblLegenda.setText("Carregando sistema...");
                        } else if (i <=50){
                            lblLegenda.setText("Carregando banco de dados...");
                        } else if (i <=75){
                            lblLegenda.setText("Carregando tabelas...");
                        } else if (i <=99){
                            lblLegenda.setText("Inicializando o sistema...");
                        } else {
                            dispose();
                            login.setVisible(true);
                        }
                    }       
                } catch(InterruptedException ex){
                }
            }
        }.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPorcento = new javax.swing.JLabel();
        lblLegenda = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(570, 330));
        setMinimumSize(new java.awt.Dimension(570, 330));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lblPorcento.setForeground(new java.awt.Color(255, 255, 255));
        lblPorcento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcento.setText("0%");
        getContentPane().add(lblPorcento);
        lblPorcento.setBounds(200, 180, 140, 16);

        lblLegenda.setForeground(new java.awt.Color(255, 255, 255));
        lblLegenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLegenda.setText("0%");
        getContentPane().add(lblLegenda);
        lblLegenda.setBounds(170, 200, 200, 16);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1490.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 220, 60, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/controltechcolor_resized_resized.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 565, 300);

        setSize(new java.awt.Dimension(581, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLegenda;
    private javax.swing.JLabel lblPorcento;
    // End of variables declaration//GEN-END:variables
}