/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica21Septiembre;

/**
 *
 * @author e.aguilar
 */
public class VehiculoSuv extends Vehiculo {

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    @Override
    public Vehiculo clonar() {
        VehiculoSuv retorno = new VehiculoSuv();
        retorno.setNumeroRuedas(4);
        retorno.setMarca("Chevrolet");
        retorno.setColor("amarillo");
        return retorno;
    }
    
}
