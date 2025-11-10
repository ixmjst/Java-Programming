/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import exercicio2.Televisor;
import java.util.Scanner;
/**
 *
 * @author IXMJ.S.T
 */
public class TesteTelevisor {
    public static void testeTv(){
         Scanner ler= new Scanner(System.in);
          Televisor tv1= new Televisor(10,9);
          System.out.println(tv1.toString());
          int op;
        do{
        
            System.out.println("1-Aumentar Volume");
            System.out.println("2-Diminuir Volume");
            System.out.println("3-Trocar de Canal");
            System.out.println("4-Mostrar estado do Televisor");
              op=ler.nextInt();
              
            switch(op){
                case 1:
                      tv1.aumentarVolume();
                      break;
                case 2:
                     tv1.diminuirVolume();
                     break;
                case 3:
                    int canal;
                        System.out.println("Digite o canal:");
                        canal=ler.nextInt();
                        tv1.trocarCanal(canal);
                     break;
                case 4:
                        System.out.println(tv1.toString()); 
                        break;
                default: 
                       System.out.println("Opcao Invalida");
                  
                  
            }
        
        }while(op!=0);
          
          
    
    }
}
