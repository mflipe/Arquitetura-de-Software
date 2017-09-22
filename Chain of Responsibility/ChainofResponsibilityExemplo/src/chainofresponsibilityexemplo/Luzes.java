/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityexemplo;

/**
 *
 * @author Marcos Felipe
 */
public class Luzes extends ChecarCasa {
    
    public void checar(SituacaoCasa casa) {
        if(!casa.luzesApagadas) {
            System.out.println("Alerta! As luzes estão ligadas.");
        } else {
            System.out.println("Alerta! As luzes não estão ligadas.");
        }
        
        this.proximo(casa);
    }
}
