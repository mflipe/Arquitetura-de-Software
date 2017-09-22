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
public class Portas extends ChecarCasa {

    public void checar(SituacaoCasa casa) {
        if (!casa.portasTrancadas) {
            System.out.println("Alerta! As portas não estão trancadas.");
        } else {
            System.out.println("Alerta! As portas estão trancadas.");
        }

        this.proximo(casa);
    }
}
