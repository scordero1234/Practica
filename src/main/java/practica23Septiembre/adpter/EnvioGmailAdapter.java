/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre.adpter;

/**
 *
 * @author s.corderoc
 */
public class EnvioGmailAdapter implements  Mensajeria{

    @Override
    public String envioCorreo(String origen, String destino, String mensaje) {
    if(!origen.isEmpty() && !destino.isEmpty())
        return mensaje;
        return null;
        
    }
    
}
