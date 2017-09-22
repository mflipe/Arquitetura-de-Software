/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adpter;

/**
 *
 * @author Marcos Felipe
 */
public class PadraoBrasileiro {
    
    public boolean ligarTomadaBrasileira() {
        
        conectarTomada();
                
        return true;
    }
    
    public void conectarTomada() {
        
        System.out.println("Ligado na tomada de padrão brasileiro");
        
    }
}
