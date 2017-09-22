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
public class Impostos extends MarketPlace {
    
    protected double valor_impostos;
    
    public void checar(Pagamento casa) {
        valor_impostos = 0.05*casa.valorBruto;
        
        System.out.println("Impostos: R$" + valor_impostos);
        
        casa.valorLiquido = casa.valorLiquido - valor_impostos;
        
        this.proximo(casa);
    }
}
