  
package escola;

import javax.swing.JOptionPane;


public class Pessoa {
    public String nome;
    public String cpf;
    public String dataNascimento;
    
    
    public Pessoa(String nome, String cpf, String dataNascimento){
        this.nome           = nome;
        this.cpf            = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    public Pessoa(String nome, String cpf){
        this.nome           = nome;
        this.cpf            = cpf;
    }
    
    public Pessoa(String nome){
        this.nome           = nome;
    }
    
    public void mostrarDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCPF: " + cpf + "\nNascimento: " + dataNascimento );
    }
    
    
    
    
    
    
}
