/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexemplo;

import java.util.Arrays;

/**
 *
 * @author Marcos Felipe
 */
public class Grafico implements Observer {

    protected UserService service;
    protected RepositorioDados dados;

    public Grafico(UserService service) {
        this.service = service;
    }

    @Override
    public void update() {
        // Coleta dos dados
        this.dados = service.getState();

        // Vizualização
        System.out.println("*************************************************");
        System.out.println("* Coluna 1"
                + "            "
                + "Valores");
        for (int i = 0; i <= this.dados.lista.size() - 1; i++) {
            System.out.printf("*    " + this.dados.lista.get(i)
                    + "            ");
            for(int j=0; j<=this.dados.valor.get(i).length-1; j++){
                System.out.printf("|");
            }
            System.out.printf("\n");
        }
        System.out.println("*************************************************");

    }

}
