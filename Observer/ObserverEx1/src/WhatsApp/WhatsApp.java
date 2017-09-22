/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhatsApp;

/**
 *
 * @author Marcos Felipe
 */
public class WhatsApp {

    public static void main(String[] args) {
        UserService whatsapp = new UserService();

        UsuariosConectados b = whatsapp.getOn();

        Usuario marcos = new Usuario("Marcos", whatsapp);
        Usuario felipe = new Usuario("Felipe", whatsapp);
        Usuario mfelipe = new Usuario("MFelipe", whatsapp);

        whatsapp.attach(marcos);
        whatsapp.attach(felipe);
        whatsapp.attach(mfelipe);

        whatsapp.setState(marcos, "Bom dia grupo");
        System.out.println("\n");
        whatsapp.setState(felipe, "Bom dia galera");

        whatsapp.detach(marcos);

    }
}
