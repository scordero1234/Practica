/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica29State;

/**
 *
 * @author grupo 4
 */
public class Principal {

    public static void main(String[] args) {
        var perfil = new PerfilUsuarioContext();

        System.out.println(perfil.getPerfilUsuarioState().visuarlizaPeril());
             System.out.println(perfil.getPerfilUsuarioState().completarInformacion());
        perfil.getPerfilUsuarioState().cambiarEstado();
             System.out.println(perfil.getPerfilUsuarioState().visuarlizaPeril());
        System.out.println(perfil.getPerfilUsuarioState().completarInformacion());
             perfil.getPerfilUsuarioState().cambiarEstado();
        System.out.println(perfil.getPerfilUsuarioState().visuarlizaPeril());
             System.out.println(perfil.getPerfilUsuarioState().completarInformacion());
        perfil.getPerfilUsuarioState().cambiarEstado();

    }
}
