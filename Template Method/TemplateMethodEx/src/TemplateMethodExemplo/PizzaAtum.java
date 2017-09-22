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
public class PizzaAtum extends Pizza {
    
    public void massa() {
        System.out.println("Massa Pizza de Atum.");
    }

    public void molho() {
        System.out.println("Molho Pizza de Atum.");
    }

    public void recheio() {
        System.out.println("Recheio Pizza de Atum.");
    }

    public void assar() {
        System.out.println("Pizza de Atum Assada.");
    }

    public float custo() {
        return 40.00f;
    }

    public String descricao() {
        return "Pizza de Atum: R$" + this.custo();
    }
}
