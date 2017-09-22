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
public class RevisaoBasica implements ServicoAutomotivo {

    public float custo() {

        return 200.00f;
        
    }

    public String descricao() {
        
        return "Revisão Básica.";
        
    }
}
