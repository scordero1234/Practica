/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21SeptiembreSingleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s.corderoc
 */
public class PortalWeb {

    public List<String> generarMensaje(String mensaje) {

        Logger l = Logger.getInstance();
        l.addList("Web " + mensaje);
        return l.getListTexto();

    }
}
