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
public class Alarme extends ChecarCasa {
    
    public void checar(SituacaoCasa casa) {
        if(!casa.alarmeLigado) {
            System.out.println("Alerta! O alarme não esta ligado.");
        } else {
            System.out.println("Alerta! O alarme esta ligado.");
        }
        
        this.proximo(casa);
    }
    
    
}
