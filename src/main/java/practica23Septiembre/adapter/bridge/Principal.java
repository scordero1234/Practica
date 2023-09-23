/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre.adapter.bridge;

/**
 *
 * @author s.corderoc
 */
public class Principal {
    
    public static void main(String[] args) {
     NotificacionImpl notificacionIOS=new NotificacionIOSImpl();
    var video= new NotificacionVideo(notificacionIOS);
    
    video.generaNotificacion(notificacionIOS.enviarNotificacion("Video"));
    
    var audio= new NotificacionAudio(notificacionIOS);
   
    audio.generaNotificacion("Audio");
    
    NotificacionImpl notificacionAndroid=new NotificacionAndroidImpl();
    var video1= new NotificacionVideo(notificacionAndroid);
    video.generaNotificacion(notificacionAndroid.enviarNotificacion("audio"));
       
    var audio1= new NotificacionAudio(notificacionAndroid);
    audio.generaNotificacion("Audio1");
    }
    
}
