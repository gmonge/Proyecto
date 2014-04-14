/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.business;

import com.uia.is12.data.ErrorDAO;
import java.sql.SQLException;
import com.uia.is12.domain.Error;

/**
 *
 * @author Gabriel
 */
public class ErrorBusiness {
    private ErrorDAO errorDAO;

    public ErrorBusiness() {
        this.errorDAO = new ErrorDAO();
    }
    
    public void add(Error error) throws SQLException, Exception {
        if (!(errorDAO.exist(error))) {
            errorDAO.add(error);
        } else {
            throw new Exception("El Error no existe BD");
        }
    }

    public void dell(Error error) throws SQLException, Exception {
        if (!(errorDAO.exist(error))) {

            throw new Exception("El Error no existe BD");
        } else {
            errorDAO.dell(error);
        }
    }

    public void update(Error error) throws SQLException, Exception {
        if (!(errorDAO.exist(error))) {
            throw new Exception("El Error no existe BD");
        } else {
            errorDAO.update(error);
        }
    }
}
