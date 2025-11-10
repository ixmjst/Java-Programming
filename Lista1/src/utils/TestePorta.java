/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import exercicio8.Porta;
/**
 *
 * @author IXMJ.S.T
 */
public class TestePorta {
    public static void testeporta(){
      Porta porta=new Porta("Branca",2,5,4);
      porta.close();
      porta.open();
      porta.isOpen();
    
    }
}
