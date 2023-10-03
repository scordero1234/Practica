/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *

 * @author Ismael
 */
public abstract class Cliente {
    private List<NotificacionEnvio> notificacionEnvioList = new ArrayList<>();
  
    public abstract void notificar();
    
    public abstract void suscribirse(NotificacionEnvio notificacionEnvio);
    
    public abstract void desuscribirse(NotificacionEnvio notificacionEnvio);

    public List<NotificacionEnvio> getNotificacionEnvioList() {
        return notificacionEnvioList;
    }

    public void setNotificacionEnvioList(List<NotificacionEnvio> notificacionEnvioList) {
        this.notificacionEnvioList = notificacionEnvioList;
    }
    
    
}
