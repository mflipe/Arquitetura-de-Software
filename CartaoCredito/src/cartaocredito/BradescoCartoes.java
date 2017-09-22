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
public class BradescoCartoes extends FornecedorCartao {
    
    public CartaoCredito criarCartao(String bandeira){
        
        CartaoCredito cartao;
        
        if(bandeira.equals("Visa")){
            cartao = new CartaoCreditoBradescoVisa();
        }
        if(bandeira.equals("Mastercard")){
            cartao = new CartaoCreditoBradescoMastercard();
        }
        if(bandeira.equals("Diners")){
            cartao = new CartaoCreditoBradescoDiners();
        }
        else {
            cartao = new CartaoCreditoBradesco();
        }
        
        return cartao;
    }
}
