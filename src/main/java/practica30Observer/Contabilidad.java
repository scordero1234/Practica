/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Observer;

/**
 *
 * @author s.corderoc
 */
public class Contabilidad implements NotifacionEnvio{

    private boolean pagoMayorizado;


    @Override
    public String toString() {
        return "Contabilidad{" + "pagoMayorizado=" + pagoMayorizado + '}';
    }

    @Override
    public void updateEnvio(boolean estadoEnvio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
