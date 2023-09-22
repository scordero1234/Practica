/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21SeptiembreSingleton;

/**
 *
 * @author s.corderoc
 */
public class Logger {
        private static Logger instance;
        private String texto;

    public Logger() {
    }
        
        public static Logger getInstance(){
         if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
        
                
}
