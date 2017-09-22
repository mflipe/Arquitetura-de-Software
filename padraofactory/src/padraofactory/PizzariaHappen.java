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
public class PizzariaHappen extends Pizzaria{

    @Override
    public Pizza criarPizza(String sabor, int valor, String opcional) {
        
        if( "Queijo".equals(sabor)){
            PizzaHappenQueijo pizzaCriada;
            pizzaCriada = new PizzaHappenQueijo(sabor, valor, opcional);
            return pizzaCriada;
        }
        if( "Banana".equals(sabor)){
            PizzaHappenBanana pizzaCriada;
            pizzaCriada = new PizzaHappenBanana(sabor, valor, opcional);
            return pizzaCriada;
        } 
        if( "Frango".equals(sabor)){
            PizzaHappenFrango pizzaCriada;
            pizzaCriada = new PizzaHappenFrango(sabor, valor, opcional);
            return pizzaCriada;
        }
        else {
            System.out.println("Sabor não encontrado.");
            return null;
        }
    }
  
 }
