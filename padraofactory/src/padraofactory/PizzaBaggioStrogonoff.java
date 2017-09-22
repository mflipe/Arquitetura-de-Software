/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraofactory;

/**
 *
 * @author Marcos Felipe
 */
public class PizzaBaggioStrogonoff extends Pizza{
    String sabor;
    int valor;
    String opcional;

    @Override
    public void cobrar() {
        System.out.println("Pizzaria Baggio:\n");
        System.out.println("Pizza sabor: " + sabor + ".");
        System.out.printf("Cobrança: R$%d,00. \n", valor);
        System.out.println("Opcional: " + opcional + ".\n");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando: ");
        System.out.println("Preparo:  0%");
        System.out.println("Preparo: 25%");
        System.out.println("Preparo: 50%");
        System.out.println("Preparo: 75%");
        System.out.println("Preparo:100%\n");
    }

    @Override
    public void solicitarEntrega() {
        System.out.println("Solicitação de entrega: ");
        System.out.println("Pizza pronta para envio.");
        System.out.println("Pizza enviada.\n");
    }

    public PizzaBaggioStrogonoff(String sabor, int valor, String opcional) {
        this.valor = valor;
        this.sabor = sabor;
        this.opcional = opcional;
    } 
}
