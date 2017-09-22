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
public class Adpter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PadraoBrasileiro tomada = new PadraoBrasileiro();
        
        AdapterPadraoBrasileiro adapter = new AdapterPadraoBrasileiro(tomada);
        
        adapter.ligarTomadaTresPinos();
    }
    
}
