/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.view;

import com.uia.is12.business.UsuarioBusiness; 
import java.awt.event.ActionEvent; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPasswordField; 
import javax.swing.JTextField;
import com.uia.is12.connection.MySQLDB;
import com.uia.is12.data.UsuarioDAO;
import com.uia.is12.domain.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
private MySQLDB mysqlDB;
public static String usuario;
public static String contraseña;
public static String tipo;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        limpiar();
        
    }
     void limpiar(){
        txcontraseña.setText("");
        txnombreusuario.setText("");
    } 
     
    void acceder(String usuario, String contraseña) {
        mysqlDB = new MySQLDB();
        String sql = "select * from usuarios where NombreUsuario='" + usuario + "'and Contraseña='" + contraseña + "'";
        try {

            ResultSet res = mysqlDB.executeQuery(sql);
            if (res.next()) {
                JOptionPane.showMessageDialog(null, "Logueo Correcto");
                ProyectoPrograView pro = new ProyectoPrograView();
                usuario = res.getString("NombreUsuario");
                tipo = res.getString("TipoUsuario");
                pro.setLocationRelativeTo(null);
                pro.setTitle("QA TRACKER");
                pro.show();
                pro.pack();
                ProyectoInsert proy = new ProyectoInsert();
                proy.lbusu.setText(usuario);
                
            } else {
                JOptionPane.showMessageDialog(null, "Logueo Incorrecto, Usuario o Constraseña mal digitados");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel2 = new javax.swing.JLabel();
        txcontraseña = new javax.swing.JPasswordField();
        txnombreusuario = new javax.swing.JTextField();
        btaceptar = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLIconoLogin = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        getContentPane().add(txcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 134, -1));
        getContentPane().add(txnombreusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 134, -1));

        btaceptar.setText("Aceptar");
        btaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 35));

        btcancel.setText("Cancelar");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });
        getContentPane().add(btcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 35));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 11, 237, -1));

        jLIconoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLIconoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/images.jpg"))); // NOI18N
        jLIconoLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLIconoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 180, 200));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaceptarActionPerformed
        usuario = txnombreusuario.getText();
        contraseña=txcontraseña.getText();
        
        acceder(usuario, contraseña);
        ProyectoPrograView proyectoPrograView = new ProyectoPrograView();
        
        ProyectoPrograView.lbus.setText(usuario);
        ProyectoPrograView.lbtipo.setText(tipo);
        dispose();
   
//        String usuario=txnombreusuario.getText();
//        String contraseña= txcontraseña.getText();
//        acceder(usuario, contraseña);
        
//        UsuarioBusiness userBL = new UsuarioBusiness();
//        Usuario usuario = new Usuario();
//            usuario.setNombreUsuario(txnombreusuario.getText());
//            usuario.setConstraseña(txcontraseña.getText());
//           
//        try {
//            userBL.con(usuario);
//        } catch (Exception ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        limpiar();
//    } catch (SQLException ex) {
//        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//    }
    }//GEN-LAST:event_btaceptarActionPerformed

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        System.exit(0);    }//GEN-LAST:event_btcancelActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaceptar;
    private javax.swing.JButton btcancel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLIconoLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JPasswordField txcontraseña;
    public static javax.swing.JTextField txnombreusuario;
    // End of variables declaration//GEN-END:variables
}
