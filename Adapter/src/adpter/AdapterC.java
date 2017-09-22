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
public class AdapterC implements Compartilha {
    
    private Whatsapp shareWhatsapp;
                            
    public AdapterC(Whatsapp shareWhatsapp) {
        this.shareWhatsapp = shareWhatsapp; // NÃO ESQUECER DESSE!
    }

    @Override
    public void tipo(String tipo) {
        System.out.println("Tipo");
    }

    @Override
    public void para(String amigo) {
        this.shareWhatsapp.to(amigo); // to
    }

    @Override
    public void foto(String foto) {
        this.shareWhatsapp.picture(foto); // picture.
    }

    @Override
    public void texto(String descricao) {
        this.shareWhatsapp.caption(descricao); // caption
    }

    @Override
    public void enviar() {
       this.shareWhatsapp.send(); // send.
    }
}
