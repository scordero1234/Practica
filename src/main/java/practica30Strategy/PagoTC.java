/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Strategy;

/**
 *
 * @author grupo 4
 */
public class PagoTC implements PagoStrategy{

    @Override
    public String generarComprobante() {
        return ("Pago realizado de manera correcta con TC");
    }

    @Override
    public boolean procesarPago() {
        return true;
    }
    
}
