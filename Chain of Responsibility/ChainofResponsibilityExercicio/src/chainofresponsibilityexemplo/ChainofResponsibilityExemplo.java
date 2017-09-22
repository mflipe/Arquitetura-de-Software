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
public class ChainofResponsibilityExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pagamento pagamento = new Pagamento();
        
        MercadoLivre marketplace = new MercadoLivre();
        Impostos taxas = new Impostos();
        Vendedor vendedor = new Vendedor();
        
        marketplace.setSucessor(taxas);
        taxas.setSucessor(vendedor);
        
        marketplace.checar(pagamento);
    }
    
}
