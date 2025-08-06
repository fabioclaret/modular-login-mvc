
package escola;

public class Professor extends Pessoa{
  public Professor(String nome, String cpf, String dataNascimento){
        super(nome, cpf, dataNascimento);
    }
    
    public Professor(String nome, String cpf){
        super(nome, cpf);
    }
    public Professor(String nome){
        super(nome);
    }
  
}
