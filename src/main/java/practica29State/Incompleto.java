/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica29State;

/**
 *
@author grupo 4
 */
public class Incompleto implements PerfilUsuarioState{
    
    private PerfilUsuarioContext perfilUsuarioContext;

    public Incompleto(PerfilUsuarioContext perfilUsuarioContext) {
        this.perfilUsuarioContext = perfilUsuarioContext;
    }
    
    


    @Override
    public void cambiarEstado() {
        this.perfilUsuarioContext.setPerfilUsuarioState(new Completo(this.perfilUsuarioContext));
    }

    @Override
    public String visuarlizaPeril() {
           return "Incompleto";
    }

    @Override
    public String completarInformacion() {
     return "Perfil incompleto";
    }

    @Override
    public String mejorarRecomendacion() {
       return "Mejorar perfil";
    }
    
}
