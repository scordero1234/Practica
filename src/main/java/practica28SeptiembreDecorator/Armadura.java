/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28SeptiembreDecorator;

/**
 *
 * @author grupo4
 */
public class Armadura extends PersonajeDecorator{

    
    public Armadura(Personaje personaje) {
        super(personaje);
    }
    
     @Override
    public String mejorar() {
        return super.mejorar()+" Personaje mejorado con armadura";
    }
    
    
}
