/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28SeptiembreFacade;

import java.util.Date;

/**
 *
 * @author s.corderoc
 */
public class Pricipal {
    public static void main(String[] args) {
        var reservaVueloFacade=new ReservaVueloFacade();
        System.err.println(reservaVueloFacade.generarReserva("scordero", "1234", "New York", new Date(), new Date(),500));
       // System.err.println(reservaVueloFacade.generarReserva("daniel", "1234", "New York", new Date(), new Date(),500));
        //System.err.println(reservaVueloFacade.generarReserva("scordero", "1234", "New York", new Date(), new Date(),0));
    }
    
   
}
