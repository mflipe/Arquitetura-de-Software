/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethodExemplo;

/**
 *
 * @author Marcos Felipe
 */
public abstract class Compilador {
    
    public final void iniciar() {
        this.carregarCodigoFonte();
        this.gerarIcones();
        this.gerarApp();
        this.publicar();
        this.fim();
    }
    
    public abstract void carregarCodigoFonte();
    public abstract void gerarIcones();
    public abstract void gerarApp();
    public abstract void publicar();
    
    public void fim() {
        System.out.println("Processo finalizado!");
    }
    
}
