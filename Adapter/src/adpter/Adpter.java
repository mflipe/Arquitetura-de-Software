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
public class Adpter {

    public void compartilha(Compartilha share) {
        
        share.tipo("Timeline");
        
        share.para("João da Silva");
        
        share.foto("Uma imagem aqui");
        
        share.texto("Descrição da imagem");
        
        share.enviar();
    }
    
    public static void main(String[] args) {

        //new Adpter().compartilha(new Facebook());
        
        new Adpter().compartilha(new AdapterC(new Whatsapp()));
        
        //AdapterC(compartilha);
    }
    
}
