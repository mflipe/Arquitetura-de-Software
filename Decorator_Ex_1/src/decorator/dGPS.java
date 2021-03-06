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
public class dGPS implements Carro {

    private Carro adicional;
    boolean gps;

    public dGPS(Carro adicional) {

        this.adicional = adicional;
        this.gps = true;

    }

    @Override
    public void construir(String ano, String motor, String cor) {

        this.adicional.construir(ano, motor, cor);

    }

    @Override
    public String informacoes() {

        if (this.gps) {
            return this.adicional.informacoes() + "\nGPS incluso";
        } else {
            return this.adicional.informacoes();
        }

    }
}
