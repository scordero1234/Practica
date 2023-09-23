/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre.adapter.bridge;

/**
 *
 * @author s.corderoc
 */
public  abstract class Notificacion {

    private NotificacionImpl notificacionImpl;
    public Notificacion(NotificacionImpl notificacionImpl) {
        this.notificacionImpl=notificacionImpl;
    }
    
    public abstract void generaNotificacion(String mensaje);
}
