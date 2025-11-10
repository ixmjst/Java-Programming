/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import exercicio7.Pessoa;
/**
 *
 * @author IXMJ.S.T
 */
public class TestePessoa {
    public static void testepessoa(){
       Pessoa jose=new  Pessoa("Jose",12);
       jose.dizerONome();
       jose.dizerAIdade();
       jose.fazerAnivesario();
       
        System.out.println(jose.toString());
        
       
    }
}
