/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import exercicio9.Rectangulo;
/**
 *
 * @author IXMJ.S.T
 */
public class TesteRectangulo {
    public static void testerectangulo(){
    
         Rectangulo rectangulo= new Rectangulo(10f,5f);
         
         rectangulo.calcularArea();
         rectangulo.calcularPerimetro();
         System.out.println(rectangulo.toString());
         rectangulo.setLado2(7);
         rectangulo.calcularArea();
         rectangulo.calcularPerimetro();
    
    }
}
