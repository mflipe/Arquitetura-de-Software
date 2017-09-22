/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Marcos Felipe Referência: Métodos de ordenação de arrays#Adaptados
 * <http://www.devmedia.com.br/algoritmos-de-ordenacao-em-java/32693>
 *
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;

        System.out.println("InsertionSort:");
        VetorArray vet = new VetorArray(a);
        vet.mostrar();
        vet.ordena(new InsertionSort());
        vet.mostrar();

        System.out.println("BubbleSort:");
        VetorArray vet2 = new VetorArray(a);
        vet2.mostrar();
        vet2.ordena(new BubbleSort());
        vet2.mostrar();

        System.out.println("QuickSort:");
        VetorArray vet3 = new VetorArray(a);
        vet3.mostrar();
        vet3.ordena(new QuickSort());
        vet3.mostrar();

        System.out.println("SelectionSort:");
        VetorArray vet4 = new VetorArray(a);
        vet4.mostrar();
        vet4.ordena(new SelectionSort());
        vet4.mostrar();

    }

}
