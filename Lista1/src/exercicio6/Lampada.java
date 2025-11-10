/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6;

/**
 *
 * @author IXMJ.S.T
 */
public class Lampada {
    private String tipo;
    private int voltagem;
    private String cor;
    private String marca;
    private double preco;
    private boolean status;
    private float potencia;



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
    

    public Lampada(String tipo, int voltagem, String cor, String marca, double preco, float potencia, boolean status) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.status=status;
    }

    @Override
    public String toString() {
        return "Lampada{" + "tipo=" + tipo + ", voltagem: " + voltagem + " V, cor=" + cor + ", marca=" + marca + ", preco: " + preco + " Kz, status=" + status + ", potencia:" + potencia +"W"+ '}';
    }

 
    
    public boolean acenderLampada(){
       if(!(this.status)){
        System.out.println("Lampada Acesa");
        return this.status=true;
       }
        System.out.println("A lampada já está acesa");
        return this.status=true;
       
    }
    public boolean desligarLampada(){
     
       if((this.status)){
           System.out.println("Lamapda Apagada");
             return this.status=false;
       }
        System.out.println("Lampada já está apagada ");
         return this.status=false;
      
    }
    
    public void estadoLampada(){
             String v= ((this.status))? "Acesa":"Apagada";
          System.out.println(v);
    }
    
            }
    
    

