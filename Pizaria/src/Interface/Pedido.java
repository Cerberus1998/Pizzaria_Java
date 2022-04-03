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
public class Pedido {
    private int numero;
    private String dataDeEmissao;
    private int informaçãoPizza;
    private int informaçãoCliente;
    private int informaçãoFuncionario;

    public Pedido() {
    }

    public Pedido(int numero, String dataDeEmissao, int informaçãoPizza, int informaçãoCliente, int informaçãoFuncionario) {
        this.numero = numero;
        this.dataDeEmissao = dataDeEmissao;
        this.informaçãoPizza = informaçãoPizza;
        this.informaçãoCliente = informaçãoCliente;
        this.informaçãoFuncionario = informaçãoFuncionario;
    }

    public String getDataDeEmissao() {
        return dataDeEmissao;
    }

    public void setDataDeEmissao(String dataDeEmissao) {
        this.dataDeEmissao = dataDeEmissao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getInformaçãoPizza() {
        return informaçãoPizza;
    }

    public void setInformaçãoPizza(int informaçãoPizza) {
        this.informaçãoPizza = informaçãoPizza;
    }

    public int getInformaçãoCliente() {
        return informaçãoCliente;
    }

    public void setInformaçãoCliente(int informaçãoCliente) {
        this.informaçãoCliente = informaçãoCliente;
    }

    public int getInformaçãoFuncionario() {
        return informaçãoFuncionario;
    }

    public void setInformaçãoFuncionario(int informaçãoFuncionario) {
        this.informaçãoFuncionario = informaçãoFuncionario;
    }
    
    
    
    
}
