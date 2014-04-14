/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.business;

import com.uia.is12.data.ProyectoDAO;
import com.uia.is12.data.UsuarioDAO;
import com.uia.is12.domain.Proyecto;
import com.uia.is12.domain.Usuario;
import java.sql.SQLException;

/**
 *
 * @author Gabriel
 */
public class UsuarioBusiness {
     private UsuarioDAO usuarioDAO;

    public UsuarioBusiness() {
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public void add(Usuario usuario)throws SQLException, Exception{
        if (!(usuarioDAO.exist(usuario))){
            usuarioDAO.add(usuario);
        }else{
            throw new Exception("The Usuario exist in the DB");
        }
    }
    
    public void dell(Usuario usuario)throws SQLException, Exception{
        if (!(usuarioDAO.exist(usuario))){
            throw new Exception("The Usuario not exist in the DB");
        }else{
            usuarioDAO.dell(usuario);
        }
    }
    
    public void update(Usuario usuario)throws SQLException, Exception{
        if (!(usuarioDAO.exist(usuario))){
            throw new Exception("The Usuario exist in the DB");
        }else{
            usuarioDAO.update(usuario);
        }
        
    }
}
