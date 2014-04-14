/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.data;

import com.uia.is12.connection.MySQLDB;
import java.sql.SQLException;
import com.uia.is12.domain.Error;
import java.sql.ResultSet;
/**
 *
 * @author Gabriel
 */
public class ErrorDAO {
    private MySQLDB mysqlDB;
    
    public void add(Error error)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "insert into errores (DescripcionError,FechaCreacion,CodigoTarea)"+
                "values ('"+error.getNombreError()+"','"+error.getFechaCreacion()+"',"+error.getCodigoTarea()+")";
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
    public void dell(Error error)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "delete from errores where CodigoError="+error.getCodigoError();
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
    
    public void update(Error error)throws SQLException{
        mysqlDB = new MySQLDB();
        String sql = "update errores set DescripcionError='"+error.getNombreError()+"', FechaCreacion='"+error.getFechaCreacion()+"', CodigoTarea="+error.getCodigoTarea()+" where CodigoError="+error.getCodigoError();
        mysqlDB.execute(sql);
        mysqlDB.closeExecute();
        
    }
    
    public boolean exist(Error error)throws SQLException{
        boolean exist = false;
        mysqlDB= new MySQLDB();
        String sql= "select * from errores where CodigoError="+error.getCodigoError();
        ResultSet res = mysqlDB.executeQuery(sql);
        if (res.next()){
            exist = true;
        }
    mysqlDB.closeExecuteQuery();
    return exist;
    }
}
