/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio9;

/**
 *
 * @author IXMJ.S.T
 */
public class Rectangulo {
      private float lado1;
    private float lado2;
    private float area;
     private float perimetro;

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }
    

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    
    public Rectangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
       
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
     public void calcularArea (){
       area= lado1*lado2;
        System.out.println("A AREA DO RETANGULO E:"+area);
    }
    public void calcularPerimetro(){
      perimetro= 2*(lado1+lado2);
        System.out.println("PERIMETRO:"+perimetro);
    }
    
 
}
