/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.data;

import com.uia.is12.connection.MySQLDB;
import com.uia.is12.domain.Proyecto;
import com.uia.is12.domain.Usuario;
import com.uia.is12.view.Login;
import com.uia.is12.view.ProyectoInsert;
import com.uia.is12.view.ProyectoPrograView;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class UsuarioDAO {
     private MySQLDB mysqlDB;
    
    public void add(Usuario usuario)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "insert into usuarios (NombreUsuario,Contraseña,TipoUsuario)"+
                "values ('"+usuario.getNombreUsuario()+"','"+usuario.getConstraseña()+"','"+usuario.getTipo()+"')";
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
    public void dell(Usuario usuario)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "delete from usuarios where CodigoUsuario="+usuario.getCodigoUsuario();
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
    
    public void update(Usuario usuario)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "update usuarios set NombreUsuario='"+usuario.getNombreUsuario()+"', Contraseña='"+usuario.getConstraseña()+"',TipoUsuario='"+usuario.getTipo()+"' where CodigoUsuario="+usuario.getCodigoUsuario();
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
  
    public boolean exist(Usuario usuario)throws SQLException{
        boolean exist = false;
        mysqlDB= new MySQLDB();
        String sql= "select * from usuarios where CodigoUsuario="+usuario.getCodigoUsuario();
        ResultSet res = mysqlDB.executeQuery(sql);
        if (res.next()){
            exist = true;
        }
    mysqlDB.closeExecuteQuery();
    return exist;
    }
}
