/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethodExemplo;

import decorator.*;

/**
 *
 * @author Marcos Felipe
 */
public abstract class Pizza implements Adicionais {

    public Adicionais Adicional;

    public final void iniciar(String[] adicional) {

        this.Adicional = new SemAdicional();

        this.massa();
        this.molho();
        this.recheio();

        System.out.println(this.descricao());

        this.adicional(adicional);

        System.out.println("Total: R$" + (this.custo() + this.Adicional.custo()));

        this.assar();
        this.fim();

    }

    public abstract void massa();

    public abstract void molho();

    public abstract void recheio();

    public void adicional(String[] adicional) {
        System.out.println("Adicionais: ");

        for (int i = adicional.length - 1; i >= 0; i--) {
            switch (adicional[i]) {
                case "Palmito":
                    this.Adicional = new dPalmito(this.Adicional);
                    //System.out.println(this.Adicional.descricao());
                    break;
                case "Champignon":
                    this.Adicional = new dChampignon(this.Adicional);
                    //System.out.println(this.Adicional.descricao());
                    break;
                default:
                    this.Adicional = new SemAdicional();
                    //System.out.println("Sem adicionais.");
                    break;
            }
        }
        if (adicional.length > 0) {
            System.out.println(this.Adicional.descricao());
        } else {
            System.out.println("Sem adicionais.");
        }
    }

    public abstract void assar();

    public void fim() {
        System.out.println("Pizza pronta");
    }
}
