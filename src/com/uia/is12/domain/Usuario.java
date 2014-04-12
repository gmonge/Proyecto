/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.domain;

/**
 *
 * @author Gabriel
 */
public class Usuario {
    private int codigoUsuario;
    private String nombreUsuario;
    private String constraseña;
    private String tipo;
    public Usuario(){
        
    }
    
    public Usuario(int codigoUsuario, String nombreUsuario, String constraseña,String tipo) {
        this.codigoUsuario = codigoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.constraseña = constraseña;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getConstraseña() {
        return constraseña;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setConstraseña(String constraseña) {
        this.constraseña = constraseña;
    }

    
}
