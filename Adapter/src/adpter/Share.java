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
public interface Share {
    
    public void to (String tipo);
    
    public void caption (String amigo);
    
    public void picture (String foto);
    
    public void send();
}
