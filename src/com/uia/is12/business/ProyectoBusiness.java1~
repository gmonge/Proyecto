/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.business;

import com.uia.is12.data.ProyectoDAO;
import com.uia.is12.domain.Proyecto;
import java.sql.SQLException;

/**
 *
 * @author Gabriel
 */
public class ProyectoBusiness {

    private ProyectoDAO proyectoDAO;

    public ProyectoBusiness() {
        this.proyectoDAO = new ProyectoDAO();
    }

    public void add(Proyecto proyecto) throws SQLException, Exception {
        if (!(proyectoDAO.exist(proyecto))) {
            proyectoDAO.add(proyecto);
        } else {
            throw new Exception("The Proyecto exist in the DB");
        }
    }

    public void dell(Proyecto proyecto) throws SQLException, Exception {
        if (!(proyectoDAO.exist(proyecto))) {

            throw new Exception("The Proyecto not exist in the DB");
        } else {
            proyectoDAO.dell(proyecto);
        }
    }

    public void update(Proyecto proyecto) throws SQLException, Exception {
        if (!(proyectoDAO.exist(proyecto))) {
            throw new Exception("The Proyecto not exist in the DB");
        } else {
            proyectoDAO.update(proyecto);
        }
    }
}
