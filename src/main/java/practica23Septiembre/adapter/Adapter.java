/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre.adapter;

/**
 *
 * @author s.corderoc
 */
public class Adapter implements Mensajeria {

    private EnvioGmail envioGmail = new EnvioGmail();
    private EnvioOutlook envioOutlook = new EnvioOutlook();

    @Override
    public boolean envioCorreo(String origen, String destino, String mensaje) {
      return (envioGmail.envioCorreo(origen, destino, mensaje) || envioOutlook.envioCorreo(origen, destino, mensaje));
    }

}
