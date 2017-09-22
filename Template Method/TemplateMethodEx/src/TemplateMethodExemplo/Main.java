/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethodExemplo;

import decorator.*;

/**
 *
 * @author Marcos Felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] semAdicional = {"Sem"};
        String[] palmitoAdicional = {"Palmito"};
        String[] ChampignonAdicional = {"Champignon"};
        String[] doisAdicional = {"Champignon", "Palmito"};
        String[] nAdicional = {"Champignon", "Palmito", "Champignon", "Palmito", "Champignon", "Palmito", "Champignon", "Palmito"};
        
        System.out.println("Pizza de Atum: ");
        PizzaAtum pizzaAtum = new PizzaAtum();
        pizzaAtum.iniciar(semAdicional);

        System.out.println("\n============================================\n");

        System.out.println("Pizza de Atum com Palmito: ");
        PizzaAtum pizzaAtumP = new PizzaAtum();
        pizzaAtumP.iniciar(palmitoAdicional);

        System.out.println("\n============================================\n");

        System.out.println("Pizza de Atum com Champignon: ");
        PizzaAtum pizzaAtumC = new PizzaAtum();
        pizzaAtumC.iniciar(ChampignonAdicional);

        System.out.println("\n============================================\n");
        
        System.out.println("Pizza de Atum com Champignon: ");
        PizzaAtum pizzaAtumD = new PizzaAtum();
        pizzaAtumD.iniciar(doisAdicional);

        System.out.println("\n============================================\n");
        
        System.out.println("Pizza Cinco Queijos: ");
        PizzaCincoQueijos pizzaCincoQueijos = new PizzaCincoQueijos();
        pizzaCincoQueijos.iniciar(semAdicional);

        System.out.println("\n============================================\n");

        System.out.println("Pizza Cinco Queijos com Palmito: ");
        PizzaCincoQueijos pizzaCincoQueijosP = new PizzaCincoQueijos();
        pizzaCincoQueijosP.iniciar(palmitoAdicional);

        System.out.println("\n============================================\n");

        System.out.println("Pizza Cinco Queijos com Champignon: ");
        PizzaCincoQueijos pizzaCincoQueijosC = new PizzaCincoQueijos();
        pizzaCincoQueijosC.iniciar(ChampignonAdicional);
        
        System.out.println("\n============================================\n");
        
        System.out.println("Pizza de Atum com Champignon e com Palmito: ");
        PizzaCincoQueijos pizzaCincoQueijosD = new PizzaCincoQueijos();
        pizzaCincoQueijosD.iniciar(doisAdicional);
        
        System.out.println("\n============================================\n");
        
        System.out.println("Pizza de Atum com N adicionais: ");
        PizzaCincoQueijos pizzaCincoQueijosN = new PizzaCincoQueijos();
        pizzaCincoQueijosN.iniciar(nAdicional);
    }
}