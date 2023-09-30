/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Strategy;

import static practica30Strategy.FormaPago.EFECTIVO;

/**
 *
 * @author Ismael
 */
public class PagoContext {
    public String ejecutarPago(FormaPago pago){
        String pagoGenerado;
        switch (pago) {
            case EFECTIVO:
                var pagoEfectivo = new PagoEfectivo();
                pagoGenerado = pagoEfectivo.generarComprobante();                
                break;
                case TC:
                var pagoTC = new PagoTC();
                pagoGenerado = pagoTC.generarComprobante();                
                break;
                case TRANSFERENCIA:
                var pagoTransferencia = new PagoTransferencia();
                pagoGenerado = pagoTransferencia.generarComprobante();                
                break;
            default:
                pagoGenerado="pago no generado";
        }
        return pagoGenerado;
    }
}
