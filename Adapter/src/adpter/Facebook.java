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
public class Facebook implements Compartilha {
    
    String tipo;
    String amigo;
    String foto;
    String descricao;
    
    @Override
    public void tipo(String tipo) {
       System.out.println("Compartilhado na " + tipo + ".");
       this.tipo = tipo;
    }

    @Override
    public void para(String amigo) {
        System.out.println("Compartilhado com " + amigo + ".");
        this.amigo = amigo;
    }

    @Override
    public void foto(String foto) {
        System.out.println("Compartilhado a " + foto + ".");
        this.foto = foto;
    }

    @Override
    public void texto(String descricao) {
        System.out.println(descricao);
        this.descricao = descricao;
    }

    @Override
    public void enviar() {
        System.out.println("Compartilhado com sucesso no Facebook.");
    }
}
