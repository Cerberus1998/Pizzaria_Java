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
public class Funcionario {
    private int numeroContrato;
    private String nome;
    private int telefone;
    

    public Funcionario() {
    }

    public Funcionario(int numeroContrato, String nome, int telefone) {
        this.numeroContrato = numeroContrato;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    
    
   
    
    
}
