/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre.adapter;

/**
 *
 * @author s.corderoc
 */
public class EnvioOutlookAdapter implements  Mensajeria{
     private EnvioOutlookAdapter envio= new EnvioOutlookAdapter();
    @Override
    public String envioCorreo(String origen, String destino, String mensaje) {
    if(!origen.isEmpty() && !destino.isEmpty())
       return envio.envioCorreo(origen, destino, mensaje);
        return null;
        
    }
}
