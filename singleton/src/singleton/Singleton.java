/**
* Você deve desenvolver um repositório de alunos usando o < Padrão Singleton >
* , ou seja, esta classe deve conter uma < lista de alunos > e deve gerenciar 
* sua própria instância. 
* []
* 
* Esta classe Singleton também deve disponibilizar métodos
* para < salvar >, < remover >, < buscar > e < retornar > a lista de alunos.
* [OK]
* 
* Para realizar os testes, construa algumas classes que utilizem o Singleton
* e manipulem a lista de alunos. 
* Por exemplo, 
* uma classe < Relatório > e uma classe < Consulta > ao Histórico do Aluno.
* []
*/
package singleton;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author Marcos Felipe
 */

public class Singleton {
    
    private static ArrayList<String> alunos = new ArrayList<String> ();
    
    // Atributo instancia do tipo Singleton
    // Responável por salvar a instância única da classe
        // private static Singleton instancia;
    private static Singleton instancia;
       
    // Construtor deve ser privado, assim evita-se que
    // novas instâncias sejam criadas por classes externas
    private Singleton(){};

    // Metodo que retorna a instância de uma classe
    public static Singleton getInstancia(){

        // Se a instância não existir ainda
        if(instancia == null){
            // Cria uma nova instância de Singleton
            instancia = new Singleton();
        }
    
        // Retorna a instância de Singleton
        return instancia;
    }
    
    
    // Método Adicionar aluno 
    public static void adicionar(String nome){
        instancia.alunos.add(nome);
        System.out.print( "Adicionando aluno:" );
        System.out.println(Arrays.toString(instancia.alunos.toArray() ) );
    }
    
   // Método modificar aluno 
    public static void modificar(String nome1,String nome2){
        instancia.alunos.add(instancia.alunos.indexOf(nome1), nome2);
    }  

    // Método buscar aluno
    public static void buscar(String nome){
        System.out.println( "Buscando: " );
        System.out.println("O aluno " + alunos.get(instancia.alunos.indexOf(nome)) + " está na lista." );
    }                        

    // Método remover aluno
    public static void remover(String nome){
        System.out.println( "Removendo aluno: " + nome );
        instancia.alunos.remove(nome);
        System.out.println(Arrays.toString(instancia.alunos.toArray() ) );
    }             

    // Método listar todos os alunos
    public static void listar(){
        System.out.println( "Lista completa: ");
        System.out.println(Arrays.toString(instancia.alunos.toArray() ) );
    }
}
