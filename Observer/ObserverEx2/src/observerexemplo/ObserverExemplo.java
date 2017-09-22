/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexemplo;

/**
 *
 * @author Marcos Felipe
 */
public class ObserverExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] valor = new int[5];
        int[] valor2 = new int[6];
        int[] valor3 = new int[1];
        int[] valor4 = new int[10];

        UserService service = new UserService();

        Observer usuarioT = new Tabela(service);
        Observer usuarioG = new Grafico(service);

        service.attach(usuarioT);
        service.attach(usuarioG);

        service.setState("Compra 1", valor);
        service.setState("Compra 2", valor2);

        //service.detach(usuarioT);

        service.setState("Compra 3", valor3);

        //service.attach(usuarioT);

        service.setState("Compra 4", valor4);

        service.detach(usuarioG);

    }
}
