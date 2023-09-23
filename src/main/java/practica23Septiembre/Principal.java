/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre;

/**
 *
 * @author s.corderoc
 */
public class Principal {
   
    public static void main(String[] args) {
        var empleado= new EmpleadoRegular();
        System.err.println(empleado);
        
        var contratista= new SubContratista();
        System.err.println(contratista.getSueldo());
        
        
        var gerente = new Gerente();
        gerente.add(empleado);
        gerente.add(contratista);
        gerente.mostrarDetalle();
        
         var gerente1 = new Gerente();
         var empleado1= new EmpleadoRegular();
         
         gerente1.add(empleado1);
          gerente1.add(gerente);
          
          gerente1.mostrarDetalle();
       
          gerente1.getSueldo();
             System.err.println("total "+gerente1.getListaEmpleadoComponent().size());
          
    }
}
