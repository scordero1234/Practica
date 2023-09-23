/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre.adapter;

/**
 *
 * @author s.corderoc
 */
public class Principal {
    public static void main(String[] args) {
         var mensajeria= new Adapter();
        
         System.err.println(mensajeria.envioCorreo("scorcar_15@gmail.com", "destino@gmail.com", "hoal"));
    
    } 
    
}
