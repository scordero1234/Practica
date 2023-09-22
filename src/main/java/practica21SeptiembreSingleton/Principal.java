/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21SeptiembreSingleton;

import java.util.List;

/**
 *
 * @author s.corderoc
 */
public class Principal {

    public static void main(String[] args) {
        List<String> mensajesList;
        var server = new PortalWeb();

        var serverM = new AppMovil();

        server.generarMensaje("Problemas de conexion 1 ");
        serverM.generarMensaje("Problemas de conexion Movil 1");
        server.generarMensaje("Problemas de conexion  2");
        serverM.generarMensaje("Problemas de conexion Movil 2 ");
        server.generarMensaje("Problemas de conexion  3");
        serverM.generarMensaje("Problemas de conexion Movil 3 ");
        server.generarMensaje("Problemas de conexion 4 ");
        mensajesList = serverM.generarMensaje("Problemas de conexion Movil 4");

        for (String s : mensajesList) {
            System.out.println(s);
        }

    }
}
