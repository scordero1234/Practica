/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica16Septiembre;

/**
 *
 * @author s.corderoc
 */
public class ContratoFactory extends ContratoAbstractFactory{

    
    @Override
    public Contrato crearContratoFactory(TipoContrato tipoContrato) {
        switch (tipoContrato) {
            case FACTURA:
                return new ContratoFactura();
                case FIJO:
                return new ContratoFijo();
                case TEMPORAL:
                        return new ContratoTemporal();
            default:
                throw new AssertionError();
        }
    }
    
}
