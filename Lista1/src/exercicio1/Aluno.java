package exercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
    
    private LocalDate dataDeNascimento;
    private String  nome;
    private float peso;
    private float altura;

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDatadeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Aluno(LocalDate datadeNascimento, String nome, float peso, float altura) {
        this.dataDeNascimento = datadeNascimento;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    public int calcularIdade(){
        LocalDate hoje = LocalDate.now();
        return Period.between(dataDeNascimento, hoje).getYears();
    }

    @Override
    public String toString() {
        return "Aluno{" + "dataDeNascimento=" + dataDeNascimento + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
}
