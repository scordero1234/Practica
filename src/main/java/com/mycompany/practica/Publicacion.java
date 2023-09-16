/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

import java.util.Date;

/**
 *
 * @author s.corderoc
 */
public class Publicacion {
    private int codigo;
    private String estado;
    private Date fechaInicioReservaDate;
    private Date fechaDevolucionDate;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaInicioReservaDate() {
        return fechaInicioReservaDate;
    }

    public void setFechaInicioReservaDate(Date fechaInicioReservaDate) {
        this.fechaInicioReservaDate = fechaInicioReservaDate;
    }

    public Date getFechaDevolucionDate() {
        return fechaDevolucionDate;
    }

    public void setFechaDevolucionDate(Date fechaDevolucionDate) {
        this.fechaDevolucionDate = fechaDevolucionDate;
    }
    
}
