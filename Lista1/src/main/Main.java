package main;
import java.util.Scanner;

import utils.TesteAluno;
import utils.TesteTelevisor;
import utils.TesteFuncionario;
import utils.TesteCaneta;
import utils.TesteCliente;
import utils.TesteLampada;
import utils.TestePessoa;
import utils.TestePorta;
import utils.TesteRectangulo;
import utils.TesteCirculo;
import utils.TesteFuncion;
import utils.TesteLivro;

/**
 *
 * @author IXMJ.S.T
 */
public class Main {
    public static void main (String [] args){
        Scanner ler= new Scanner(System.in);
         short opt;
      do {
      System.out.println("---------------------------LISTA 1--------------------------------");
      System.out.println("1-Ex.1");
      System.out.println("2-Ex.2");
      System.out.println("3-Ex.3");
      System.out.println("4-Ex.4");
      System.out.println("5-Ex.5");
      System.out.println("6-Ex.6");
      System.out.println("7-Ex.7");
      System.out.println("8-Ex.8");
      System.out.println("9-Ex.9");
      System.out.println("10-Ex.10");
      System.out.println("11-Ex.11");
      System.out.println("12-Ex.12");
      System.out.println("13-Ex.12");
      System.out.println("14-Ex.14");
      
          System.out.print("R% ");
               opt=ler.nextShort();
               
           switch(opt){
           
               case 1:
                     TesteAluno.teste1();
                   break;
                   
               case 2:
                    TesteTelevisor.testeTv();
                    break;
               case 3:
                     TesteFuncionario.testefuncionario();
                    break;
               case 4:
                      TesteCaneta.testecaneta();
                     break;
               case 5:
                      TesteCliente.testecliente();
                   break;
               case 6:
                   TesteLampada.testelampada();
                     break;
               case 7:
                    TestePessoa.testepessoa();
                    break;
               case 8:
                     TestePorta.testeporta();
                     break;
               case 9:
                    TesteRectangulo.testerectangulo();
                     break;
               case 10:
                     TesteCirculo.testecirculo();
                   break;
               case 11:
                   TesteFuncion.testefuncion();
                   break;
               case 12:
                   TesteLivro.testelivro();
                   break;
               case 13:
                   break;
                      
                   
                     
           
           }
              
              

      
      }while(opt!=0);
    }
}
