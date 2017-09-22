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
public abstract class CartaoCredito {
    
    protected String nome;
    protected String senha;
    protected String codigo;
    protected Double limite;
    
    public abstract void liberaLimite();
    public abstract void codigoSeguranca();
    public abstract void senha();
    public abstract void emitir();
}
