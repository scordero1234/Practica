/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre.adpter;

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
    public String envioCorreo(String origen, String destino, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
