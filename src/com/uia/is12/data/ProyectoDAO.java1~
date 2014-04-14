/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.data;

import com.uia.is12.connection.MySQLDB;
import com.uia.is12.domain.Proyecto;
import com.uia.is12.domain.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gabriel
 */
public class ProyectoDAO {
    private MySQLDB mysqlDB;
    
    public void add(Proyecto proyecto)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "insert into proyectos (NombreProyecto,CodigoUsuario,FechaCreacion)"+
                "values ('"+proyecto.getNombreProyecto()+"',"+proyecto.getCodigoUsuario()+",'"+proyecto.getFechaCreacion()+"')";
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
    public void dell(Proyecto proyecto)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "delete from proyectos where CodigoProyecto="+proyecto.getCodigoProyecto();
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
    
    public void update(Proyecto proyecto)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "update proyectos set CodigoUsuario="+proyecto.getCodigoUsuario()+", NombreProyecto='"+proyecto.getNombreProyecto()+"', FechaCreacion='"+proyecto.getFechaCreacion()+"' where CodigoProyecto="+proyecto.getCodigoProyecto();
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
    
    public boolean exist(Proyecto proyecto)throws SQLException{
        boolean exist = false;
        mysqlDB= new MySQLDB();
        String sql= "select * from proyectos where CodigoProyecto="+proyecto.getCodigoProyecto();
        ResultSet res = mysqlDB.executeQuery(sql);
        if (res.next()){
            exist = true;
        }
    mysqlDB.closeExecuteQuery();
    return exist;
    }
}
