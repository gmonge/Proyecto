/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.data;

import com.uia.is12.connection.MySQLDB;
import com.uia.is12.domain.Tarea;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gabriel
 */
public class TareaDAO {
    private MySQLDB mysqlDB;
    
     public void add(Tarea tarea)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "insert into tareas (DescripcionTarea,CodigoProyecto,FechaCreacion)"+
                "values ('"+tarea.getNombreTarea()+"',"+tarea.getCodigoProyecto()+",'"+tarea.getFechaCreacion()+"')";
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
    public void dell(Tarea tarea)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "delete from tareas where CodigoTarea="+tarea.getCodigoTarea();
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
    
    public void update(Tarea tarea)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "update tareas set DescripcionTarea='"+tarea.getNombreTarea()+"', CodigoProyecto="+tarea.getCodigoProyecto()+", FechaCreacion='"+tarea.getFechaCreacion()+"' where CodigoTarea="+tarea.getCodigoTarea();
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
    
    public boolean exist(Tarea tarea)throws SQLException{
        boolean exist = false;
        mysqlDB= new MySQLDB();
        String sql= "select * from tareas where CodigoTarea="+tarea.getCodigoTarea();
        ResultSet res = mysqlDB.executeQuery(sql);
        if (res.next()){
            exist = true;
        }
    mysqlDB.closeExecuteQuery();
    return exist;
    }
}
