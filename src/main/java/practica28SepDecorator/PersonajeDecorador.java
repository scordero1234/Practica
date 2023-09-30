/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28SepDecorator;

/**
 *
 * @author s.corderoc
 */
public abstract class PersonajeDecorador implements Personaje{
    protected Personaje personaje;
    
    public PersonajeDecorador(Personaje personaje)
    {
        this.personaje=personaje;
    } 
    
     @Override
    public String mejorar() {
       return "";
    }

}
