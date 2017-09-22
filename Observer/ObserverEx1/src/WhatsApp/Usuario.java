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
public class Usuario implements Observer {

    protected String nome;
    protected UserService service;
    
    public Usuario(String nome, UserService service) {
        this.nome = nome;
        this.service = service;
    }

    
    @Override
    public void update() {
        service.getState();
    }
}
