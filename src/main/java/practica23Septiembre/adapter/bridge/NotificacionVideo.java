/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre.adapter.bridge;

/**
 *
 * @author s.corderoc
 */
public class NotificacionVideo  extends Notificacion{
 public NotificacionVideo(NotificacionImpl notificacionImpl) {
        super(notificacionImpl);
    }

    @Override
    public void generaNotificacion(String mensaje) {
         if(!mensaje.isEmpty())
            System.err.println("Notificacion por Video "+mensaje);
    }

}
