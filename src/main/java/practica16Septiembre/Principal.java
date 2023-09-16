/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica16Septiembre;

/**
 *
 * @author s.corderoc
 */
public class Principal {

    public static void main(String[] args) {
        var contratoFactory = new ContratoFactory();
        
        var contrato = contratoFactory.crearContratoFactory(TipoContrato.FACTURA).calcularSueldo();
        var contrato1 = contratoFactory.crearContratoFactory(TipoContrato.TEMPORAL);
        var contrato2 = contratoFactory.crearContratoFactory(TipoContrato.FIJO);

        System.err.println("Contrato mediante factura" + contrato);
        System.err.println("Contrato mediante Temporal " + contrato1.calcularSueldo());
        System.err.println("Contrato mediante Fijo" + contrato2.calcularSueldo());

    }
}
