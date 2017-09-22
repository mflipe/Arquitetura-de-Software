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
public class dCameraTraseira implements Carro {

    private Carro adicional;
    boolean cameraTraseira;

    public dCameraTraseira(Carro adicional) {

        this.adicional = adicional;
        this.cameraTraseira = true;

    }

    @Override
    public void construir(String ano, String motor, String cor) {

        this.adicional.construir(ano, motor, cor);

    }

    @Override
    public String informacoes() {

        if (this.cameraTraseira) {
            return this.adicional.informacoes() + "\nCâmera traseira inclusa";
        } else {
            return this.adicional.informacoes();
        }
        
    }
}
