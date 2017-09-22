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
public class Whatsapp implements Share {
    
    @Override
    public void to(String number) {
        System.out.println("Compartilhado com " + number + ".");
    }

    @Override
    public void caption(String description) {
        System.out.println(description);
    }

    @Override
    public void picture(String picture) {
        System.out.println(picture);
    }

    @Override
    public void send() {
        System.out.println("Compartilhado com sucesso no Whatsapp.");
    }
    

}
