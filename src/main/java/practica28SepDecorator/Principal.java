/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28SepDecorator;

/**
 *
 * @author s.corderoc
 */
public class Principal {
    public static void main(String[] args) {
        var personaje= new PersonajeImpl();
         var arma = new Arma(personaje);
        var armadura = new Armadura(personaje);
       
        
          System.out.println(armadura.mejorar());
     
    }
}
