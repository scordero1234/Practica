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
public class Logger {

    private static Logger instance;
    private static List<String> listaTexto;

  
    public Logger() {
    }

    public void addList(String listTexto) {
        this.listaTexto.add(listTexto);
    }

    public static Logger getInstance() {
        if (instance == null) {
            listaTexto = new ArrayList<>();
            instance = new Logger();
        }
        return instance;
    }

    public List<String> getListTexto() {
        return listaTexto;
    }
    
      public static void setListaTexto(List<String> aListaTexto) {
        listaTexto = aListaTexto;
    }


}
