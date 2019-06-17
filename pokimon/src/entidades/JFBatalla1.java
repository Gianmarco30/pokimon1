
package entidades;

import Clases.Pokemon;
import javax.swing.JOptionPane;

public class JFBatalla1 extends javax.swing.JFrame {
    Pokemon mipokemon = new Pokemon("Squirtle");
    Pokemon rival = new Pokemon("Bulbasour");
    
    public JFBatalla1() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        jLabel10.setText(JFventanaprincipal.jTextField1.getText());
        if (JFventanaprincipal.jRadioButton1.isSelected()){
            jLabel6.setVisible(true);
            jLabel1.setVisible(false);
            
        }
        else if (JFventanaprincipal.jRadioButton2.isSelected()){
            jLabel1.setVisible(true);
            jLabel6.setVisible(false);
        }
        
        
        jTextField1.setText(mipokemon.MostrarEstado());
        jTextField2.setText(rival.MostrarEstado());
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BATALLA POKIMON");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenePokemones/ash2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenePokemones/agua.jpg"))); // NOI18N
        jLabel2.setText(" ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 120, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenePokemones/gary123.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenePokemones/hierva.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, 110));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("VS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, 20));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 70, 28));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 70, 28));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 490, 200));

        jButton1.setText("ATACAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 80, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenePokemones/MistyEP1.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Gary Oak");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Bulbasour");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton2.setText("POCIÓN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 80, -1));

        jButton3.setText("RENDIRSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 90, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/campo de batalla 1.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void AnalizarSituacion(){
        if (mipokemon.vida == 0 || rival.vida == 0){
            if (mipokemon.vida == 0){
            jTextArea1.append(mipokemon.nombre + " ya no puede continuar " + rival.nombre + " gana ");
            JOptionPane.showMessageDialog(null,rival.nombre + " gano la batalla");
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            
            
            }
            else if (rival.vida == 0){
                jTextArea1.append(rival.nombre + " ya no puede continuar " + mipokemon.nombre + " gana ");
                JOptionPane.showMessageDialog(null, mipokemon.nombre + " gano la batalla");

                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
            }
           
            JFFinal marco = new JFFinal();
            marco.setVisible(true);
            JFFinal.jLabel3.setVisible(false);
            if (mipokemon.vida == 0){
                JFFinal.jLabel4.setVisible(true);
                JFFinal.jLabel5.setVisible(false);
                 dispose();
            }
            else if (rival.vida == 0){
                JFFinal.jLabel4.setVisible(false);
                JFFinal.jLabel5.setVisible(true);
                dispose();
            }
        }
            
        
        
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed
    int cont = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mipokemon.nombre = jLabel7.getText();
        mipokemon.ataque = (int)(Math.random()*5+5);
        mipokemon.esqui = 15;
        mipokemon.critic = 2;
        String resultado = mipokemon.Atacar(rival);
        jTextArea1.append(resultado + "\n");
        
        int pos = (int)(Math.random()*100);
        
        if (cont < 3){
            if (pos < 25 && rival.vida <= 40){
                String resultado2 = rival.UsarPocion(rival);
                jTextArea1.append(resultado2 + "\n");
                cont = cont + 1;
            }
            else{
                rival.ataque = (int)(Math.random()*5+7);
                rival.esqui = 20;
                rival.critic = 3;
                String resultado2 = rival.Atacar(mipokemon);
                jTextArea1.append(resultado2 + "\n");
            }
        }
        else {
            rival.ataque = (int)(Math.random()*5+7);
            rival.esqui = 20;
            rival.critic = 3;
            String resultado2 = rival.Atacar(mipokemon);
            jTextArea1.append(resultado2 + "\n");
        }
        
        
        jTextField1.setText(mipokemon.MostrarEstado());
        jTextField2.setText(rival.MostrarEstado());
        
        AnalizarSituacion();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    int Mipocion = 0;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String resultado = mipokemon.UsarPocion(mipokemon);
        jTextArea1.append(resultado + "\n");
        Mipocion = Mipocion + 1;
        if (Mipocion == 3){
            jButton2.setEnabled(false);
        }
        int pos = (int)(Math.random()*100);
        
        if (cont < 3){
            if (pos < 40 && rival.vida <= 30){
                String resultado2 = rival.UsarPocion(rival);
                jTextArea1.append(resultado2 + "\n");
                cont = cont + 1;
            }
            
            else{
                rival.ataque = (int)(Math.random()*5+7);
                rival.esqui = 20;
                rival.critic = 3;
                String resultado2 = rival.Atacar(mipokemon);
                jTextArea1.append(resultado2 + "\n");
            }
        }
        else {
            rival.ataque = (int)(Math.random()*5+7);
            rival.esqui = 20;
            rival.critic = 3;
            String resultado2 = rival.Atacar(mipokemon);
            jTextArea1.append(resultado2 + "\n");
        }
        
        jTextField1.setText(mipokemon.MostrarEstado());
        jTextField2.setText(rival.MostrarEstado());
        
        AnalizarSituacion();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,(mipokemon.nombre + " se rindio"));
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        JFFinal marco = new JFFinal();
        marco.setVisible(true);
        JFFinal.jLabel3.setVisible(false);
        JFFinal.jLabel4.setVisible(true);
        JFFinal.jLabel5.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JFBatalla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFBatalla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFBatalla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFBatalla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFBatalla1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
