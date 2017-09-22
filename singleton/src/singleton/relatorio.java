/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Marcos Felipe
 */
public class relatorio {
    
    public void gerarRelatorio(String nome1, String nome2){
         Singleton s = Singleton.getInstancia();
         s.listar();
         System.out.print( "Mudando o nome do aluno " + nome1 + "  para " + nome2 + "." );
         s.modificar(nome1, nome2);
         s.listar();
    }
    
    public relatorio(){};
}
