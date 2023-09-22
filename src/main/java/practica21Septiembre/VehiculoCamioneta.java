/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21Septiembre;

/**
 *
 * @author e.aguilar
 */
public class VehiculoCamioneta extends Vehiculo {

    private double capacidadCarga;

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    
    @Override
    public Vehiculo clonar() {
        VehiculoCamioneta retorno = new VehiculoCamioneta();
        retorno.setNumeroRuedas(4);
        retorno.setMarca("Hyundai");
        retorno.setColor("blanco");
        return retorno;
    }
    
    @Override
    public String toString()
            {
             return "el Vehiculo contiene: "+super.getNumeroRuedas() + " ruedas, su color es: "+ super.getColor() +
                     ", marca: "+super.getMarca() + ", capacidadCarga: " +this.capacidadCarga;
            }
}
