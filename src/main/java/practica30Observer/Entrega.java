/* 
 * @author Ismael
 */
public class Entrega implements NotificacionEnvio{

    private String estadoEntrega;
    @Override
    public void updateEnvio(String mensaje) {
        this.estadoEntrega = mensaje;
    }
    
    @Override
    public String toString(){
        return "Estado de la Entrega " + estadoEntrega;
    }
}
