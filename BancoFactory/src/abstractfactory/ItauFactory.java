/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Marcos Felipe
 */
public class ItauFactory implements BancosFactory {

    public Cartao gerarCartao(String tipo) {

        if ("Crédito".equals(tipo)) {
            
            return new CartaoItauCredito();
            
        } else if ("Débito".equals(tipo)) {
            
            return new CartaoItauDebito();
            
        }

        return null;
    }
}
