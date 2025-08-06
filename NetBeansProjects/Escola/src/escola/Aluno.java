
package escola;

public class Aluno extends Pessoa{
    public Aluno(String nome, String cpf, String dataNascimento){
        super(nome, cpf, dataNascimento);
    }
    
    public Aluno(String nome, String cpf){
        super(nome, cpf);
    }
    public Aluno(String nome){
        super(nome);
    }
   
   
}
