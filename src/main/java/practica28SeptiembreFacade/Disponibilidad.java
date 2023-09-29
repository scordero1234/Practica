/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28SeptiembreFacade;

import java.util.Date;

/**
 *
 * @author s.corderoc
 */
public class Disponibilidad {

    public boolean verificaDisponibilidad(String destino,
            Date fechaInicioDate, Date fechaFinDate) {
        if (fechaInicioDate.after(fechaFinDate)) {
            return false;
        }
        return true;
    }
}
