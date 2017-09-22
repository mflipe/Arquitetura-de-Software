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
public class dChampignon implements Adicionais {

    private Adicionais servico;

    public dChampignon(Adicionais servico) {
        this.servico = servico;
    }

    public float custo() {
        return this.servico.custo() + 5.00f;
    }

    public String descricao() {
        return "Champignon: R$" + 5.00f + "\n" + this.servico.descricao();
    }

}
