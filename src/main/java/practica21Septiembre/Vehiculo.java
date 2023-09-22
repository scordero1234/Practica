/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21Septiembre;

/**
 *
 * @author e.aguilar
 */
public abstract class Vehiculo {
    private int numeroRuedas;
    private String color;
    private String marca;
    
    public abstract Vehiculo clonar();

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString()
            {
             return "el Vehiculo contiene: "+numeroRuedas + " ruedas, su color es: "+ color +
                     "marca: "+marca;
            }
}
