/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28Septiembre;

/**
 *
 * @author s.corderoc
 */
public class Autenticacion {
    public boolean autenticar(String usuario,String contrasenia)
    {
       if(usuario.equals("scordero")&& contrasenia.equals("123")) 
    return true;
       return false;
    }
}
