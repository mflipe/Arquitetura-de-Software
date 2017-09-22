/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexemplo;

/**
 *
 * @author Marcos Felipe
 */

// Interface do objeto único que queremos observar
// E manter atualizado em diversos clientes.
public interface Subject {
    
    // Adiciona um novo observer na lista de observers
    public void attach(Observer observer);
    
    // Remove um novo observer da lista de observers
    public void detach(Observer observer);
    
    // Método responsável por notificar os observers
    // Quando o objeto subject for alterado.
    public void notificar();
    
}
