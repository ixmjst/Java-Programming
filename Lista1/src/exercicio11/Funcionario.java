/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio11;

/**
 *
 * @author IXMJ.S.T
 */
public class Funcionario {
     private String nome;
    private String Sobrenome ;
    private int horastrabalhadas;
    private float valorporhora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public int getHorastrabalhadas() {
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(int horastrabalhadas) {
        this.horastrabalhadas = horastrabalhadas;
    }

    public float getValorporhora() {
        return valorporhora;
    }

    public void setValorporhora(float valorporhora) {
        this.valorporhora = valorporhora;
    }

    public Funcionario(String nome, String Sobrenome, int horastrabalhadas, float valorporhora) {
        this.nome = nome;
        this.Sobrenome = Sobrenome;
        this.horastrabalhadas = horastrabalhadas;
        this.valorporhora = valorporhora;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", Sobrenome=" + Sobrenome + ", horastrabalhadas=" + horastrabalhadas + ", valorporhora=" + valorporhora + '}';
    }
    
     public String nomeCompleto(){
        return nome+" "+Sobrenome;
    }
    
    public void calcularSalario(){
       float salario= valorporhora * horastrabalhadas;
        System.out.println("Salario Total: "+salario+" Kz");
    
    }
    
    public void incrementarHoras (int horas){
       this.horastrabalhadas=horastrabalhadas+horas;
    }    
    
}
