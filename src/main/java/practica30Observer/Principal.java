/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica30Observer;

/**
 *
 * @author grupo4
 */
public class Principal {

    public static void main(String[] args) {
        var cliente = new Envio();
        var ubicacion = new Ubicacion();
        cliente.suscribirse(ubicacion);

        var ubicacion1 = new Ubicacion();
        cliente.suscribirse(ubicacion1);

        var entrega = new Entrega();
        cliente.suscribirse(entrega);
        cliente.setMensaje("en camino");
        cliente.notificar();       
        
        cliente.desuscribirse(ubicacion1);
        cliente.setMensaje("entregado");
        cliente.notificar();
       

    }

}
