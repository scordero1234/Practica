/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Observer;

/**
 *
 * @author Ismael
 */
public class Entrega implements NotificacionEnvio{

    private String estadoEntrega;
    @Override
    public void updateEnvio(String mensaje) {
        this.estadoEntrega = mensaje;
    }
    
    @Override
    public String toString(){
        return "Estado de la Entrega " + estadoEntrega;
    }
}
