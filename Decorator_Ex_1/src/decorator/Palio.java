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
public class Palio implements Carro {

    String ano;
    String motor;
    String cor;
    boolean build;

    @Override
    public void construir(String ano, String motor, String cor) {

        this.ano = ano;
        this.motor = motor;
        this.cor = cor;
        this.build = true;

    }

    @Override
    public String informacoes() {
        
        if (this.build) {
            return "\nConstruido: Palio \nAno: " + this.ano + "\nMotor: " + this.motor + "\nCor: " + this.cor;
        } else {
            return "\nCarro não construido.";
        }
        
    }
}
