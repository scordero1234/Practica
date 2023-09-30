/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28SepDecorator;

/**
 *
 * @author s.corderoc
 */
public class AliadoImpl  extends PersonajeDecorador{

    public AliadoImpl(Personaje personaje) {
        super(personaje);
    }

   @Override
public String mejorar()
{
    var retorno =personaje.mejorar();
    return retorno;
} 
    
}
