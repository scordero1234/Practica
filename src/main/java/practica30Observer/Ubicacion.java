/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Observer;

/**
 *
 * @author Ismael
 */
public class Ubicacion implements NotificacionEnvio{

    private String estadoUbicacion;
    @Override
    public void updateEnvio(String mensaje) {
        this.estadoUbicacion = mensaje;
    }
    
    @Override
    public String toString(){
        return "Ubicacion " + estadoUbicacion;
    }
    
}
