/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio10;

/**
 *
 * @author IXMJ.S.T
 */
public class Circulo {
    private double raio;
    private float area;
    private float perimetro;
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    

    public Circulo(double raio) {
        this.raio = raio;
    }
    
   public void calcularArea(){
           area=(float) (Math.PI* Math.pow(raio, 2));
           System.out.println("Area:"+area);
    }
    public void calcularPerimetro(){
       perimetro= (float)(2* Math.PI*raio);
        System.out.println("Perimetro: "+perimetro);
    }
   
    
    
}
