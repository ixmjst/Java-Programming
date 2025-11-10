/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import exercicio3.Funcionario1;
/**
 *
 * @author IXMJ.S.T
 */
public class TesteFuncionario {
    public static void testefuncionario(){
      Funcionario1 jose= new Funcionario1("Jose",200000f);
        System.out.println( jose.toString());;
      jose.aumentarSalario();
        System.out.println( jose.toString());
    
    }
    
}
