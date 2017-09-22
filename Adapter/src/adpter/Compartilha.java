/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adpter;

/**
 *
 * @author Marcos Felipe
 */
public interface Compartilha {
    
    public void tipo (String tipo);
    
    public void para (String amigo);
    
    public void foto (String foto);
    
    public void texto (String descricao);
    
    public void enviar();
}
