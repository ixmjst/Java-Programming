package utils;
import java.time.LocalDate;
import exercicio1.Aluno;

public class TesteAluno{
    public static void teste1(){
     Aluno jose= new Aluno(LocalDate.of(2010,10,10),"Paulo",60,170);
     
        System.out.println(jose.toString());
        
        System.out.println(jose.calcularIdade());
     
    
    }
}
