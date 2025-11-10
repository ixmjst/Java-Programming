/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio13;

import java.util.ArrayList;
import exercicio13.Contato;
/**
 *
 * @author IXMJ.S.T
 */
public class Agenda {
         ArrayList <Contato> contatos= new ArrayList <Contato>();

    
   public void addContato(String nome,String numero){
         Contato c= new Contato (nome,numero);
          contatos.add(c);
    }
    public void imprime() {
       for(Contato c:contatos){
       
           System.out.println(c.toString());
         }
}
}
