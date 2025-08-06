
package escola;

public class Funcionario extends Pessoa{
   public Funcionario(String nome, String cpf, String dataNascimento){
        super(nome, cpf, dataNascimento);
    }
    
    public Funcionario(String nome, String cpf){
        super(nome, cpf);
    }
    public Funcionario(String nome){
        super(nome);
    }

}
