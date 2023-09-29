/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28Septiembre;

import java.util.Date;

/**
 *
 * @author s.corderoc
 */
public class ReservaVueloFacade {
   private Autenticacion autenticacion= new Autenticacion();
   private Disponibilidad disponibilidad= new Disponibilidad();
   private Pago pago= new Pago();
   
   public String generarReserva(String usuarioString,String claveString,String destinoString,Date fechaInicioDate ,Date fechaFinDate,double precio)
           
   {
       String exitosoString="Exitoso";
       
       if(autenticacion.autenticar(usuarioString, claveString))
       { 
           if(disponibilidad.verificaDisponibilidad(destinoString, fechaInicioDate, fechaFinDate))
               pago.generarPago(precio);
       }else
           exitosoString="Exitoso";
       return exitosoString;
   } 
            
}
