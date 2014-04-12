/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.business;

import com.uia.is12.data.TareaDAO;
import com.uia.is12.domain.Tarea;
import java.sql.SQLException;

/**
 *
 * @author Gabriel
 */
public class TareaBusiness {
    private TareaDAO tareaDAO;

    public TareaBusiness() {
        this.tareaDAO = new TareaDAO();
    }
    
    public void add(Tarea tarea) throws SQLException, Exception {
        if (!(tareaDAO.exist(tarea))) {
            tareaDAO.add(tarea);
        } else {
            throw new Exception("The Tarea exist in the DB");
        }
    }

    public void dell(Tarea tarea) throws SQLException, Exception {
        if (!(tareaDAO.exist(tarea))) {

            throw new Exception("The Tarea not exist in the DB");
        } else {
            tareaDAO.dell(tarea);
        }
    }

    public void update(Tarea tarea) throws SQLException, Exception {
        if (!(tareaDAO.exist(tarea))) {
            throw new Exception("The Tarea not exist in the DB");
        } else {
            tareaDAO.update(tarea);
        }
    }
}
    
    

