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
public class Comercial extends Edificacion implements IDatos{
    private int codigo;
    private double costo;
    private String tipoNegocio;
    private List<Parqueadero> listParqueadero;

    public Comercial() {
        listParqueadero= new ArrayList<>();
    }
    
    
    @Override
    public String verDireccion() {
       return "La Direccion es"+ this.getUbicacion()+" tiene un costo de "+this.costo;
    }

    @Override
    public String verCaracteristicas() {
        
       return "El comercial cuenta con "+listParqueadero.size()+" Parqueos";
    }

    public boolean addParqueadero(int numeroParqueo)
    { 
        boolean resultado=false;
        var parqueadero = new Parqueadero();
        parqueadero.setNumeroParqueo(20);
        this.listParqueadero.add(parqueadero);
        resultado=true;
       return resultado;
    }
 
}
