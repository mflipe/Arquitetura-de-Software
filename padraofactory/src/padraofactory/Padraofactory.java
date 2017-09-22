/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraofactory;

/**
 *
 * @author Marcos Felipe
 */
public class Padraofactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pizzaria pedirPizza = new PizzariaHappen();
            pedirPizza.pedirPizza("Queijo", 1, "Mais queijo");
            pedirPizza.pedirPizza("Banana", 2, "Mais bacon");
            pedirPizza.pedirPizza("Frango", 3, "Mais azeitonas");

        Pizzaria pedirPizza2 = new PizzariaBaggio();
            pedirPizza2.pedirPizza("Queijo", 4, "Mais ketchup");
            pedirPizza2.pedirPizza("Strogonoff", 5, "Mais maionese");
            pedirPizza2.pedirPizza("Marguerita", 6, "Mais mostarda");
    }
}
