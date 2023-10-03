/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Observer;

/**
 *

 * @author s.corderoc
 *

 * @author Ismael
 */
public class Envio extends Cliente{

    private String mensaje;
    @Override
    public void notificar() {
        for(var notificarEnvio : this.getNotificacionEnvioList()){            
                notificarEnvio.updateEnvio(mensaje);    
                System.out.println(notificarEnvio.toString());
        }
    }

    @Override
    public void suscribirse(NotificacionEnvio notificacionEnvio) {
        this.getNotificacionEnvioList().add(notificacionEnvio);
        System.out.println("Suscrito:" + notificacionEnvio.getClass());
    }

    @Override
    public void desuscribirse(NotificacionEnvio notificacionEnvio) {
       this.getNotificacionEnvioList().remove(notificacionEnvio);
       System.out.println("Desuscrito:" + notificacionEnvio.getClass());
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
