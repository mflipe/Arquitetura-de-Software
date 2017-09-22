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
public class dAr implements Carro {

    private Carro adicional;
    boolean ar;

    public dAr(Carro adicional) {

        this.adicional = adicional;
        this.ar = true;

    }

    @Override
    public void construir(String ano, String motor, String cor) {

        this.adicional.construir(ano, motor, cor);

    }

    @Override
    public String informacoes() {

        if (this.ar) {
            return this.adicional.informacoes() + "\nAr Condicionado incluso";
        } else {
            return this.adicional.informacoes();
        }

    }
}
