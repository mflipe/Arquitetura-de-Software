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
public class CartaoBBCredito implements Cartao {

    private String bandeira;

    public String dadosCartao() {

        this.bandeira = "Visa";

        return "Cartão de crédito " + this.bandeira + " Banco do Brasil.";
    }

    public CartaoBBCredito() {
        this.bandeira = "Visa";
    }
}
