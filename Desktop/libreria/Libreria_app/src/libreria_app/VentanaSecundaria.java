/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria_app;

import javax.swing.JOptionPane;

/**
 *
 * @author manolo
 */
public class VentanaSecundaria extends javax.swing.JFrame {

    /**
     * Creates new form VentanaSecundaria
     */
    public VentanaSecundaria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ingresolibro = new javax.swing.JButton();
        modificarlibro = new javax.swing.JButton();
        eliminarlibro = new javax.swing.JButton();
        mostrarlibro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Administración Libreria");

        ingresolibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/110765-glowing-green-neon-icon-alphanumeric-plus-sign-simple-36x36.png"))); // NOI18N
        ingresolibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresolibroActionPerformed(evt);
            }
        });

        modificarlibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar_cv.gif"))); // NOI18N
        modificarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarlibroActionPerformed(evt);
            }
        });

        eliminarlibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cleanhaven.png"))); // NOI18N
        eliminarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarlibroActionPerformed(evt);
            }
        });

        mostrarlibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarAbonados.png"))); // NOI18N
        mostrarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarlibroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Ingresar Libro:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Modificar Libro:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Eliminar Libro:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Mostrar Libro:");

        salir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Sesión:");

        sesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sesion.setForeground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(ingresolibro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(eliminarlibro, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mostrarlibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modificarlibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(ingresolibro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modificarlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(eliminarlibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(salir)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarlibroActionPerformed
        // TODO add your handling code here:
      MostrarLibro v = new MostrarLibro();
      v.setLocationRelativeTo(null);
      v.setVisible(true);
    }//GEN-LAST:event_mostrarlibroActionPerformed

    private void eliminarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarlibroActionPerformed
        // TODO add your handling code here:
        VentanaEliminar v = new VentanaEliminar();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_eliminarlibroActionPerformed

    private void modificarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarlibroActionPerformed
        // TODO add your handling code here:
        VentanaModLibro v= new VentanaModLibro();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_modificarlibroActionPerformed

    private void ingresolibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresolibroActionPerformed
            // TODO add your handling code here:
       VentanaRegistroLibro v =  new VentanaRegistroLibro(); 
       v.sesion.setText(this.sesion.getText());
       v.setLocationRelativeTo(null);
       v.setVisible(true);
    }//GEN-LAST:event_ingresolibroActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       int respuesta = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir del sistema?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0){  // TODO add your handling code here:
       System.exit(0);}
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSecundaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarlibro;
    private javax.swing.JButton ingresolibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton modificarlibro;
    private javax.swing.JButton mostrarlibro;
    private javax.swing.JButton salir;
    public javax.swing.JLabel sesion;
    // End of variables declaration//GEN-END:variables
}
