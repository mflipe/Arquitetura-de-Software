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
public abstract class Pizzaria {
    
    public abstract Pizza criarPizza(String sabor, int valor, String opcional);
    
    public Pizza pedirPizza(String sabor, int valor, String opcional) {
        
        Pizza p = criarPizza(sabor, valor, opcional);
        
        p.cobrar();
        p.preparar();
        p.solicitarEntrega();
        
        return p;
    }
}
