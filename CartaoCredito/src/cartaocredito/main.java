/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartaocredito;

/**
 *
 * @author Marcos Felipe
 */
public class main {
    
    public static void main(String[] args) {
        
       FornecedorCartao Cartao = new BradescoCartoes();
        CartaoCredito gerarCartao = BradescoCartoes.gerarCartao("Visa");
       
        
    }
}
