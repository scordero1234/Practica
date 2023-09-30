/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica29TemplatteMetho;

/**
 *
 * @author s.corderoc
 */
public abstract class Producto {
        private String nombreString;
    private String tipoString;
    public abstract String  realizaPedido();
    public abstract String seleccionaTipoProducto();
    public abstract String revisaAlmacenamiento();
}
