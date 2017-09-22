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

// Interface dos dependetes do objeto Subject
// Ou seja, a interface dos cliente que desejam observar
// e manter o Subject atualizado
// Observer
public interface Observer {
    
    // Atualiza os dados no Observer
    // Método chamado pelo Subject
    public void update();
}
