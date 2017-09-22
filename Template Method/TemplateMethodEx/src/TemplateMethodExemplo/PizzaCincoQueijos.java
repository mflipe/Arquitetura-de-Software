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
public class PizzaCincoQueijos extends Pizza {

    public void massa() {
        System.out.println("Massa Pizza Cinco Queijos.");
    }

    public void molho() {
        System.out.println("Molho Pizza Cinco Queijos.");
    }

    public void recheio() {
        System.out.println("Recheio Pizza Cinco Queijos.");
    }

    public void assar() {
        System.out.println("Pizza de Cinco Queijos Assada.");
    }
    
    public float custo() {
        return 40.00f;
    }

    public String descricao() {
        return "Pizza Cinco Queijos: R$" + this.custo();
    }
}
