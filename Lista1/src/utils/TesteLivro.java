/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import exercicio12.Livro;
/**
 *
 * @author IXMJ.S.T
 */
public class TesteLivro {
    public static void testelivro(){
      
        Livro livroFavorito= new Livro("A Bela e o Corvo",300,60);
         livroFavorito.setTitulo("GAME OF THRONES");
         livroFavorito.setQtdPaginas(500);
         System.out.println("O livro"+livroFavorito.getTitulo()+" Possui "+livroFavorito.getQtdPaginas()+" paginas");
           livroFavorito.setPaginasLidas(50);
           livroFavorito.verificarProgresso();
            livroFavorito.setPaginasLidas(250);
            livroFavorito.verificarProgresso();
            
            
           
    
    
    }
    
}
