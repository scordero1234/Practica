/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Strategy;

/**
 *
 * @author grupo 4
 */
public class PagoEfectivo implements PagoStrategy{

    @Override
    public String generarComprobante() {
        return ("Pago realizado de manera correcta con Efectivo");
    }

    @Override
    public boolean procesarPago() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
