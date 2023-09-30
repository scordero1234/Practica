/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica29SeptiembreTemplateMethod;

/**
 *
 * @author c.idrovo
 */
public class Principal {
    public static void main(String[] args) {
        var producto = new Perecedero();
        producto.setNombre("Pierna Pollo");
        System.out.println(producto.procesaPedido());
        
          var producto1 = new NoPerecedero();
        producto1.setNombre("Atun");
        System.out.println(producto1.procesaPedido());
    }
   
}
