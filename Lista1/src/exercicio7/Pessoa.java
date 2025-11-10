/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

/**
 *
 * @author IXMJ.S.T
 */
public class Pessoa {
     private String nome;
     private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome:" + nome + ", idade: " + idade + '}';
    }
        public void dizerONome(){System.out.println("Ola meu nome e "+nome);}
        public void dizerAIdade(){System.out.println("Ola eu tenho "+idade+" anos de Idade");}
        public void fazerAnivesario(){idade++;}
}
