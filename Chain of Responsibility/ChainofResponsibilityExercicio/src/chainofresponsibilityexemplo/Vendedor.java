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
public class Vendedor extends MarketPlace {
    
    
    public void checar(Pagamento casa) {
        
        System.out.println("Valor total liquido: R$" + casa.valorLiquido);
        
        this.proximo(casa);
    } 
}
