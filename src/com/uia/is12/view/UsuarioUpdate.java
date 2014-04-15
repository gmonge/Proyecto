/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.view;

import com.uia.is12.business.UsuarioBusiness; 
import java.awt.event.ActionEvent; 
import javax.swing.JButton; 
import javax.swing.JInternalFrame; 
import javax.swing.JLabel; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
import javax.swing.JTextField;
import com.uia.is12.connection.MySQLDB;
import com.uia.is12.domain.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class UsuarioUpdate extends javax.swing.JInternalFrame {
private MySQLDB mysqlDB;
    /**
     * Creates new form Proyectos
     */
    public UsuarioUpdate() {
        initComponents();
        disable();
        limpiar();
        jtusuariosupdate.setEnabled(false);
        btupdate.setEnabled(false);
        try {
            tabla();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disable() {
        txnombreusuario.setEditable(false);
        txtipousuario.setEditable(false);
        txcodigousuario.setEditable(false);
        txcontraseña1.setEditable(false);
        txtipousuario.setEditable(false);
    }

    public void enable() {
        txtipousuario.setEditable(true);
        txnombreusuario.setEditable(true);
        txcodigousuario.setEditable(true);
        txcontraseña1.setEditable(true);
        txtipousuario.setEditable(true);
    }

    public void limpiar() {
        txtipousuario.setText("");
        txnombreusuario.setText("");
        txcodigousuario.setText("");
        txcontraseña1.setText("");
        txtipousuario.setText("");
    }
    
    public void tabla() throws SQLException{
        mysqlDB = new MySQLDB();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo Usuario");
        model.addColumn("Nombre Usuario");
        model.addColumn("Tipo Usuario");
        
        String sql = "select * from usuarios";
        ResultSet res = mysqlDB.executeQuery(sql);
        String[]fila = new String[3];
        while (res.next()){
            fila[0]= res.getString("CodigoUsuario");
            fila[1]= res.getString("NombreUsuario");
            fila[2]= res.getString("TipoUsuario");
            
            model.addRow(fila);
        }
        jtusuariosupdate.setModel(model);
        limpiar();
        
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
        txnombreusuario = new javax.swing.JTextField();
        txtipo = new javax.swing.JLabel();
        txtipousuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtusuariosupdate = new javax.swing.JTable();
        btupdate = new javax.swing.JButton();
        btnewupdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txcodigousuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbtipo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txcontraseña1 = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Modificar Usuarios");
        setPreferredSize(new java.awt.Dimension(700, 325));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre de Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        getContentPane().add(txnombreusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 197, -1));

        txtipo.setText("Tipo de Usuario:");
        getContentPane().add(txtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 18));
        getContentPane().add(txtipousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 197, -1));

        jtusuariosupdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Usuario", "Nombre Usuario", "Tipo Usuario"
            }
        ));
        jScrollPane1.setViewportView(jtusuariosupdate);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 163, 660, 96));

        btupdate.setText("UPDATE");
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 99, 80, 30));

        btnewupdate.setText("NEW");
        btnewupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnewupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnewupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 59, 80, 30));

        jLabel2.setText("Codigo Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        getContentPane().add(txcodigousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 197, -1));

        jLabel6.setText("Conectado:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 13, -1, -1));

        lbus.setText("nombreu");
        getContentPane().add(lbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 13, -1, -1));

        jLabel7.setText("Role:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 36, -1, -1));

        lbtipo.setText("jLabel2");
        getContentPane().add(lbtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 36, -1, -1));

        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 18));
        getContentPane().add(txcontraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 197, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnewupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnewupdateActionPerformed
       enable();
       btupdate.setEnabled(true);
    }//GEN-LAST:event_btnewupdateActionPerformed

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
        UsuarioBusiness usuarioBLD = new UsuarioBusiness();
        Usuario usuario = new Usuario();
        usuario.setCodigoUsuario(Integer.parseInt(txcodigousuario.getText()));
        usuario.setNombreUsuario(txnombreusuario.getText());
        usuario.setConstraseña(txcontraseña1.getText());
        usuario.setTipo(txtipousuario.getText());
        try {
            usuarioBLD.update(usuario);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
        try {
        tabla();
    } catch (SQLException ex) {
        Logger.getLogger(UsuarioInsert.class.getName()).log(Level.SEVERE, null, ex);
    }
        disable();
    }//GEN-LAST:event_btupdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnewupdate;
    private javax.swing.JButton btupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtusuariosupdate;
    public static javax.swing.JLabel lbtipo;
    public static javax.swing.JLabel lbus;
    private javax.swing.JTextField txcodigousuario;
    private javax.swing.JTextField txcontraseña1;
    private javax.swing.JTextField txnombreusuario;
    private javax.swing.JLabel txtipo;
    private javax.swing.JTextField txtipousuario;
    // End of variables declaration//GEN-END:variables
}
