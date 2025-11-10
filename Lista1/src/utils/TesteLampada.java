/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import exercicio6.Lampada;
/**
 *
 * @author IXMJ.S.T
 */
public class TesteLampada {
  public static void testelampada(){
      Lampada lampada1=new Lampada("Led",220,"Branca","Samsung",150,30f,false);
       Lampada lampada2=new Lampada("Fluorescente",110,"Azul","Light",300,30f,true);
       
       System.out.println(lampada1.toString());
       System.out.println(lampada2.toString());
       lampada1.acenderLampada();
       lampada2.desligarLampada();
       if((lampada1.getPotencia())>(lampada2.getPotencia())){
             System.out.println("A lampada da "+lampada1.getMarca()+" eh mais Potente do que a lampada "+lampada2.getMarca());
       }
       else if((lampada1.getPotencia())==(lampada2.getPotencia())){System.out.println("Possuem a mesma Potencia");}
       else{
               System.out.println("A lampada da "+lampada2.getMarca()+" eh mais Potente do que a lampada "+lampada1.getMarca());
    
       }
       
       String v=(lampada1.getPreco()>lampada2.getPreco())? "A lampada "+lampada1.getMarca()+" eh mais cara que a lampada"+lampada2.getMarca():"A lampada da "+lampada2.getMarca()+" eh mais cara que a lampada "+lampada2.getMarca();
        System.out.println(v);
        
        System.out.println(lampada1.toString());
       System.out.println(lampada2.toString());
        
  }
}
