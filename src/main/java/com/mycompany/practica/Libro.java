/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author s.corderoc
 */
public class Libro {
    private int codigo;
    private String titulo;
    private String anioPublicacion;
    private double precio;
    private Autor autor;
    
    private boolean validaCodigo(){
    if(this.codigo>0)
        return true;
    return  false;
    }
    
    private String generaReserva(Reserva reserva)
    {
      if(reserva.getEstado().equals("R"))
       return "Reservado";
        return "disponible";
    } 
         
}
