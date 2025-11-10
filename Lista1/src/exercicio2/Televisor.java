/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author IXMJ.S.T
 */
public class Televisor {
    private int numeroCanal;
    private int volume;

    public Televisor(int numeroCanal, int  volume) {
        this.numeroCanal = numeroCanal;
       if (volume>=1 && volume<50){
        this.volume = volume;
    }
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumeroCanal() {
        return numeroCanal;
    }

    public void setNumeroCanal(int numeroCanal) {
        this.numeroCanal = numeroCanal;
    }

    @Override
    public String toString() {
        return "Televisor{" + "numeroCanal=" + numeroCanal + ", volume=" + volume + '}';
    }
    
     public void aumentarVolume(){
        if(this.volume<50){
          this.volume=this.volume+5;
         
        }
        else{System.out.println("Volume no Maximo");}
     }
     
       public void diminuirVolume(){
       this.volume=(this.volume>5)  ? this.volume=this.volume-5 : this.volume;
       if (this.volume<=5){System.out.println("Volume Minimo");}
     }
       
      public void trocarCanal(int numeroCanal){
      if(numeroCanal>=1 && numeroCanal<10){
          setNumeroCanal(numeroCanal);
      }
      
      }
       
       
    
    
}
