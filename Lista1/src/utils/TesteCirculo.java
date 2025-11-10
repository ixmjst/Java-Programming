/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import exercicio10.Circulo;
/**
 *
 * @author IXMJ.S.T
 */
public class TesteCirculo {
    
    public static void testecirculo(){
       Circulo circulo=new Circulo(3);
       circulo.calcularArea();
       circulo.calcularPerimetro();
        System.out.println(circulo.toString());
      
    }
    
}
