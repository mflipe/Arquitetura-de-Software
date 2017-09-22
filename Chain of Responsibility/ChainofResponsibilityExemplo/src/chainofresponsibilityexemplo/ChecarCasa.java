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
public abstract class ChecarCasa {
    
    protected ChecarCasa sucessor;
    
    public abstract void checar (SituacaoCasa casa);
    
    public void setSucessor(ChecarCasa sucessor) {
        this.sucessor = sucessor;
    }
    
    public void proximo (SituacaoCasa casa) {
        if(this.sucessor != null) {
            this.sucessor.checar(casa);
        }
    }
}
