/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre.adapter.bridge;

/**
 *
 * @author s.corderoc
 */
public class NotificacionAndroidImpl implements NotificacionImpl{

    @Override
    public String enviarNotificacion(String mensaje) {
       if(!mensaje.isEmpty())
            return "Envio Notificacion Android "+mensaje;
       return null;
    }
    
}
