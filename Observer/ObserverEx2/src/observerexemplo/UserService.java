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
public class UserService implements Subject {

    protected List<Observer> observers;
    protected RepositorioDados dados;

    public UserService() {
        this.observers = new ArrayList<>();
        this.dados = new RepositorioDados();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }
    
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }
    
    public void notificar() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
    
    // Responsável por atualizar o estado do objeto único
    public void setState(String dado, int[] valor) {
        this.dados.lista.add(dado);
        this.dados.valor.add(valor);
        notificar();
    }
    
    // Retorna o objeto único
    // Em nosso caso o objeto de usuários conectados
    public RepositorioDados getState() {
        return this.dados;
    }
}