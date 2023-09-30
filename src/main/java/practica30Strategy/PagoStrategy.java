/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Strategy;

/**
 *
 * @author Ismael
 */
public interface PagoStrategy {

    public String generarComprobante();

    public boolean procesarPago();
}
