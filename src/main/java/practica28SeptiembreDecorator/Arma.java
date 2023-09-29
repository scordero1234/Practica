/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28SeptiembreDecorator;

/**
 *
 * @author grupo 4
 */
public class Arma extends PersonajeDecorator{
    

    public Arma(Personaje notificacion) {
        super(notificacion);
    }
    
    @Override
    public String mejorar() {
        return super.mejorar()+" Personaje mejorado con arma";
    }
    
    
    
    
    
}
