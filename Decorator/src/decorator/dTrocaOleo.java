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
public class dTrocaOleo implements ServicoAutomotivo {

    private ServicoAutomotivo servico;

    public dTrocaOleo(ServicoAutomotivo servico) {
        this.servico = servico;
    }

    @Override
    public float custo() {
        return this.servico.custo() + 250.00f;
    }

    @Override
    public String descricao() {
        return  "Troca de óleo, " + this.servico.descricao();
    }

}
