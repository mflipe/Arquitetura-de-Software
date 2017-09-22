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
public class CompiladorAndroid extends Compilador {

    public void carregarCodigoFonte() {
        System.out.println("Carregando código-fonte.");
    }

    public void gerarIcones() {
        System.out.println("Gerando ícones para Android.");
    }

    public void gerarApp() {
        System.out.println("Gerando App para Android.");
    }

    public void publicar() {
        System.out.println("Publicando na Play Store");
    }
}
