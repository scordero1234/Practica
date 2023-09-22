/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21SeptiembreSingleton;

/**
 *
 * @author s.corderoc
 */
public class Principal {
    public static void main(String[] args) {
        var server= new AppWeb();
       server.generarMensaje("Problemas de conexion");
       
               var serverM= new AppMovil();
       serverM.generarMensaje("Problemas de conexion App Movil");
       
        System.err.println(""+ Logger.getInstance().getTexto());
        
        
    }
}
