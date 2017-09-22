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
public class AdapterPadraoBrasileiro extends PadraoAmericano {
    
    private PadraoBrasileiro tomadaBrasileira;
    
    public AdapterPadraoBrasileiro(PadraoBrasileiro tomadaBrasileira) {
        
        this.tomadaBrasileira = tomadaBrasileira;
        
    }
    
    public boolean ligarTomadaTresPinos() {
        
        return this.tomadaBrasileira.ligarTomadaBrasileira();
        
    }
}
