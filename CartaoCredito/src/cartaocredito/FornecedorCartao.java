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
public abstract class FornecedorCartao {
    
    public abstract CartaoCredito criarCartao(String bandeira);
    
    public CartaoCredito gerarCartao(String bandeira){
        
        CartaoCredito cartao;
        
        cartao = criarCartao(bandeira);
        
        cartao.liberaLimite();
        cartao.codigoSeguranca();
        cartao.senha();
        cartao.emitir();
        
        return cartao;
    }
}
