/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Observer;

/**
 *
 * @author s.corderoc
 */
public class Entrega implements NotifacionEnvio{

    private boolean seguimientoIniciado;
    


    @Override
    public String toString() {
        return "ServicioCliente{" + "seguimientoIniciado=" + seguimientoIniciado + '}';
    }

    @Override
    public void updateEnvio(boolean estadoEnvio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
