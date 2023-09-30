/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica29SeptiembreTemplateMethod;

/**
 *
 * @author grupo 4
 */
public abstract class Producto {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public String procesaPedido() {
        return this.revisaAlmacenamiento()+" - "+this.seleccionaTipoProducto();
    }

    public abstract String revisaAlmacenamiento();

    public abstract String seleccionaTipoProducto(); 

}
