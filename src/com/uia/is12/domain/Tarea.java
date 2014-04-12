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
public class Tarea {
    private String nombreTarea;
    private String fechaCreacion;
    private int codigoTarea;
    private int codigoProyecto;
    
    
    public Tarea(){
        
    }

    public Tarea(String nombreTarea, String fechaCreacion, int codigoTarea, int codigoProyecto) {
        this.nombreTarea = nombreTarea;
        this.fechaCreacion = fechaCreacion;
        this.codigoTarea = codigoTarea;
        this.codigoProyecto = codigoProyecto;
        
    }

    public int getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(int codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }
    
    public String getNombreTarea() {
        return nombreTarea;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public int getCodigoTarea() {
        return codigoTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setCodigoTarea(int codigoTarea) {
        this.codigoTarea = codigoTarea;
    }

    
}
