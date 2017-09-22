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
    protected UsuariosConectados usuarios;

    public UserService() {
        this.observers = new ArrayList<>();
        this.usuarios = new UsuariosConectados();
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
    public void setState(String usuario) {
        this.usuarios.lista.add(usuario);
        notificar();
    }
    
    // Retorna o objeto único
    // Em nosso caso o objeto de usuários conectados
    public UsuariosConectados getState() {
        return this.usuarios;
    }
}
    