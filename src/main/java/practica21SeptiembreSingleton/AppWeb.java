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
public class AppWeb {
      public List<String> generarMensaje(String mensaje)
   {
      List<String> listaMensList = new ArrayList<>();
       
       Logger l= Logger.getInstance();
       l.setTexto("Una prueba  de logger"+" | "+mensaje);
       
       listaMensList.add(l.getTexto());
       return  listaMensList;
   }
}
