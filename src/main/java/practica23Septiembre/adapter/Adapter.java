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
    private EnvioOutlookAdapter envioOutlook = new EnvioOutlookAdapter();

    @Override
    public boolean envioCorreo(String origen, String destino, String mensaje) {

        if (envioGmail.envioCorreo(origen, destino, mensaje) || envioOutlook.envioCorreo(origen, destino, mensaje)) {
            return true;
        }
        return false;

    }

}
