/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author OSHIKURU
 */
public class Pizzaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Funcionario> fun1 = new ArrayList();
        ArrayList<Cliente>  clie1= new ArrayList();
        ArrayList<Pizza> pizz1 = new ArrayList();
        ArrayList<Pedido> ped1 = new ArrayList();
        
        
        Scanner obj = new Scanner(System.in);
        
        int opcao;
        do{
            System.out.println("---------------------------------------------------");
            System.out.println("------- MENU INICIAL ---------");
            System.out.println("1- Cadastrar pizzas");
            System.out.println("2- Cadastrar funcionarios");
            System.out.println("3- Cadastrar clientes");
            System.out.println("4- Emitir pedido");
            System.out.println("5- Mostrar Lista de Pedidos Cadastrados");
            System.out.println("6- Sair");
            opcao= obj.nextInt();
            
            switch(opcao){
                case 1: {
                        int opc = 0;
                        System.out.println("### CADASTRAR PIZZAS ###");
                    do {
                        Pizza pizza = new Pizza();
                        System.out.println("Digite o numero de item:");
                        int numeroDoItem = obj.nextInt();
                        pizza.setNumeroItem(numeroDoItem);
                    
                        System.out.println("Digite o nome:");
                        String nomePizza = obj.next();
                        pizza.setNome(nomePizza);
                        
                        System.out.println("Digite os igredientes:");
                        String igredientes = obj.next();
                        pizza.setIgredientes(igredientes);
                        
                        System.out.println("Digite o Preço:");
                        String precos = obj.next();
                        pizza.setPrecos(precos);
                        
                        pizz1.add(pizza);
                        
                        System.out.println("1- Adicionar  2- Sair");
                        opc = obj.nextInt();
                        
                        System.out.println("---------------------------------------------------");
                        
                    }while(opc != 2);  
                } break;
                
                
                case 2:{
                    int opc = 0;
                    System.out.println("+++ CADASTRAR FUNCIONARIO +++");
                    do{
                        Funcionario funcionario = new Funcionario();
                        System.out.println("Digite o numero de contrato do funcionario:");
                        int numeroContratoFun = obj.nextInt();
                        funcionario.setNumeroContrato(numeroContratoFun);
                        
                        System.out.println("Digite o nome do funcionario:");
                        String nomeFuncionario = obj.next();
                        funcionario.setNome(nomeFuncionario);
                        
                        System.out.println("Digite o numero de telefone do funcionario:");
                        int telefoneFuncionario = obj.nextInt();
                        funcionario.setTelefone(telefoneFuncionario);
                        
                        fun1.add(funcionario);
                        
                        System.out.println("1- Adicionar  2- Sair");
                        opc = obj.nextInt();
                        
                    System.out.println("---------------------------------------------------");
                    }while(opc != 2);
                }break;
                
                case 3:{ 
                    int opc=0;
                    System.out.println("--- CADASTRAR CLIENTES ---");
                    do{
                        
                       Cliente cliente = new Cliente();
                        System.out.println("Digite o numero de identificação do cliente:");
                        int numeroCliente = obj.nextInt();
                        cliente.setNif(numeroCliente);
                       
                       System.out.println("Digite o nome do Cliente:");
                       String nomeCliente = obj.next();
                       cliente.setNome(nomeCliente);
                       
                       System.out.println("Digite a morada do Cliente:");
                       String moradaCliente = obj.next();
                       cliente.setMorada(moradaCliente);
                       
                       System.out.println("Digite o telefone do Cliente:");
                       int telefoneDoCliente = obj.nextInt();
                       cliente.setTelefone(telefoneDoCliente);
                       
                       clie1.add(cliente);
                       
                        System.out.println("1- Adicionar  2- Sair");
                        opc = obj.nextInt();
                       
                        System.out.println("---------------------------------------------------");
                        
                    }while(opc != 2);
                    
                }break;
                
            
                case 4:{ 
                    int opc = 0;
                    do{
                       int numeroDePizzas = 0; 
                       int numeroDeClientes = 0; 
                       int numeroDeFuncionarios = 0;
                       int codigoPizza;
                       int codigoCliente;
                       int codigoFuncionario;
                       System.out.println("***Emitir Pedido****");
                       
                       Pedido pedido = new Pedido();
                        System.out.println("Digite o numero do pedido:");
                        int numeroDoPedido = obj.nextInt();
                        pedido.setNumero(numeroDoPedido);
                       
                        
                        
                        do{
                            System.out.println("Digite o numero de item da Pizza:");
                            codigoPizza = obj.nextInt();
                            for(int i = 0; i<pizz1.size(); i++){
                            if(pizz1.get(i).getNumeroItem()==codigoPizza){
                              numeroDePizzas++;
                                      }
                            }
                            
                            if(numeroDePizzas<1)
                                System.out.println("### Numero de item de pizza digitado não existe ###");
                                   
                            
                        }while(numeroDePizzas<1);
                        
                        do{
                            System.out.println("Digite o numero de identificação do Cliente:");
                            codigoCliente = obj.nextInt();
                            for(int i = 0; i<clie1.size(); i++){
                            if(clie1.get(i).getNif()==codigoCliente){
                                numeroDeClientes++;
                                    }
                            }
                            if(numeroDeClientes<1)
                                System.out.println("### Cliente não existe ###");
                        }while(numeroDeClientes<1);
                        
                        do{
                            System.out.println("Digite o numero de contrato do funcionario:");
                            codigoFuncionario = obj.nextInt();
                            for(int i = 0; i<fun1.size(); i++){
                            if(fun1.get(i).getNumeroContrato()==codigoFuncionario){
                                numeroDeFuncionarios++;
                                    }
                            }
                            if(numeroDeFuncionarios<1)
                                System.out.println("### Funcionario não existe ###");
                        }while(numeroDeFuncionarios<1);
                        
                        System.out.println("Digite a data da emissão do pedido:");
                        String dataPedido = obj.next();
                        pedido.setDataDeEmissao(dataPedido);
                        
                        pedido.setInformaçãoPizza(codigoPizza);
                        pedido.setInformaçãoCliente(codigoCliente);
                        pedido.setInformaçãoFuncionario(codigoFuncionario);
                        
                        ped1.add(pedido);
                        System.out.println("Pedido feito com sucesso");
                        
                        System.out.println("1- Adicionar  2- Sair");
                        opc = obj.nextInt();
                        
                        System.out.println("---------------------------------------------------");
                        
                   }while(opc != 2);
                   
                }break;
                
                case 5:{
                    
                    System.out.println("#*#*#* LISTA DE PEDIDOS #*#*#*");
                    
                    for(int i = 0; i<ped1.size(); i++){
                        
                        System.out.println("***********Pedido numero: "+ped1.get(i).getNumero());
                        System.out.println("**Data do Pedido: "+ped1.get(i).getDataDeEmissao());
                    
                        for(int j=0; j<pizz1.size(); j++){
                            if(pizz1.get(j).getNumeroItem()==ped1.get(i).getInformaçãoPizza()){
                                System.out.println("--Numero do item:" +pizz1.get(j).getNumeroItem());
                                System.out.println("--Nome da pizza:" +pizz1.get(j).getNome());
                                System.out.println("--Igredientes da pizza:" +pizz1.get(j).getIgredientes());
                                System.out.println("--Preço da pizza:" +pizz1.get(j).getPrecos());
                            }
                        }
                        
                        for(int k=0; k<clie1.size(); k++){
                            if(clie1.get(k).getNif()==ped1.get(i).getInformaçãoCliente()){
                                System.out.println("++Numero de identificação do cliente:" +clie1.get(k).getNif());
                                System.out.println("++Nome do cliente:" +clie1.get(k).getNome());
                                System.out.println("++Morada do cliente:" +clie1.get(k).getMorada());
                                System.out.println("++Numero de telefone do cliente:" +clie1.get(k).getTelefone());
                            }
                        }
                        
                        for(int m=0; m<fun1.size(); m++){
                            if(fun1.get(m).getNumeroContrato()==ped1.get(i).getInformaçãoFuncionario()){
                                System.out.println("**Numero do Contrato do funcionario:" +fun1.get(m).getNumeroContrato());
                                System.out.println("**Nome do funcionario:" +fun1.get(m).getNome());
                                System.out.println("**Numero do telefone do funcionario:" +fun1.get(m).getTelefone());
                              }
                        }
                    System.out.println("---------------------------------------------------");
                    }
                    System.out.println("######################################################################################");
                    
                    
                    
                }break;
                default:
            
            }
        
        }while(opcao!=6);
        
    }
    
}
