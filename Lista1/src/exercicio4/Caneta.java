/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author IXMJ.S.T
 */
public class Caneta {
        private String marca;
        private String cor;
        private float tamanho;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public Caneta(String marca, String cor, float tamanho) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    

    @Override
    public String toString() {
        return "Caneta{" + "marca=" + marca + ", cor=" + cor + ", tamanho=" + tamanho +" mm"+ '}';
    }
    
        
}
