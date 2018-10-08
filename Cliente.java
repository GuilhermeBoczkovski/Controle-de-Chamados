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
public class Cliente extends Pessoa{

    public Cliente(){
    }
    
    public Cliente(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return super.getNome();
    }
    public int getCodigo(){
     return super.getCodigo();
    }
    
}
	 	  	  		      	     	      			       	 	
