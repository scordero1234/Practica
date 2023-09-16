/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica15Septiembre;

/**
 *
 * @author s.corderoc
 */
public class Principal {

    public static void main(String[] args) {

        var comercial = new Comercial();
        comercial.addParqueadero(3);
        comercial.addParqueadero(5);
        comercial.addParqueadero(1);
        comercial.addParqueadero(3);
        var residencial = new Residencial();
        var casa = new Casa();
        casa.setCodigo(1);
        casa.setNumeroCuarto(2);
        residencial.addCasa(casa);

        casa = new Casa();
        casa.setCodigo(2);
        casa.setNumeroCuarto(4);
        residencial.addCasa(casa);
        System.err.println(residencial.verCaracteristicas());
        System.err.println(comercial.verCaracteristicas());

    }
}
