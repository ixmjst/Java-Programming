/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import exercicio5.Cliente;
/**
 *
 * @author IXMJ.S.T
 */
public class TesteCliente {
    public static void testecliente(){
         Cliente jorge= new  Cliente ("Jorge Amado","1234567");
         System.out.println(jorge.toString());
         Cliente gelson= new  Cliente ("Gelson Borges","1567");
         System.out.println(gelson.toString());
         
    }
}
