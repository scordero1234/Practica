/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21Septiembre;

/**
 *
 * @author e.aguilar
 */
public class Principal {
    
    public static void main(String[] args) {
        VehiculoCamioneta camioneta4x2;
        VehiculoCamioneta camioneta4x4;
    
    camioneta4x2 = (VehiculoCamioneta)new VehiculoCamioneta().clonar();
    camioneta4x4 = (VehiculoCamioneta)camioneta4x2.clonar();
    camioneta4x2.setCapacidadCarga(1000);
    camioneta4x4.setCapacidadCarga(2000);
    System.out.println("Camioneta 4x2: "+camioneta4x2.toString() );
        System.out.println("Camioneta 4x4: "+camioneta4x4.toString() );
    
    }
    
    
    
    
    
}
