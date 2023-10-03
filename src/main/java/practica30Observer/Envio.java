/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Observer;

/**
 *
 * @author s.corderoc
 */
public class Envio extends Cliente {
    
    private String estadoEnvio;


    @Override
    public void notificar() {
        for (var pagoFactura : this.getPagoFacturaList()) {
            if (pagoFactura instanceof ServicioCliente) {
                pagoFactura.updatePago(this.facturaPagada);
            }
        }
    }

  

    @Override
    public void attach(PagoFactura pagoFactura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void detach(PagoFactura pagoFactura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
    
}
