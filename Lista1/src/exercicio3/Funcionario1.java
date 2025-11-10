package exercicio3;



public class Funcionario1 {
    
    private String nome;
    private float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Funcionario1(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario1{" + "nome=" + nome + ", salario=" + salario + '}';
    }
    
    public void aumentarSalario(){
        
        this.salario=(float)(this.salario+(this.salario*0.5));
        
    
    }
    
    
}
