/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica29State;
/**
 *
@author grupo 4
 */
public class Mejorado implements PerfilUsuarioState{
    
    private PerfilUsuarioContext perfilUsuarioContext;

    public Mejorado(PerfilUsuarioContext perfilUsuarioContext) {
        this.perfilUsuarioContext = perfilUsuarioContext;
    }
    


   @Override
    public void cambiarEstado() {
        this.perfilUsuarioContext.setPerfilUsuarioState(this);
    }

    @Override
    public String visuarlizaPeril() {
                return "Mejorado";
    }

    @Override
    public String completarInformacion() {
     return "Perfil Mejorado";
    }

    @Override
    public String mejorarRecomendacion() {
        return "Finalizar perfil";
    }
    
}
