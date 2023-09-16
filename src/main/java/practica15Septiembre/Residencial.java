/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica15Septiembre;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s.corderoc
 */
public class Residencial extends Edificacion implements IDatos{
     private int codigo;
     private String tipoPropiedad;
     private List<Casa> listCasa;

    public Residencial() {
        listCasa= new ArrayList<>();
    }
     
     
    @Override
    String verDireccion() {
     return "La Direccion es"+ this.getUbicacion()+" tipo de propiedad es "+this.tipoPropiedad;
    }

    public boolean addCasa(Casa casa)
    {
        boolean resultado=false;
        listCasa.add(casa);
        resultado=true;
    return resultado;
    } 

    @Override
    public String verCaracteristicas() {
    return "El residencial cuenta con   "+this.listCasa.size()+" casas";
    }
 
 

   
}
