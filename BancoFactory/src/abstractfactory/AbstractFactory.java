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
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BancosFactory novoCartaoItauCredito = new ItauFactory();
        Cartao cartaoItauCredito = novoCartaoItauCredito.gerarCartao("Crédito");
        System.out.println(cartaoItauCredito.dadosCartao());

        BancosFactory novoCartaoItauDebito = new ItauFactory();
        Cartao CartaoItauDebito = novoCartaoItauDebito.gerarCartao("Débito");
        System.out.println(CartaoItauDebito.dadosCartao());

        BancosFactory novoCartaoBBCredito = new BBFactory();
        Cartao cartaoBBCredito = novoCartaoBBCredito.gerarCartao("Crédito");
        System.out.println(cartaoBBCredito.dadosCartao());

        BancosFactory novoCartaoBBDebito = new BBFactory();
        Cartao CartaoBBDebito = novoCartaoBBDebito.gerarCartao("Débito");
        System.out.println(CartaoBBDebito.dadosCartao());
     
    }

}
