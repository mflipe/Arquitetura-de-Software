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
public class PizzariaBaggio extends Pizzaria{
 
    @Override
    public Pizza criarPizza(String sabor, int valor, String opcional) {
        
        if( "Queijo".equals(sabor)){
            PizzaBaggioQueijo pizzaCriada;
            pizzaCriada = new PizzaBaggioQueijo(sabor, valor, opcional);
            return pizzaCriada;
        }
        if( "Strogonoff".equals(sabor)){
            PizzaBaggioStrogonoff pizzaCriada;
            pizzaCriada = new PizzaBaggioStrogonoff(sabor, valor, opcional);
            return pizzaCriada;
        } 
        if( "Marguerita".equals(sabor)){
            PizzaBaggioMarguerita pizzaCriada;
            pizzaCriada = new PizzaBaggioMarguerita(sabor, valor, opcional);
            return pizzaCriada;
        }
        else {
            System.out.println("Sabor não encontrado.");
            return null;
        }
    } 
}
