/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author OSHIKURU
 */
public class Pizza {
    private int numeroItem;
    private String nome;
    private String igredientes;
    private String precos;

    public Pizza() {
    }

    public Pizza(int numeroItem, String nome, String igredientes, String precos) {
        this.numeroItem = numeroItem;
        this.nome = nome;
        this.igredientes = igredientes;
        this.precos = precos;
    }

    public String getPrecos() {
        return precos;
    }

    public void setPrecos(String precos) {
        this.precos = precos;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIgredientes() {
        return igredientes;
    }

    public void setIgredientes(String igredientes) {
        this.igredientes = igredientes;
    }
    
    
}
