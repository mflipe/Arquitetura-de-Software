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
public class dBordas implements Forma {

    private Forma adicional;
    boolean borda;

    public dBordas(Forma adicional) {

        this.adicional = adicional;
        this.borda = true;

    }

    @Override
    public String desenhar() {

        if (this.borda) {
            return this.adicional.desenhar() + "com borda ";
        } else {
            return this.adicional.desenhar();
        }

    }
}
