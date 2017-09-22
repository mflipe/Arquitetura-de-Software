/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Marcos Felipe
 */
public class dBackground implements Forma {

    private Forma adicional;
    boolean bg;

    public dBackground(Forma adicional) {

        this.adicional = adicional;
        this.bg = true;

    }

    @Override
    public String desenhar() {

        if (this.bg) {
            return this.adicional.desenhar() + "com background ";
        } else {
            return this.adicional.desenhar();
        }

    }
}
