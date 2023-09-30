/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica28SeptiembreDecorator;

/**
 *
 * @author grupo 4
 */
public class Principal {
    
    public static void main(String[] args) {
        var personajeAliado = new AliadoImpl();
        
        var aliadoEquipado1 = new Arma(personajeAliado);
        var aliadoEquipado2 = new Armadura(aliadoEquipado1);
        
        var personajeEnemigo = new EnemigoImpl();
        
        var enemigoEquipado1 = new Arma(personajeEnemigo);
        var enemigoEquipado2 = new Armadura(enemigoEquipado1);
        
        
        System.out.println(aliadoEquipado2.mejorar()); 
        System.out.println(enemigoEquipado2.mejorar());
    }
    
}
