/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio12;

/**
 *
 * @author IXMJ.S.T
 */
public class Livro {
    private String titulo;
   private int qtdPaginas;
    private int paginasLidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public Livro(String titulo, int qtdPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", qtdPaginas=" + qtdPaginas + ", paginasLidas=" + paginasLidas + '}';
    }
    public void verificarProgresso(){
    
      float percentagem=((float)(this.paginasLidas/this.qtdPaginas))*100;
        System.out.println("Voce ja leu "+percentagem+" por cento do livro");
    }
    
}
