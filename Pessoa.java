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
public class Pessoa implements IPessoa {

    protected int codigo;
    protected String nome;

    @Override
    public int getCodigo(){
        return this.codigo;
    }

    @Override
    public String getNome(){
        return this.nome;
    }
    
}	 	  	  		      	     	      			       	 	
