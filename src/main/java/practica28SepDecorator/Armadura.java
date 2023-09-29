/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28SepDecorator;

/**
 *
 * @author s.corderoc
 */
public class Armadura extends PersonajeDecorador{
 private String clase;

    public Armadura(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String mejorar() {
      return super.mejorar()+"mejorado armadura";
    }
}
