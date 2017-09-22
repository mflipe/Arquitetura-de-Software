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
public class MercadoLivre extends MarketPlace {

    protected double valor_mercadolivre;
    
    public void checar(Pagamento pagamento) {
        
        System.out.println("Valor total bruto: R$" + pagamento.valorBruto);
        
        valor_mercadolivre = 0.1*pagamento.valorBruto;
        
        System.out.println("Comissão Mercado Livre: R$" + valor_mercadolivre);
        
        pagamento.valorLiquido = pagamento.valorBruto - valor_mercadolivre;
        
        this.proximo(pagamento);
    }
}
