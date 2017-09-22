/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartaocredito;

/**
 *
 * @author Marcos Felipe
 */
public class CartaoCreditoBradesco extends CartaoCredito{
    
    public CartaoCreditoBradesco(){
        this.nome = "Cliente";
    }

    public void liberaLimite(){
        this.limite = 1000.00;
    }

    public void codigoSeguranca(){
        this.codigo = "123";
    }

    public void senha(){
        this.senha = "123456";
    }

    public void emitir(){
        System.out.println("Gerar o cartão de crédito Bradesco Diners.");
    }
} 
