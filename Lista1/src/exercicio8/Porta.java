/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio8;

/**
 *
 * @author IXMJ.S.T
 */
public class Porta {
    private String cor;
    private int dimY;
    private int dimX;
    private int dimZ;
    private boolean aberta=false;

    public String getCor() {
        return cor;
    }


    public int getDimY() {
        return dimY;
    }

    public void setDimY(int dimY) {
        this.dimY = dimY;
    }

    public int getDimX() {
        return dimX;
    }

    public void setDimX(int dimX) {
        this.dimX = dimX;
    }

    public int getDimZ() {
        return dimZ;
    }

    public void setDimZ(int dimZ) {
        this.dimZ = dimZ;
    }

 


    public Porta(String cor, int dimY, int dimX, int dimZ) {
        this.cor = cor;
        this.dimY = dimY;
        this.dimX = dimX;
        this.dimZ = dimZ;
    }

    @Override
    public String toString() {
        return "Porta{" + "cor:" + cor + ", dimy: " + dimY + ", dimx: " + dimX + ", dimz: " + dimZ + ", aberta=" + aberta + '}';
    }
    
    
    public void open(){
    
    if(!(this.aberta)){this.aberta=true;System.out.println("Porta  aberta!");}
    else{System.out.println("Porta ja esta aberta!");}
    }
    public void close(){
    if (!(aberta)){System.out.println("Porta ja esta Fechada!");}
    else {aberta=false;System.out.println("Porta  Fechada!");}
    }
    
      public void Paint(String cor){
       this.cor=cor;
    }
    
   public void isOpen(){
    
        if(aberta){System.out.println("A porta esta aberta");}
        else{System.out.println("A porta esta fechada");}
    
    }
    
    
    
    
}
