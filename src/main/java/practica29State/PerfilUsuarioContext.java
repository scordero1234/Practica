package practica29State;

/**
 *
@author grupo 4
 */
public class PerfilUsuarioContext {

    private PerfilUsuarioState perfilUsuarioState;

    public PerfilUsuarioState getPerfilUsuarioState() {
        return perfilUsuarioState;
    }

    public void setPerfilUsuarioState(PerfilUsuarioState perfilUsuarioState) {
        this.perfilUsuarioState = perfilUsuarioState;
    }

    public PerfilUsuarioContext() {
        this.perfilUsuarioState = new Incompleto(this);
    }

    

    
}
