/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhatsApp;

/**
 *
 * @author Marcos Felipe
 */

// Interface do objeto único que queremos observar
// E manter atualizado em diversos clientes.
// Subject
public interface Grupo {
    
    // Adiciona um novo observer na lista de observers
    public void attach(Usuario observer);
    
    // Remove um novo observer da lista de observers
    public void detach(Usuario observer);
    
    // Método responsável por notificar os observers
    // Quando o objeto subject for alterado.
    public void notificar();
    
}
