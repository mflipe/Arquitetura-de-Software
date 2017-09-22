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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Adicionais servico = new SemAdicional();
        
        System.out.println(servico.descricao());
        System.out.println(servico.custo());
        
        servico = new dPalmito(new SemAdicional());
        
        System.out.println(servico.descricao());
        System.out.println(servico.custo());
        
        servico = new dPalmito(new dChampignon(new SemAdicional()));
        
        System.out.println(servico.descricao());
        System.out.println(servico.custo());
    }
    
}
