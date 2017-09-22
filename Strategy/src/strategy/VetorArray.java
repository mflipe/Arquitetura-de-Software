/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Arrays;

/**
 *
 * @author Marcos Felipe
 */
public class VetorArray {

    int quantidade;
    int[] vetor;

    public VetorArray(int quantidade) {
        
        this.vetor = new int[quantidade];
        
        for (int i = 0; i < vetor.length; i++) {
            this.vetor[i] = (int) (Math.random() * quantidade);
        }
        
    }
    
    public void ordena(Sort sort) {
        sort.ordena(this.vetor);
    }
    
    public void mostrar(){
        System.out.println(Arrays.toString(this.vetor));
    } 

}
