/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre;

/**
 *
 * @author s.corderoc
 */
public class EmpleadoRegular extends  EmpleadoComponent{

    @Override
    public double getSueldo() {
      return 800;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("El sueldo de un empleado Regular es: "+ this.getSueldo());
    }

    @Override
    public String toString() {
        return "EmpleadoRegular{" +getSueldo()+ '}';
    }
    
}
