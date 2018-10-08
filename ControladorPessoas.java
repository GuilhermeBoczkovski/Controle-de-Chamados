/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date 11/04/2016
 */

import java.util.ArrayList;
 
public class ControladorPessoas implements IControladorPessoas {

    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Tecnico> tecnicos = new ArrayList();

    /**
     *
     * @return retorna a lista de clientes
     */
    @Override
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }

    /**
     * 
     * @return retorna a lista de tecnicos
     */
    @Override
    public ArrayList<Tecnico> getTecnicos(){
        return this.tecnicos;
    }

    /**
     * Permite a inclusao de um novo cliente na lista de clientes
     * @param codigo codigo do Cliente
     * @param nome nome do Cliente
     * @return retorna o cliente inserido como um IPessoa
     */
    @Override
    public IPessoa incluiCliente(int codigo, String nome){	 	  	  		      	     	      			       	 	
        Cliente cliente = new Cliente(codigo, nome);
        this.clientes.add(cliente);
        return cliente;
    }

    /**
     * Permite a inclusao de um novo tecnico na lista de tecnicos
     * @param codigo codigo do tecnico
     * @param nome nome do tecnico
     * @return retorna o tecnico inserido como um IPessoa
     */
    @Override
    public IPessoa incluiTecnico(int codigo, String nome){
        Tecnico tecnico = new Tecnico(codigo, nome);
        this.tecnicos.add(tecnico);
        return tecnico;
    }
    
}