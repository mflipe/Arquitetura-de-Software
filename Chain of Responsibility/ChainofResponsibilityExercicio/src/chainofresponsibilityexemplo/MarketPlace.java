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
public abstract class MarketPlace {
    
    protected MarketPlace sucessor;
    
    public abstract void checar (Pagamento casa);
    
    public void setSucessor(MarketPlace sucessor) {
        this.sucessor = sucessor;
    }
    
    public void proximo (Pagamento casa) {
        if(this.sucessor != null) {
            this.sucessor.checar(casa);
        }
    }
}
