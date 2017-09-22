/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityexemplo;

/**
 *
 * @author Marcos Felipe
 */
public class ChainofResponsibilityExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SituacaoCasa situacao = new SituacaoCasa();
        
        Portas portas = new Portas();
        Luzes luzes = new Luzes();
        Alarme alarme = new Alarme();
        
        portas.setSucessor(luzes);
        luzes.setSucessor(alarme);
        
        portas.checar(situacao);
    }
    
}
