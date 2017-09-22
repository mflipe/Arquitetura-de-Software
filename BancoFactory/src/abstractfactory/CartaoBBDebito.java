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
public class CartaoBBDebito implements Cartao {

    private String bandeira;

    public String dadosCartao() {

        return "Cartão de débito " + this.bandeira + " Banco do Brasil.";
    }

    public CartaoBBDebito() {
        this.bandeira = "Visa";
    }
}
