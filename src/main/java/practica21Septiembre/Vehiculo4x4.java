/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21Septiembre;

/**
 *
 * @author e.aguilar
 */
public class Vehiculo4x4 extends Vehiculo {

    private double cilindraje;

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public Vehiculo clonar() {
        Vehiculo4x4 retorno = new Vehiculo4x4();
        retorno.setNumeroRuedas(4);
        retorno.setMarca("Toyota Hilux");
        retorno.setColor("rojo");
        return retorno;
    }
    
}
