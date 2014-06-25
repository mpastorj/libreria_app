/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria_app;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Recabarren
 */

public class VentanaModLibro extends javax.swing.JFrame {
    
    public static Integer codigo;
    
    public VentanaModLibro() {
        initComponents();
         
          try {
            // TODO add your handling code here:
            conexion cn= new conexion();
            cn.setEsSelect(true);
            cn.setComandoSQL("select titulo as user from libro");
            cn.conectar();
            
            while(cn.getRst().next()){
               combo.addItem(cn.getRst().getObject("user"));
            }
            
            
            cn.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
          
         
      
       
        
        
        
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
        atras = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        titulo = new javax.swing.JTextField();
        edicion = new javax.swing.JTextField();
        editorial = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        libro = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Modificar");

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        titulo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        titulo.setEnabled(false);
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        edicion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        edicion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        edicion.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Titulo");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Edicion");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Nombre Editorial");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono Editorial");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Dirección Editorial");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Nombre Autor");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Fecha Nacimiento Autor");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Categoria Libro");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Estado Libro");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setText("Genero Libro");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setText("Año impresion");

        libro.setText(" ");

        combo.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        combo.setToolTipText("");
        combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboMouseClicked(evt);
            }
        });
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel13.setText("Precio");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel14.setText("Libro: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15)
                                .addGap(70, 70, 70)
                                .addComponent(sesion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(libro, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(atras))
                                .addGap(18, 18, 18)
                                .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11)
                                    .addComponent(jTextField10)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField5)
                                    .addComponent(autor)
                                    .addComponent(editorial)
                                    .addComponent(edicion)
                                    .addComponent(titulo))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(libro)
                    .addComponent(jLabel15)
                    .addComponent(sesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(atras)
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
          String title = titulo.getText();
          String ed = edicion.getText();
          String nombre = editorial.getText();
          String telefono = autor.getText();
          String direccion =  jTextField5.getText();
          String autnombre =  jTextField6.getText();
          String nacion=jTextField7.getText();
          String cat =jTextField8.getText();
          String estado = jTextField9.getText();
          String genombre = jTextField10.getText();
          String año=  jTextField11.getText();
          String precio = jTextField1.getText();
        
          conexion cn= new conexion();
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Realmente desea modificar este libro?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0){
            cn.setEsSelect(false);
            cn.setComandoSQL("update  libro set titulo='"+title+"',edicion='"+ed+"' where codigo_libro='"+codigo+"'");
            cn.conectar();
            cn.setComandoSQL("update  editorial set nombre='"+nombre+"',telefono='"+telefono+"',direccion='"+direccion+"' where cod_libro='"+codigo+"'");
            cn.conectar();
            cn.setComandoSQL("update  autor set nombre='"+autnombre+"',nacionalidad='"+nacion+"' where cod_libro='"+codigo+"'");
            cn.conectar();
            cn.setComandoSQL("update  categoria set nombre_categoria='"+cat+"' where cod_libro='"+codigo+"'");
            cn.conectar();
            cn.setComandoSQL("update  estado set nombre_estado='"+estado+"' where cod_libro='"+codigo+"'");
            cn.conectar();
            cn.setComandoSQL("update  genero set nombre='"+genombre+"' where cod_libro='"+codigo+"'");
            cn.conectar();
            cn.setComandoSQL("update libro_autor set año_impresion='"+año+"', precio='"+precio+"' where codigo_libro='"+codigo+"'");
            cn.conectar();
            cn.cerrarConexion();
           
            JOptionPane.showMessageDialog(this, "El libro fue modificado exitosamente \n Modifique otro libro o vuelva atras");
            VentanaModLibro v= new VentanaModLibro();  
            v.setLocationRelativeTo(null);
            v.setVisible(true);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_guardarActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed

          String user=(String) combo.getSelectedItem();
          titulo.setText(user);
          Integer cod = null;
           try {
            // TODO add your handling code here:
            conexion cn= new conexion();
            cn.setEsSelect(true);
            cn.setComandoSQL("select *  from libro where titulo='"+user+"'");
            cn.conectar();
     
            while(cn.getRst().next())
            {
                edicion.setText("");
                editorial.setText("");
                autor.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField1.setText("");
                
                edicion.setText(cn.getRst().getString("edicion"));
                cod = cn.getRst().getInt("codigo_libro");
                codigo = cod;
                
                
            }
            cn.setComandoSQL("select *  from categoria,autor,genero,estado,editorial,libro_autor where autor.cod_libro='"+cod+"' and editorial.cod_libro='"+cod+"'and libro_autor.codigo_libro='"+cod+"' and genero.cod_libro='"+cod+"'and categoria.cod_libro='"+cod+"'and estado.cod_libro='"+cod+"'");
            cn.conectar();
             while(cn.getRst().next()){            

                    editorial.setText(cn.getRst().getString("editorial.nombre"));
                    autor.setText(cn.getRst().getString("editorial.telefono"));
                    jTextField5.setText(cn.getRst().getString("editorial.direccion"));
                    jTextField6.setText(cn.getRst().getString("autor.nombre"));
                    jTextField7.setText(cn.getRst().getString("autor.nacionalidad"));
                    jTextField8.setText(cn.getRst().getString("categoria.nombre_categoria"));
                    jTextField9.setText(cn.getRst().getString("estado.nombre_estado"));
                    jTextField10.setText(cn.getRst().getString("genero.nombre"));
                    jTextField11.setText(cn.getRst().getString("libro_autor.año_impresion"));
                    jTextField1.setText(cn.getRst().getString("libro_autor.precio"));
                    
                
                }
                
              cn.cerrarConexion();   
     }
     catch (SQLException ex) {
            Logger.getLogger(VentanaModLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void comboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaModLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JTextField autor;
    private javax.swing.JComboBox combo;
    private javax.swing.JTextField edicion;
    private javax.swing.JTextField editorial;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public javax.swing.JLabel libro;
    private javax.swing.JLabel sesion;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}