/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhatsApp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos Felipe
 */
// UserService
public class UserService implements Grupo {

    protected List<Observer> observers;
    protected Mensagens mensagem;
    protected UsuariosConectados usuarios;

    public UserService() {
        this.observers = new ArrayList<>();
        this.mensagem = new Mensagens();
        this.usuarios = new UsuariosConectados();

    }

    public void attach(Usuario observer) {
        System.out.println(observer.nome + " se conectou.");
        this.observers.add(observer);
        this.usuarios.lista.add(observer.nome);
    }

    public void detach(Usuario observer) {
        System.out.println(observer.nome + " se desconectou.");
        this.observers.remove(observer);
        this.usuarios.lista.remove(observer.nome);
    }

    public void notificar() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // Responsável por atualizar o estado do objeto único
    public void setState(Usuario usuario, String mensagem) {
        this.mensagem.lista.add(usuario.nome + ": " + mensagem);
        notificar();
    }

    // Retorna o objeto único
    // Em nosso caso o objeto de usuários conectados
    public Mensagens getState() {

        for (int i = 0; i <= this.mensagem.lista.size() - 1; i++) {
            System.out.println(this.mensagem.lista.get(i));
        }

        return this.mensagem;
    }

    public UsuariosConectados getOn() {
        
        System.out.println("Número de usuario conectados: " + (this.usuarios.lista.size()));
        
        if(this.usuarios.lista.isEmpty()){
            System.out.println("Todos estão desconectados");
        }
       
        for (int i = 0; i <= this.usuarios.lista.size() - 1; i++) {
            System.out.println(this.usuarios.lista.get(i));
        }
        
        return this.usuarios;
    }
}
