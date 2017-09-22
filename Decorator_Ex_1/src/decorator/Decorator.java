/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Marcos Felipe
 */
public class Decorator {

    public static void main(String[] args) {
        
        Carro carro = new Palio();
        System.out.println(carro.informacoes());
        carro.construir("2000", "1.0", "Rosa");
        System.out.println(carro.informacoes());
        
        carro = new dAr(carro);
        System.out.println(carro.informacoes());
        
        carro = new dCameraTraseira(carro);
        System.out.println(carro.informacoes());
        
        carro = new dGPS(carro);
        System.out.println(carro.informacoes());
        
        Carro carro2 = new dGPS(new dAr(new dCameraTraseira(new Palio())));
        carro2.construir("2017", "2.0", "Vermelho");
        System.out.println(carro2.informacoes());

    }
}
