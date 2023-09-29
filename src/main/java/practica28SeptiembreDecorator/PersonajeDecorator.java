/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28SeptiembreDecorator;
 

/**
 *
 * @author grupo 4
 */
public abstract class PersonajeDecorator implements Personaje {
    
    protected Personaje personaje;

    public PersonajeDecorator(Personaje personaje) {
        this.personaje=personaje;
    }
    
    @Override
    public String mejorar() {
        var retorno=personaje.mejorar();
        return retorno;
    }
 
    
}
