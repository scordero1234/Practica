/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Strategy;

import static practica30Strategy.FormaPago.EFECTIVO;

/**
 *
 * @author grupo4
 */
public class PagoContext {
    public String ejecutarPago(FormaPago pago){
        String pagoGenerado;
        switch (pago) {
            case EFECTIVO:
                var pagoEfectivo = new PagoEfectivo();
                pagoGenerado = pagoEfectivo.procesarPago()? pagoEfectivo.generarComprobante():"Pago en Efectivo no realizado";                
                break;
                case TC:
                var pagoTC = new PagoTC();
                pagoGenerado = pagoTC.procesarPago()? pagoTC.generarComprobante():"Pago en Tarjete de Credito no realizado";                
                break;
                case TRANSFERENCIA:
                var pagoTransferencia = new PagoTransferencia();
                pagoGenerado = pagoTransferencia.procesarPago()? pagoTransferencia.generarComprobante():"Pago en Transferencia no realizado";                
                break;
            default:
                pagoGenerado="pago no generado";
        }
        return pagoGenerado;
    }
}
