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
public class dAlinhamento implements ServicoAutomotivo {

    private ServicoAutomotivo servico;
    
    public dAlinhamento(ServicoAutomotivo servico) {
        this.servico = servico;
    }
    
    @Override
    public float custo() {
        return this.servico.custo() + 60.00f;
    }

    @Override
    public String descricao() {
        return "Alinhamento das Rodas, " + this.servico.descricao();
    }
}
