/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre.adapter;

/**
 *
 * @author s.corderoc
 */
public class EnvioOutlook implements Mensajeria{
   private String correo;
   private String ipEnvio;
   private String origen;
   private String destino;

    @Override
    public boolean envioCorreo(String origen, String destino, String mensaje) {
       return true;
    }
}
