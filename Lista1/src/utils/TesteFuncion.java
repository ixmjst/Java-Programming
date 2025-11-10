/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import exercicio11.Funcionario;
/**
 *
 * @author IXMJ.S.T
 */
public class TesteFuncion {
    public static void testefuncion(){
      Funcionario jose=new Funcionario("Jose","Tala",45,1500f);
      
        System.out.println(jose.nomeCompleto());
      jose.incrementarHoras(4);
      jose.calcularSalario();
        System.out.println(jose.toString());
        
    
    
    }
}
