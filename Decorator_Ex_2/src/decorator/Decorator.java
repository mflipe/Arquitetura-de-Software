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
public class Decorator {

    public static void main(String[] args) {

        Forma desenho = new Circulo();
        System.out.println(desenho.desenhar());

        desenho = new dBackground(desenho);
        System.out.println(desenho.desenhar());

        desenho = new dBordas(desenho);
        System.out.println(desenho.desenhar());

        Forma desenho2 = new dBackground(new dBordas(new Circulo()));
        System.out.println(desenho2.desenhar());

    }
}
