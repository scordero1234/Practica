/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28SeptiembreFacade;

/**
 *
 * @author s.corderoc
 */
public class Pago {

    public boolean generarPago(double precio) {
        if (precio > 0) {
            return true;
        }
        return false;
    }
}
