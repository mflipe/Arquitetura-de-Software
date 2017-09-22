package singleton;

/**
 *
 * @author Marcos Felipe
 */
import java.util.ArrayList;
import java.util.Arrays;
import static singleton.Singleton.*;

public class arrayLists{
    
    public static void main(String[] args){
        
        Singleton s = Singleton.getInstancia();

        s.adicionar("Marcos");
        s.adicionar("Felipe");
        s.adicionar("Soares");
        s.adicionar("Rocha");

        s.buscar("Soares");

        s.remover("Rocha");

        s.listar();
        
        relatorio a = new relatorio();
        a.gerarRelatorio("Felipe", "LUCAS");
    }
    
}