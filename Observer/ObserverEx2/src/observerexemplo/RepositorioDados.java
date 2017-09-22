/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexemplo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos Felipe
 */
// Repositório para o conjunto de dados
public class RepositorioDados {
    
    protected List<String> lista;
    protected List<int[]> valor;
    
    public RepositorioDados() {
        
        this.lista = new ArrayList<>();
        this.valor = new ArrayList<>();
        
    }
}
