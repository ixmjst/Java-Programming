/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

/**
 *
 * @author IXMJ.S.T
 */
public class Cliente {
    
    private String nome;
    private String codigoCliente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Cliente(String nome, String codigoCliente) {
        this.nome = nome;
        this.codigoCliente = codigoCliente;
    }

    
    @Override
    public String toString() {
        return "Cliente{" + "nome: " + nome + ", codigoCliente: " + codigoCliente + '}';
    }
    
    
}
