/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Marcos Felipe
 */
public class BoletoItau implements Boleto {
    
    public String dadosBoleto() {
        
        return "boleto bradesco: XXXXX.YYYYY.ZZZZZZZ - Vencimento X/Y/Z";
    }
}
