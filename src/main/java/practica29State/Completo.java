package practica29State;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
@author grupo 4
 */
public class Completo implements PerfilUsuarioState{
    
    private PerfilUsuarioContext perfilUsuarioContext;

    public Completo(PerfilUsuarioContext perfilUsuarioContext) {
        this.perfilUsuarioContext = perfilUsuarioContext;
    }



    @Override
    public void cambiarEstado() {
        this.perfilUsuarioContext.setPerfilUsuarioState(new Mejorado(this.perfilUsuarioContext));
    }

    @Override
    public String visuarlizaPeril() {
       return "Completo";
    }

    @Override
    public String completarInformacion() {
   return "Perfil Completo";
    }

    @Override
    public String mejorarRecomendacion() {
      return "Finalizado";
    }
    
}
