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
public class dPalmito implements Adicionais {

    private Adicionais servico;

    public dPalmito(Adicionais adicional) {
        this.servico = adicional;
    }

    public float custo() {
        return this.servico.custo() + 5.00f;
    }

    public String descricao() {
        return "Palmito: R$" + 5.00f + "\n" + this.servico.descricao();
    }

}
