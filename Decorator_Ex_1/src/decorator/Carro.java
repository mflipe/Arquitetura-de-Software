/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Marcos Felipe
 */
public interface Carro {      
    
    public void construir(String ano, String motor, String cor);
    
    public String informacoes();
    
}
