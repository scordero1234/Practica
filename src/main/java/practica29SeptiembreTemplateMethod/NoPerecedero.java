/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica29SeptiembreTemplateMethod;

/**
 *
 * @author grupo 4
 */
public class NoPerecedero extends Producto{

    @Override
    public String revisaAlmacenamiento() {
        return " No Requiere Refrigeracion";
    }

    @Override
    public String seleccionaTipoProducto() {
        return " Enlatados";
    }
  
}
