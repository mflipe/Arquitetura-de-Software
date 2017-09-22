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
public class Tabela implements Observer {

    protected UserService service;
    protected RepositorioDados dados;

    public Tabela(UserService service) {
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
            System.out.println("*    " + this.dados.lista.get(i)
                    + "            "
                    + this.dados.valor.get(i).length);
        }
        System.out.println("*************************************************");

    }

}
