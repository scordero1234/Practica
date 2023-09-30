/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Strategy;

import practica30Strategy.FormaPago;
import practica30Strategy.PagoContext;

/**
 *
 * @author grupo4
 */
public class Principal {
    public static void main(String[] args) {
        var pagoContext = new PagoContext();
        var pagoGeneradoTC = pagoContext.ejecutarPago(FormaPago.TC);        
        System.out.println(pagoGeneradoTC);
        var pagoGeneradoEfectivo = pagoContext.ejecutarPago(FormaPago.EFECTIVO);
        System.out.println(pagoGeneradoEfectivo);
        var pagoGeneradoTansferencia = pagoContext.ejecutarPago(FormaPago.TRANSFERENCIA);
        System.out.println(pagoGeneradoTansferencia);
    }
    
}
